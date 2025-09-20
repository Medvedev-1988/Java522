--1. Работа со строками

--Создай запрос, который выведет все книги (Books), в названии (Title) которых:

--начинается с буквы 'F'

--заканчивается на букву 'd'

--и при этом длина названия больше 10 символов.
--(Подсказка: используйте LEFT, RIGHT, LEN и WHERE вместе).

INSERT INTO books(Name) VALUES ('Fantomworked')

SELECT books.Name
FROM books
WHERE LEFT(Name,1)='F' AND RIGHT(Name,1)='d' AND LEN(Name)>10

--2. Работа с датами

--Напиши запрос, который выведет текущую дату + время и дополнительно:

SELECT GETDATE()

--через 100 дней от сегодня,

SELECT DATEADD(DAY,100,GETDATE())

--последний день текущего месяца,

SELECT EOMONTH(GETDATE())

--сколько осталось дней до 1 января следующего года.

SELECT DATEDIFF(DAY,GETDATE(),DATEFROMPARTS(2026,1,1))

--(Подсказка: DATEADD, EOMONTH, DATEDIFF).

--3. Работа с числами

--Напиши функцию SquareRootOrZero(@num INT), которая:

--возвращает квадратный корень, если число положительное,

--возвращает 0, если число отрицательное или равно нулю.

--(Подсказка: IF внутри функции, SQRT).

CREATE FUNCTION SquareRootOrZero (@num INT)
RETURNS FLOAT
AS
BEGIN
    IF @num > 0
    BEGIN
        RETURN SQRT(@num);
    END
    ELSE
    BEGIN
        RETURN 0;
    END
    RETURN 0;
END;

SELECT dbo.SquareRootOrZero(25);

--4. Переменные и условия

--Создай скрипт, где:

--переменная @salary = 2000,

--переменная @bonus = 15 (%),

--если зарплата меньше 3000 → выведи итоговую зарплату с бонусом,

--иначе → выведи текст "Достаточно высокая зарплата".

--(Подсказка: IF…ELSE, PRINT).

DECLARE @salary FLOAT = 2000
DECLARE @bonus_percent FLOAT = 15
DECLARE @bonus FLOAT = (@salary/100) * @bonus_percent

IF @salary < 3000
  BEGIN
   PRINT @salary + @bonus 
  END
ELSE
  BEGIN
  PRINT 'Достаточно высокая зарплата'
  END

--5. Цикл и функция

--Напиши табличную функцию MultiplyTable(@num INT),
--которая возвращает таблицу с колонками:

--Number (само число),
 
--Result (произведение).

--Пример вызова:
--SELECT * FROM dbo.MultiplyTable(5);


--1  5 5
--2  5 10
--3  5 15
--4  5 20
--5  5 25
--6  5 30
--7  5 35
--8  5 40
--9  5 45
--10 5 50

--CREATE FUNCTION TablicaUmnojenii(@num INT)
--RETURNS @result TABLE(Count INT,Number INT,Result INT)
--AS
--BEGIN
--       //

        
--		RETURN 
--END
DROP FUNCTION  TablicaUmnojenii
CREATE FUNCTION TablicaUmnojenii(@num INT)
RETURNS @result TABLE(Count INT,Number INT,Result INT)
AS 
BEGIN
DECLARE @COUNT INT = 1;
WHILE @COUNT <= 10
BEGIN
INSERT INTO @result (Count,Number,Result) 
VALUES(@COUNT,@num,@COUNT * @num);
SET @COUNT=@COUNT+1;
END
RETURN
END
SELECT * FROM dbo.TablicaUmnojenii(5);