--1. Кураторы (Curators) 
--- Идентификатор (Id). Уникальный идентификатор куратора. 
--      Тип данных - int. 
--      Авто приращение. 
--      Не может содержать null-значения. 
--      Первичный ключ.
--- Имя (Name). 
--      Имя куратора. Тип данных - nvarchar(max). 
--      Не может содержать null-значения. 
--      Не может быть пустым. 
--- Фамилия (Surname). Фамилия куратора. 
--      Тип данных - nvarchar(max). 
--      Не может содержать null-значения.
--      Не может быть пустым. 

CREATE TABLE Curators(
Id INT IDENTITY NOT NULL PRIMARY KEY,
Name NVARCHAR(max) NOT NULL ,
Surname NVARCHAR(max) NOT NULL,

CONSTRAINT CK_Curators_Name CHECK(LEN(Name)>0),
CONSTRAINT CK_Curators_Surname CHECK(LEN(Surname)>0),
)

INSERT INTO Curators (Name, Surname) VALUES ('Gretchen', 'Hills');
INSERT INTO Curators (Name, Surname) VALUES ('Adrianna', 'Weimann');
INSERT INTO Curators (Name, Surname) VALUES ('Litzy', 'Blick');
INSERT INTO Curators (Name, Surname) VALUES ('Keira', 'Price');
INSERT INTO Curators (Name, Surname) VALUES ('Deja', 'Predovic');
INSERT INTO Curators (Name, Surname) VALUES ('Blaze', 'Powlowski');
INSERT INTO Curators (Name, Surname) VALUES ('Amya', 'Botsford');
INSERT INTO Curators (Name, Surname) VALUES ('Maxine', 'Tremblay');
INSERT INTO Curators (Name, Surname) VALUES ('Ulises', 'Veum');
INSERT INTO Curators (Name, Surname) VALUES ('Trinity', 'Kutch');

SELECT * FROM Curators

--2. Кафедры (Departments) 
--- Идентификатор (Id). Уникальный идентификатор кафедры. 
--      Тип данных - int.
--      Авто приращение. 
--      Не может содержать null-значения. 
--      Первичный ключ. 
--- Финансирование (Financing). Фонд финансирования кафедры. 
--      Тип данных - money. 
--      Не может содержать null-значения. 
--      Не может быть меньше 0. 
--      Значение по умолчанию - 0. 
--- Название (Name). Название кафедры.
-- 	Тип данных - nvarchar(100). 
--      Не может содержать null-значения. 
--      Не может быть пустым. 
--      Должно быть уникальным. 
--- Идентификатор факультета (FacultyId). Факультет, в состав которого входит кафедра. 
--      Тип данных - int. 
--      Не может содержать null-значения. 
--      Внешний ключ. 

CREATE TABLE Departments(
Id INT IDENTITY NOT NULL PRIMARY KEY,
Financing MONEY NOT NULL DEFAULT (0),
Name NVARCHAR(100) NOT NULL ,
FacultyId INT NOT NULL,

CONSTRAINT CK_Departments_Financing CHECK(Financing >= 0),
CONSTRAINT CK_Departments_Name CHECK(LEN(Name)>0),
CONSTRAINT UQ_Departments_Name UNIQUE (Name),
CONSTRAINT FK_Departments_FacultyId FOREIGN KEY (FacultyId) REFERENCES Faculties(Id),
)

INSERT INTO Departments(Financing,Name,FacultyId)
VALUES
(2000,'Кафедра архитектуры',1),
(700,'Кафедра градостроительства',1),
(1500,'Кафедра строительных конструкций',1),
(4000,'Кафедра энергетики',2),
(3700,'Кафедра информационных систем и технологий',3),
(1370,'Кафедра физики',4),
(1150,'Кафедра лингвистики и межкультурной коммуникации',5)

INSERT INTO Departments(Financing,Name,FacultyId)
VALUES(900,'Computer Science',7)

SELECT * FROM Departments

