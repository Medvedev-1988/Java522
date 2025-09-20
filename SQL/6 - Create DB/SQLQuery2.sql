--Таблицы

--1. Кафедры (Departments)

--- Идентификатор (Id). Уникальный идентификатор кафедры.

--Тип данных — int.

--Авто приращение.

--Не может содержать null-значения.

--Первичный ключ

--- Финансирование (Financing). Фонд финансирования кафедры.

--Тип данных — money.

--Не может содержать null-значения.

--Не может быть меньше 0.

--Значение по умолчанию — 0.

--- Название (Name). Название кафедры.

--Тип данных — nvarchar(100).

--Не может содержать null-значения.

--Не может быть пустым.

--Должно быть уникальным.

CREATE TABLE Departments(
Id int IDENTITY (1,1) NOT NULL PRIMARY KEY,
Name NVARCHAR(100) NOT NULL UNIQUE CHECK (LEN(Name)>0),
Financing money NOT NULL CHECK(Financing >=0) DEFAULT (0)
)

SELECT * FROM Departments

--2. Факультеты (Faculties)

--- Идентификатор (Id). Уникальный идентификатор факультета.

--Тип данных — int.

--Авто приращение.

--Не может содержать null-значения.

--Первичный ключ.

--- Декан (Dean). Декан факультета.

--Тип данных — nvarchar(max).

--Не может содержать null-значения.

--Не может быть пустым.

--- Название (Name). Название факультета.

--Тип данных — nvarchar(100).

--Не может содержать null-значения.

--Не может быть пустым.

--Должно быть уникальным.

CREATE TABLE Faculties(
Id int IDENTITY(1,1) PRIMARY KEY NOT NULL,
Name NVARCHAR (100) NOT NULL CHECK(LEN(Name)>0) UNIQUE,
Dean NVARCHAR (max) NOT NULL CHECK(LEN(Dean)>0)
)

SELECT * FROM Faculties

--3. Группы (Groups)

--- Идентификатор (Id). Уникальный идентификатор группы.

--Тип данных — int.

--Авто приращение.

--Не может содержать null-значения.

--Первичный ключ.

--- Название (Name). Название группы.

--Тип данных — nvarchar(10).

--Не может содержать null-значения.

--Не может быть пустым.

--Должно быть уникальным.

--- Рейтинг (Rating). Рейтинг группы.

--Тип данных — int.

--Не может содержать null-значения.

--Должно быть в диапазоне от 0 до 5.

--- Курс (Year). Курс (год) на котором обучается группа.

--Тип данных — int.

--Не может содержать null-значения.

--Должно быть в диапазоне от 1 до 5.

CREATE TABLE Groups(
Id int IDENTITY(1,1) PRIMARY KEY NOT NULL,
Name NVARCHAR (10) NOT NULL CHECK(LEN(Name)>0) UNIQUE,
Rating int NOT NULL CHECK(Rating BETWEEN 0 and 5),
Year int NOT NULL CHECK(Year BETWEEN 1 AND 5)
)

SELECT * FROM Groups

--4. Преподаватели (Teachers)

--- Идентификатор (Id). Уникальный идентификатор преподавателя.

--Тип данных — int.

--Авто приращение.

--Не может содержать null-значения.

--Первичный ключ.

--- Дата трудоустройства (EmploymentDate). Дата приема преподавателя на работу.

--Тип данных — date. ▷ Не может содержать null-значения.

--Не может быть меньше 01.01.1990.

--- Ассистент (IsAssistant). Является ли преподаватель ассистентом.

--Тип данных — bit.

--Не может содержать null-значения.

--Значение по умолчанию — 0.

--- Профессор (IsProfessor). Является ли преподаватель профессором.

--Тип данных — bit.

--Не может содержать null-значения.

--Значение по умолчанию — 0.

--- Имя (Name). Имя преподавателя.

--Тип данных — nvarchar(max).

--Не может содержать null-значения.

--Не может быть пустым.

--- Должность (Position). Должность преподавателя.

--Тип данных — nvarchar(max).

--Не может содержать null-значения.

--Не может быть пустым.

--- Надбавка (Premium). Надбавка преподавателя.

--Тип данных — money.

--Не может содержать null-значения

--Не может быть меньше 0.

--Значение по умолчанию — 0.

--- Ставка (Salary). Ставка преподавателя.

--Тип данных — money.

--Не может содержать null-значения.

--Не может быть меньше либо равно 0.

--- Фамилия (Surname). Фамилия преподавателя.

