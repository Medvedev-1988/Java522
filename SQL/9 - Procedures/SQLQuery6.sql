--1. Задачи на функции
--Функция 1. Возведение числа в четвёртую степень

--Создай функцию InFourthPower(@num INT), которая возвращает число в 4-й степени
--SELECT dbo.InFourthPower(3)  -- должно вернуть 81

--CREATE FUNCTION InFourthPower(@num INT)
--RETURNS INT
--AS
--BEGIN
--   DECLARE @result INT;
--   SET @result=@num*@num*@num*@num
--   RETURN @result;
--END;

--SELECT dbo.InFourthPower(3)

--Функция 2. Проверка чётности числа 
--Создай функцию IsEven(@num INT), которая возвращает 1, если число чётное, и 0, если нечётное.
--SELECT dbo.IsEven(10)  -- 1
--SELECT dbo.IsEven(7)   -- 0

--CREATE FUNCTION IsEven(@num INT)
--RETURNS INT
--AS
--BEGIN
--RETURN CASE WHEN (@num % 2) = 0 THEN 1 ELSE 0 END;
--END;

--SELECT dbo.IsEven(10)
--SELECT dbo.IsEven(7)

--Функция 3. Табличная функция с квадратами и корнями

--Создай функцию NumbersInfo(@num INT), которая возвращает таблицу с числами от 1 до @num, где у каждого числа:

--Number — само число 
--Square — квадрат числа 
--Sqrt — квадратный корень

--SELECT * FROM dbo.NumbersInfo(10)

--CREATE FUNCTION NumbersInfo(@num INT)
--RETURNS @result TABLE(Number INT,Square INT,Sqrt FLOAT)
--AS
--BEGIN
--   DECLARE @COUNT INT=1;
--   WHILE @COUNT<=@num
-- BEGIN
--    INSERT INTO @result(Number,Square,Sqrt) VALUES(@COUNT,@COUNT*@COUNT,Sqrt(@COUNT))
--    SET @COUNT=@COUNT+1;
-- END
--   RETURN
--END

--SELECT * FROM dbo.NumbersInfo(10)

--Процедура 1. Добавление книги

--Создай процедуру AddBook(@Title NVARCHAR(50)), которая вставляет новую книгу в таблицу Books.
--Если название не указано, по умолчанию вставляй "Без названия".

--CREATE PROCEDURE AddBook @name NVARCHAR(50) = 'Без названия'
--AS
--BEGIN
--   INSERT INTO books(Name) VALUES(@name)
--END

--EXECUTE AddBook 

--SELECT * FROM books

--WHERE books.Name LIKE 'Без названия'

--Процедура 2. Увеличение зарплаты
--Создай процедуру IncreaseSalary(@Id INT, @Percent FLOAT), которая увеличивает зарплату сотрудника с заданным Id на @Percent.

--CREATE TABLE Employee(
--Id INT IDENTITY PRIMARY KEY NOT NULL,
--Name NVARCHAR(20) NOT NULL,
--Salary MONEY NOT NULL
--)

--INSERT INTO Employee(Name,Salary)
--VALUES
--('Dima',500),
--('Tamara',600),
--('Sasha',300),
--('Oleg',450)

--SELECT * FROM Employee

--CREATE PROCEDURE IncreaseSalary(@Id INT, @Percent FLOAT)
--AS
--  BEGIN
--  DECLARE @add FLOAT=0;
--   UPDATE Employee
--   SET Salary = Salary +((Salary/100)* @Percent)
--   WHERE Id = @Id
--  END

--EXECUTE IncreaseSalary 4,5

--Процедура 3. Генерация календаря выплат 
--Создай процедуру GetPayments(@amount INT = 1000, @months INT = 12, @startDate DATE = NULL), которая возвращает таблицу:

--Date — дата выплаты (каждый месяц), 
--Amount — сумма выплаты. 
--Если @startDate не указан — использовать текущую дату.

--DROP PROCEDURE GetPayments
--CREATE PROCEDURE GetPayments @amount INT = 1000, @months INT = 12, @startDate DATE = NULL
--AS
--BEGIN
--   IF @startDate IS NULL
--   SET @startDate=GETDATE()

--   DECLARE @results TABLE(Date DATE,Amount INT)
--   DECLARE @COUNT INT = 1;
--   WHILE @COUNT <= @months
-- BEGIN
--   SET @startDate=DATEADD(MONTH,1,@startDate)
--   INSERT INTO @results(Date,Amount) VALUES(@startDate,@amount)
--   SET @COUNT=@COUNT+1
-- END
--   SELECT Date,Amount FROM @results
--END

--EXECUTE GetPayments

--3. Задачи на триггеры
--Триггер 1. Архивирование сотрудников при удалении 
--Создай триггер MoveEmployeeToArchive на таблицу Employee, который при удалении сотрудника переносит его в таблицу EmployeeArchive.

--CREATE TABLE  EmployeeArchive(
--Id INT NOT NULL,
--Name NVARCHAR(20) NOT NULL,
--Salary MONEY NOT NULL,
--IsActive INT DEFAULT (1),
--DeletedDate DATETIME DEFAULT GETDATE()
--)

--CREATE TRIGGER MoveEmployeeToArchive
--ON Employee
--AFTER DELETE
--AS
--BEGIN
--INSERT INTO EmployeeArchive(Id,Name,Salary)
--SELECT Id,Name,Salary FROM deleted
--END

--INSERT INTO Employee VALUES('OK',500)

--DELETE FROM Employee WHERE Id=5

--SELECT * FROM Employee
--SELECT * FROM EmployeeArchive

--Триггер 2. Запрет обновления названия книги
--Создай триггер PreventBookTitleUpdate на таблицу Books, который не даёт менять поле Title.
--Если попытка обновить — выдавать ошибку.

--DROP TRIGGER PreventBookTitleUpdate

--UPDATE books
--SET Name = 'sdad'

--CREATE TRIGGER PreventBookTitleUpdate
--ON Books
--AFTER UPDATE
--AS
--BEGIN
--    IF UPDATE(Name)  
--    BEGIN
        
--        RAISERROR('Изменение названия книги запрещено.', 16, 1);
       
--        ROLLBACK TRANSACTION;
--        RETURN;
--    END
--END;


--Триггер 3. Мягкое удаление машин
--Создай триггер SoftDeleteCar на таблицу Car, который вместо удаления ставит колонку IsDeleted = 1.

CREATE TABLE Car(
Id INT PRIMARY KEY IDENTITY,
Name NVARCHAR (10) NOT NULL,
IsDeleted INT DEFAULT (0)
)

INSERT INTO Car(Name) VALUES('BMW'),('Mercedes'),('Audi'),('Honda')

CREATE TRIGGER SoftDeleteCar
ON Car
INSTEAD OF DELETE
AS
BEGIN
   UPDATE Car
   SET IsDeleted = 1
   WHERE Id IN (SELECT Id FROM deleted);
END

DELETE Car
WHERE Car.Id= 3

SELECT * FROM Car