--3. Факультеты (Faculties) 
--- Идентификатор (Id). Уникальный идентификатор факультета. 
--      Тип данных - int. 
--      Авто приращение. 
--      Не может содержать null-значения. 
--      Первичный ключ. 
--- Финансирование (Financing). Фонд финансирования факультета. 
--      Тип данных - money. 
--      Не может содержать null-значения. 
--      Не может быть меньше 0. 
--      Значение по умолчанию - 0. 
--- Название (Name). Название факультета. 
--      Тип данных - nvarchar(100). 
--      Не может содержать null-значения. 
--      Не может быть пустым. 
--      Должно быть уникальным. 

CREATE TABLE Faculties(
Id int IDENTITY NOT NULL PRIMARY KEY,
Financing MONEY NOT NULL DEFAULT (0),
Name NVARCHAR(100) NOT NULL ,

CONSTRAINT CK_Faculties_Financing CHECK(Financing >= 0),
CONSTRAINT CK_Faculties_Name CHECK(LEN(Name)>0),
CONSTRAINT UQ_Faculties_Name UNIQUE (Name),
)

INSERT INTO Faculties(Name,Financing)
VALUES
('ИСА',1000),
('ИГЭС',800),
('ИЭУИС',1500),
('ИИЭСМ',2500),
('ИМОС',500)

SELECT * FROM Faculties

--4. Группы (Groups) 
--- Идентификатор (Id). Уникальный идентификатор группы. 
--      Тип данных - int. 
--      Авто приращение. 
--      Не может содержать null-значения. 
--      Первичный ключ. 
--- Название (Name). Название группы. 
--      Тип данных - nvarchar(10). 
--      Не может содержать null-значения. 
--      Не может быть пустым. 
--      Должно быть уникальным. 
--- Курс (Year). Курс (год) на котором обучается группа. 
--      Тип данных - int. 
--      Не может содержать null-значения. 
--      Должно быть в диапазоне от 1 до 5. 
--- Идентификатор кафедры (DepartmentId). Кафедра, в состав которой входит группа. 
--      Тип данных - int. 
--      Не может содержать null-значения. 
--      Внешний ключ. 

CREATE TABLE Groups(
Id int IDENTITY NOT NULL PRIMARY KEY ,
Name NVARCHAR (10) NOT NULL,
Year int NOT NULL,
DepartmentId INT NOT NULL,

CONSTRAINT CK_Groups_Name CHECK(LEN(Name)>0),
CONSTRAINT UQ_Groups_Name UNIQUE (Name),
CONSTRAINT CK_Groups_Year CHECK(Year BETWEEN 1 AND 5),
CONSTRAINT FK_Groups_DepartmentId FOREIGN KEY (DepartmentId) REFERENCES Departments(Id)
)

INSERT INTO Groups(Name,Year,DepartmentId)
VALUES
('B303',2,1),
('B211',4,2),
('H404',5,3),
('P107',1,4),
('N788',2,5),
('G416',4,6),
('U811',1,7),
('T322',5,4)

INSERT INTO Groups(Name,Year,DepartmentId)
VALUES('K800',5,8)

SELECT * FROM Groups

--5. Группы и кураторы (GroupsCurators) 
--- Идентификатор (Id). Уникальный идентификатор группы и куратора. 
--      Тип данных - int. 
--      Авто приращение. 
--      Не может содержать null-значения. 
--      Первичный ключ. 
--- Идентификатор куратора (CuratorId). Куратор. 
--      Тип данных - int. 
--      Не может содержать null-значения. 
--      Внешний ключ. 
--- Идентификатор группы (GroupId). Группа. 
--      Тип данных - int. 
--      Не может содержать null-значения. 
--      Внешний ключ. 