--Тип данных — nvarchar(max).

--Не может содержать null-значения.

--Не может быть пустым.

CREATE TABLE Teachers(
Id int IDENTITY(1,1) PRIMARY KEY NOT NULL,
EmploymentDate Date NOT NULL CHECK(EmploymentDate > '1990-01-01'),
IsAssistant BIT NOT NULL DEFAULT (0),
IsProfessor BIT NOT NULL DEFAULT (0),
Name NVARCHAR (max) NOT NULL CHECK(LEN(Name)>0),
Surname NVARCHAR (max) NOT NULL CHECK(LEN(Surname)>0),
Position NVARCHAR (max) NOT NULL CHECK(LEN(Position)>0),
Premium MONEY NOT NULL CHECK(Premium>=0) DEFAULT (0),
Salary  MONEY NOT NULL CHECK(Salary>=0),
)

DELETE Teachers

SELECT * FROM Teachers

--Задания

--1. Вывести таблицу кафедр, но расположить ее поля в обратном порядке.

SELECT Financing,Name,Id 
FROM Departments 

--2. Вывести названия групп и их рейтинги, используя в качестве названий выводимых полей “Group Name” и “Group Rating” соответственно.

SELECT Name AS 'Group Name',Rating AS 'Group Rating'
FROM Groups

--3. Вывести для преподавателей их фамилию, процент ставки по отношению к надбавке и процент ставки по отношению к зарплате (сумма ставки и надбавки).

SELECT Surname,Salary,Premium,
CASE 
WHEN Premium=0 THEN NULL
ELSE (Salary*100)/Premium
END AS 'процент ставки по отношению к надбавке',
CASE 
WHEN (Salary + Premium)=0 THEN NULL
ELSE (Salary*100)/(Salary+Premium)
END AS 'процент ставки по отношению к зарплате '
FROM Teachers
WHERE IsProfessor = 1

--4. Вывести таблицу факультетов в виде одного поля в следующем формате: “The dean of faculty [faculty] is [dean].”.

SELECT 'The dean of faculty ' + Name + ' is ' + Dean
FROM Faculties

--5. Вывести фамилии преподавателей, которые являются профессорами и ставка которых превышает 1050.

SELECT Surname,IsProfessor,Salary
FROM Teachers
WHERE IsProfessor = 1 AND Salary > 1050

--6. Вывести названия кафедр, фонд финансирования которых меньше 11000 или больше 25000.

SELECT Name,Financing
FROM Departments
WHERE Financing < 11000 OR Financing > 25000

--7. Вывести названия факультетов кроме факультета “Computer Science”.

SELECT Name
FROM Faculties
WHERE Name NOT LIKE 'Computer Science'

--8. Вывести фамилии и должности преподавателей, которые не являются профессорами.

SELECT Surname,Position,IsProfessor
FROM Teachers
WHERE IsProfessor = 0

--9. Вывести фамилии, должности, ставки и надбавки ассистентов, у которых надбавка в диапазоне от 160 до 550.

SELECT Surname,Position,Salary,Premium
FROM Teachers
WHERE IsAssistant=1 AND Premium BETWEEN 160 AND 550

--10.Вывести фамилии и ставки ассистентов.

SELECT Surname,Position,Salary
FROM Teachers
WHERE IsAssistant=1 

--11.Вывести фамилии и должности преподавателей, которые были приняты на работу до 01.01.2000.

SELECT Surname,Position,EmploymentDate
FROM Teachers
WHERE EmploymentDate < '2000-01-01'

--12.Вывести названия кафедр, которые в алфавитном порядке располагаются до кафедры “Software Development”. Выводимое поле должно иметь название “Name of Department”.

SELECT Name AS 'Name of Department'
FROM Departments
WHERE Name < 'Software Development'


--13.Вывести фамилии ассистентов, имеющих зарплату (сумма ставки и надбавки) не более 1200.

SELECT Surname,Salary,Premium,Salary + Premium AS 'Зарплата'
FROM Teachers
WHERE IsAssistant = 1 AND (Salary + Premium) < 1200

--14.Вывести названия групп 5-го курса, имеющих рейтинг в диапазоне от 2 до 4.

SELECT Name,Rating,Year
FROM Groups
WHERE Year = 5 AND Rating BETWEEN 2 AND 4

--15.Вывести фамилии ассистентов со ставкой меньше 550 или надбавкой меньше 200.

SELECT Surname,Salary,Premium
FROM Teachers
WHERE Salary < 550 OR Premium < 200