CREATE TABLE GroupsCurators(
Id int IDENTITY NOT NULL PRIMARY KEY ,
CuratorId INT NOT NULL,
GroupId INT NOT NULL,

CONSTRAINT FK_GroupsCurators_CuratorId FOREIGN KEY (CuratorId) REFERENCES Curators(Id),
CONSTRAINT FK_GroupsCurators_GroupId FOREIGN KEY (GroupId) REFERENCES Groups(Id)
)
INSERT INTO GroupsCurators(CuratorId,GroupId)
VALUES
(1,3),
(2,4),
(3,2),
(4,8),
(5,7),
(6,5),
(7,6)

SELECT * FROM GroupsCurators

--6. Группы и лекции (GroupsLectures) 
--- Идентификатор (Id). Уникальный идентификатор группы и лекции. 
--      Тип данных - int. 
--      Авто приращение. 
--      Не может содержать null-значения. 
--      Первичный ключ. 
--- Идентификатор группы (GroupId). Группа. 
--      Тип данных - int. 
--      Не может содержать null-значения. 
--      Внешний ключ. 
--- Идентификатор лекции (LectureId). Лекция. 
--      Тип данных - int. 
--      Не может содержать null-значения. 
--      Внешний ключ. 

CREATE TABLE GroupsLectures(
Id int IDENTITY NOT NULL PRIMARY KEY ,
GroupId INT NOT NULL,
LectureId INT NOT NULL,

CONSTRAINT FK_GroupsLectures_GroupId FOREIGN KEY (GroupId) REFERENCES Groups(Id),
CONSTRAINT FK_GroupsLectures_LectureId FOREIGN KEY (LectureId) REFERENCES Lectures(Id)
)

INSERT INTO GroupsLectures(GroupId,LectureId)
VALUES
(4,2),
(2,5),
(6,1),
(7,3),
(3,4)

INSERT INTO GroupsLectures VALUES (5,8)
INSERT INTO GroupsLectures VALUES (1,9)

SELECT * FROM GroupsLectures

--7. Лекции (Lectures) 
--- Идентификатор (Id). Уникальный идентификатор лекции. 
--      Тип данных - int. 
--      Авто приращение. 
--      Не может содержать null-значения. 
--      Первичный ключ. 
--- Аудитория (LectureRoom). Аудитория в которой читается лекция. 
--      Тип данных - nvarchar(max). 
--      Не может содержать null-значения. 
--      Не может быть пустым. 
--- Идентификатор дисциплины (SubjectId). Дисциплина, по которой читается лекция. 
--      Тип данных - int. 
--      Не может содержать null-значения. 
--      Внешний ключ. 
--- Идентификатор преподавателя (TeacherId). Преподаватель, который читает лекцию. 
--      Тип данных - int. 
--      Не может содержать null-значения. 
--      Внешний ключ. 

CREATE TABLE Lectures(
Id int IDENTITY NOT NULL PRIMARY KEY ,
LectureRoom NVARCHAR(max) NOT NULL ,
SubjectId INT NOT NULL,
TeacherId INT NOT NULL,

CONSTRAINT CK_Lectures_LectureRoom CHECK(LEN(LectureRoom)>0),
CONSTRAINT FK_Lectures_SubjectId FOREIGN KEY (SubjectId) REFERENCES Subjects(Id),
CONSTRAINT FK_Lectures_TeacherId FOREIGN KEY (TeacherId) REFERENCES Teachers(Id)
)

INSERT INTO Lectures(LectureRoom, SubjectId, TeacherId) 
VALUES
('B103', 6, 1),
('B110', 4, 7),
('B102', 2, 4),
('B101', 8, 6),
('B105',7, 2)

INSERT INTO Lectures
VALUES ('B121',9,11)

INSERT INTO Lectures
VALUES('B114',11,8)

SELECT * FROM Lectures

--8. Дисциплины (Subjects) 
--- Идентификатор (Id). Уникальный идентификатор дисциплины. 
--      Тип данных - int. 
--      Авто приращение. 
--      Не может содержать null-значения. 
--      Первичный ключ. 
--- Название (Name). Название дисциплины. 
--      Тип данных - nvarchar(100). 
--      Не может содержать null-значения. 
--      Не может быть пустым. 
--      Должно быть уникальным. 

CREATE TABLE Subjects(
Id int IDENTITY NOT NULL PRIMARY KEY ,
Name NVARCHAR(100) NOT NULL ,

CONSTRAINT CK_Subjects_Name CHECK(LEN(Name)>0),
CONSTRAINT UQ_Subjects_Name UNIQUE (Name),
)

INSERT INTO Subjects(Name)
VALUES
('Строительные материалы и изделия'),
('Металлические конструкции'),
('Железобетонные конструкции'),
('Градостроительство'),
('Основы строительных конструкций'),
('Автоматизация инженерных систем'),
('Экономика строительства'),
('Математика'),
('Химия'),
('Физика')


SELECT * FROM Subjects

--9. Преподаватели (Teachers) 
--- Идентификатор (Id). Уникальный идентификатор преподавателя. 
--      Тип данных - int. 
--      Авто приращение. 
--      Не может содержать null-значения. 
--      Первичный ключ. 
--- Имя (Name). Имя преподавателя. 
--      Тип данных - nvarchar(max). 
--      Не может содержать null-значения. 
--      Не может быть пустым. 
--- Ставка (Salary). Ставка преподавателя. 
--      Тип данных - money. 
--      Не может содержать null-значения. 
--      Не может быть меньше либо равно 0. 
--- Фамилия (Surname). Фамилия преподавателя. 
--      Тип данных - nvarchar(max). 
--      Не может содержать null-значения. 
--      Не может быть пустым.

CREATE TABLE Teachers(
Id int IDENTITY NOT NULL PRIMARY KEY ,
Name NVARCHAR(max) NOT NULL ,
Surname NVARCHAR(max) NOT NULL ,
Salary MONEY NOT NULL,

CONSTRAINT CK_Teachers_Name CHECK(LEN(Name)>0),
CONSTRAINT CK_Teachers_Surname CHECK(LEN(Surname)>0),
CONSTRAINT CK_Teachers_Salary CHECK(Salary>=0),
)

INSERT INTO Teachers (Name, Surname,Salary) VALUES ('Ferne', 'Schumm',700);
INSERT INTO Teachers (Name, Surname,Salary) VALUES ('Hershel', 'Kemmer',1000);
INSERT INTO Teachers (Name, Surname,Salary) VALUES ('Krystel', 'Kuhlman',1500);
INSERT INTO Teachers (Name, Surname,Salary) VALUES ('Antwon', 'Romaguera',2500);
INSERT INTO Teachers (Name, Surname,Salary) VALUES ('Tyrique', 'Johnston',650);
INSERT INTO Teachers (Name, Surname,Salary) VALUES ('Harmon', 'Grant-Wisozk',900);
INSERT INTO Teachers (Name, Surname,Salary) VALUES ('Brando', 'Fay',2100);
INSERT INTO Teachers (Name, Surname,Salary) VALUES ('Missouri', 'Price',4000);
INSERT INTO Teachers (Name, Surname,Salary) VALUES ('Tess', 'King',1100);
INSERT INTO Teachers (Name, Surname,Salary) VALUES ('Milo', 'D''Amore',810);

SELECT * FROM Teachers

--Запросы 
--1. Вывести все возможные пары строк преподавателей и групп. 

SELECT Teachers.Name,Teachers.Surname,Groups.Name
FROM Teachers
JOIN Lectures ON Teachers.Id=Lectures.TeacherId
JOIN GroupsLectures ON Lectures.Id=GroupsLectures.GroupId
JOIN Groups ON GroupsLectures.GroupId=Groups.Id

--2. Вывести названия факультетов, фонд финансирования кафедр которых превышает фонд финансирования факультета. 

SELECT Faculties.Name
FROM Faculties
WHERE Faculties.Financing<(SELECT MAX(Departments.Financing)FROM Departments WHERE Departments.FacultyId=Faculties.Id)

--3. Вывести фамилии кураторов групп и названия групп, которые они курируют. 

SELECT Curators.Surname,Groups.Name
FROM Curators
JOIN GroupsCurators ON Curators.Id=GroupsCurators.CuratorId
Join Groups ON GroupsCurators.GroupId=Groups.Id

--4. Вывести имена и фамилии преподавателей, которые читают лекции у группы “P107”. 

SELECT Teachers.Name,Teachers.Surname
FROM Teachers
JOIN Lectures ON Lectures.TeacherId=Teachers.Id
JOIN GroupsLectures ON Lectures.Id=GroupsLectures.LectureId
JOIN Groups ON GroupsLectures.GroupId=Groups.Id
WHERE Groups.Name LIKE 'P107'
 
--5. Вывести фамилии преподавателей и названия факультетов на которых они читают лекции. 

SELECT DISTINCT Teachers.Surname,Faculties.Name
FROM Teachers
JOIN Lectures ON Lectures.TeacherId=Teachers.Id
JOIN Subjects ON Lectures.SubjectId=Subjects.Id
JOIN GroupsLectures ON Lectures.Id=GroupsLectures.LectureId
JOIN Groups ON GroupsLectures.GroupId=Groups.Id
JOIN Departments ON Groups.DepartmentId=Departments.Id
JOIN Faculties ON Departments.FacultyId=Faculties.Id

--6. Вывести названия кафедр и названия групп, которые к ним относятся. 

SELECT Departments.Name,Groups.Name
FROM Departments
JOIN Groups ON Groups.DepartmentId=Departments.Id

--7. Вывести названия дисциплин, которые читает преподаватель “Samantha Adams”. 

INSERT INTO Teachers(Name,Surname,Salary)
VALUES('Samantha','Adams',650)

SELECT Subjects.Name
FROM Subjects
JOIN Lectures ON Lectures.SubjectId=Subjects.Id
JOIN Teachers ON Lectures.TeacherId=Teachers.Id
WHERE Teachers.Name LIKE 'Samantha' AND Teachers.Surname LIKE 'Adams'

--8. Вывести названия кафедр, на которых читается дисциплина “Database Theory”. 

INSERT INTO Subjects
VALUES('Database Theory')

SELECT Departments.Name
FROM Departments
JOIN Groups ON Groups.DepartmentId=Departments.Id
JOIN GroupsLectures ON GroupsLectures.GroupId=Groups.Id
JOIN Lectures ON GroupsLectures.LectureId=Lectures.Id
JOIN Subjects ON Lectures.SubjectId=Subjects.Id
WHERE Subjects.Name LIKE 'Database Theory'

--9. Вывести названия групп, которые относятся к факультету “Computer Science”. 

INSERT INTO Faculties (Financing,Name)
VALUES(1700,'Computer Science')

SELECT Groups.Name
FROM Groups
JOIN Departments ON Groups.DepartmentId=Departments.Id
JOIN Faculties ON Departments.FacultyId=Faculties.Id
WHERE Faculties.Name LIKE 'Computer Science'

--10. Вывести названия групп 5-го курса, а также название факультетов, к которым они относятся. 

SELECT Groups.Name,Faculties.Name
FROM Groups
JOIN Departments ON Groups.DepartmentId=Departments.Id
JOIN Faculties ON Departments.FacultyId=Faculties.Id
WHERE Groups.Year=5

--11. Вывести полные имена преподавателей и лекции, которые они читают (названия дисциплин и групп), причем отобрать только те лекции, которые читаются в аудитории “B103”.

SELECT Teachers.Name,Teachers.Surname,Subjects.Name,Groups.Name
FROM Teachers
JOIN Lectures ON Lectures.TeacherId=Teachers.Id
JOIN Subjects ON Lectures.SubjectId=Subjects.Id
JOIN GroupsLectures ON Lectures.Id=GroupsLectures.LectureId
JOIN Groups ON GroupsLectures.GroupId=Groups.Id
WHERE Lectures.LectureRoom LIKE 'B103'