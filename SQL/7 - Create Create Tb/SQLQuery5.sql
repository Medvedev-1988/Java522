--1. �������� (Curators) 
--- ������������� (Id). ���������� ������������� ��������. 
--      ��� ������ - int. 
--      ���� ����������. 
--      �� ����� ��������� null-��������. 
--      ��������� ����.
--- ��� (Name). 
--      ��� ��������. ��� ������ - nvarchar(max). 
--      �� ����� ��������� null-��������. 
--      �� ����� ���� ������. 
--- ������� (Surname). ������� ��������. 
--      ��� ������ - nvarchar(max). 
--      �� ����� ��������� null-��������.
--      �� ����� ���� ������. 

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

--2. ������� (Departments) 
--- ������������� (Id). ���������� ������������� �������. 
--      ��� ������ - int.
--      ���� ����������. 
--      �� ����� ��������� null-��������. 
--      ��������� ����. 
--- �������������� (Financing). ���� �������������� �������. 
--      ��� ������ - money. 
--      �� ����� ��������� null-��������. 
--      �� ����� ���� ������ 0. 
--      �������� �� ��������� - 0. 
--- �������� (Name). �������� �������.
-- 	��� ������ - nvarchar(100). 
--      �� ����� ��������� null-��������. 
--      �� ����� ���� ������. 
--      ������ ���� ����������. 
--- ������������� ���������� (FacultyId). ���������, � ������ �������� ������ �������. 
--      ��� ������ - int. 
--      �� ����� ��������� null-��������. 
--      ������� ����. 

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
(2000,'������� �����������',1),
(700,'������� ������������������',1),
(1500,'������� ������������ �����������',1),
(4000,'������� ����������',2),
(3700,'������� �������������� ������ � ����������',3),
(1370,'������� ������',4),
(1150,'������� ����������� � ������������� ������������',5)

INSERT INTO Departments(Financing,Name,FacultyId)
VALUES(900,'Computer Science',7)

SELECT * FROM Departments

--3. ���������� (Faculties) 
--- ������������� (Id). ���������� ������������� ����������. 
--      ��� ������ - int. 
--      ���� ����������. 
--      �� ����� ��������� null-��������. 
--      ��������� ����. 
--- �������������� (Financing). ���� �������������� ����������. 
--      ��� ������ - money. 
--      �� ����� ��������� null-��������. 
--      �� ����� ���� ������ 0. 
--      �������� �� ��������� - 0. 
--- �������� (Name). �������� ����������. 
--      ��� ������ - nvarchar(100). 
--      �� ����� ��������� null-��������. 
--      �� ����� ���� ������. 
--      ������ ���� ����������. 

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
('���',1000),
('����',800),
('�����',1500),
('�����',2500),
('����',500)

SELECT * FROM Faculties

--4. ������ (Groups) 
--- ������������� (Id). ���������� ������������� ������. 
--      ��� ������ - int. 
--      ���� ����������. 
--      �� ����� ��������� null-��������. 
--      ��������� ����. 
--- �������� (Name). �������� ������. 
--      ��� ������ - nvarchar(10). 
--      �� ����� ��������� null-��������. 
--      �� ����� ���� ������. 
--      ������ ���� ����������. 
--- ���� (Year). ���� (���) �� ������� ��������� ������. 
--      ��� ������ - int. 
--      �� ����� ��������� null-��������. 
--      ������ ���� � ��������� �� 1 �� 5. 
--- ������������� ������� (DepartmentId). �������, � ������ ������� ������ ������. 
--      ��� ������ - int. 
--      �� ����� ��������� null-��������. 
--      ������� ����. 

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

--5. ������ � �������� (GroupsCurators) 
--- ������������� (Id). ���������� ������������� ������ � ��������. 
--      ��� ������ - int. 
--      ���� ����������. 
--      �� ����� ��������� null-��������. 
--      ��������� ����. 
--- ������������� �������� (CuratorId). �������. 
--      ��� ������ - int. 
--      �� ����� ��������� null-��������. 
--      ������� ����. 
--- ������������� ������ (GroupId). ������. 
--      ��� ������ - int. 
--      �� ����� ��������� null-��������. 
--      ������� ����. 

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

--6. ������ � ������ (GroupsLectures) 
--- ������������� (Id). ���������� ������������� ������ � ������. 
--      ��� ������ - int. 
--      ���� ����������. 
--      �� ����� ��������� null-��������. 
--      ��������� ����. 
--- ������������� ������ (GroupId). ������. 
--      ��� ������ - int. 
--      �� ����� ��������� null-��������. 
--      ������� ����. 
--- ������������� ������ (LectureId). ������. 
--      ��� ������ - int. 
--      �� ����� ��������� null-��������. 
--      ������� ����. 

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

--7. ������ (Lectures) 
--- ������������� (Id). ���������� ������������� ������. 
--      ��� ������ - int. 
--      ���� ����������. 
--      �� ����� ��������� null-��������. 
--      ��������� ����. 
--- ��������� (LectureRoom). ��������� � ������� �������� ������. 
--      ��� ������ - nvarchar(max). 
--      �� ����� ��������� null-��������. 
--      �� ����� ���� ������. 
--- ������������� ���������� (SubjectId). ����������, �� ������� �������� ������. 
--      ��� ������ - int. 
--      �� ����� ��������� null-��������. 
--      ������� ����. 
--- ������������� ������������� (TeacherId). �������������, ������� ������ ������. 
--      ��� ������ - int. 
--      �� ����� ��������� null-��������. 
--      ������� ����. 

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

--8. ���������� (Subjects) 
--- ������������� (Id). ���������� ������������� ����������. 
--      ��� ������ - int. 
--      ���� ����������. 
--      �� ����� ��������� null-��������. 
--      ��������� ����. 
--- �������� (Name). �������� ����������. 
--      ��� ������ - nvarchar(100). 
--      �� ����� ��������� null-��������. 
--      �� ����� ���� ������. 
--      ������ ���� ����������. 

CREATE TABLE Subjects(
Id int IDENTITY NOT NULL PRIMARY KEY ,
Name NVARCHAR(100) NOT NULL ,

CONSTRAINT CK_Subjects_Name CHECK(LEN(Name)>0),
CONSTRAINT UQ_Subjects_Name UNIQUE (Name),
)

INSERT INTO Subjects(Name)
VALUES
('������������ ��������� � �������'),
('������������� �����������'),
('�������������� �����������'),
('������������������'),
('������ ������������ �����������'),
('������������� ���������� ������'),
('��������� �������������'),
('����������'),
('�����'),
('������')


SELECT * FROM Subjects

--9. ������������� (Teachers) 
--- ������������� (Id). ���������� ������������� �������������. 
--      ��� ������ - int. 
--      ���� ����������. 
--      �� ����� ��������� null-��������. 
--      ��������� ����. 
--- ��� (Name). ��� �������������. 
--      ��� ������ - nvarchar(max). 
--      �� ����� ��������� null-��������. 
--      �� ����� ���� ������. 
--- ������ (Salary). ������ �������������. 
--      ��� ������ - money. 
--      �� ����� ��������� null-��������. 
--      �� ����� ���� ������ ���� ����� 0. 
--- ������� (Surname). ������� �������������. 
--      ��� ������ - nvarchar(max). 
--      �� ����� ��������� null-��������. 
--      �� ����� ���� ������.

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

--������� 
--1. ������� ��� ��������� ���� ����� �������������� � �����. 

SELECT Teachers.Name,Teachers.Surname,Groups.Name
FROM Teachers
JOIN Lectures ON Teachers.Id=Lectures.TeacherId
JOIN GroupsLectures ON Lectures.Id=GroupsLectures.GroupId
JOIN Groups ON GroupsLectures.GroupId=Groups.Id

--2. ������� �������� �����������, ���� �������������� ������ ������� ��������� ���� �������������� ����������. 

SELECT Faculties.Name
FROM Faculties
WHERE Faculties.Financing<(SELECT MAX(Departments.Financing)FROM Departments WHERE Departments.FacultyId=Faculties.Id)

--3. ������� ������� ��������� ����� � �������� �����, ������� ��� ��������. 

SELECT Curators.Surname,Groups.Name
FROM Curators
JOIN GroupsCurators ON Curators.Id=GroupsCurators.CuratorId
Join Groups ON GroupsCurators.GroupId=Groups.Id

--4. ������� ����� � ������� ��������������, ������� ������ ������ � ������ �P107�. 

SELECT Teachers.Name,Teachers.Surname
FROM Teachers
JOIN Lectures ON Lectures.TeacherId=Teachers.Id
JOIN GroupsLectures ON Lectures.Id=GroupsLectures.LectureId
JOIN Groups ON GroupsLectures.GroupId=Groups.Id
WHERE Groups.Name LIKE 'P107'
 
--5. ������� ������� �������������� � �������� ����������� �� ������� ��� ������ ������. 

SELECT DISTINCT Teachers.Surname,Faculties.Name
FROM Teachers
JOIN Lectures ON Lectures.TeacherId=Teachers.Id
JOIN Subjects ON Lectures.SubjectId=Subjects.Id
JOIN GroupsLectures ON Lectures.Id=GroupsLectures.LectureId
JOIN Groups ON GroupsLectures.GroupId=Groups.Id
JOIN Departments ON Groups.DepartmentId=Departments.Id
JOIN Faculties ON Departments.FacultyId=Faculties.Id

--6. ������� �������� ������ � �������� �����, ������� � ��� ���������. 

SELECT Departments.Name,Groups.Name
FROM Departments
JOIN Groups ON Groups.DepartmentId=Departments.Id

--7. ������� �������� ���������, ������� ������ ������������� �Samantha Adams�. 

INSERT INTO Teachers(Name,Surname,Salary)
VALUES('Samantha','Adams',650)

SELECT Subjects.Name
FROM Subjects
JOIN Lectures ON Lectures.SubjectId=Subjects.Id
JOIN Teachers ON Lectures.TeacherId=Teachers.Id
WHERE Teachers.Name LIKE 'Samantha' AND Teachers.Surname LIKE 'Adams'

--8. ������� �������� ������, �� ������� �������� ���������� �Database Theory�. 

INSERT INTO Subjects
VALUES('Database Theory')

SELECT Departments.Name
FROM Departments
JOIN Groups ON Groups.DepartmentId=Departments.Id
JOIN GroupsLectures ON GroupsLectures.GroupId=Groups.Id
JOIN Lectures ON GroupsLectures.LectureId=Lectures.Id
JOIN Subjects ON Lectures.SubjectId=Subjects.Id
WHERE Subjects.Name LIKE 'Database Theory'

--9. ������� �������� �����, ������� ��������� � ���������� �Computer Science�. 

INSERT INTO Faculties (Financing,Name)
VALUES(1700,'Computer Science')

SELECT Groups.Name
FROM Groups
JOIN Departments ON Groups.DepartmentId=Departments.Id
JOIN Faculties ON Departments.FacultyId=Faculties.Id
WHERE Faculties.Name LIKE 'Computer Science'

--10. ������� �������� ����� 5-�� �����, � ����� �������� �����������, � ������� ��� ���������. 

SELECT Groups.Name,Faculties.Name
FROM Groups
JOIN Departments ON Groups.DepartmentId=Departments.Id
JOIN Faculties ON Departments.FacultyId=Faculties.Id
WHERE Groups.Year=5

--11. ������� ������ ����� �������������� � ������, ������� ��� ������ (�������� ��������� � �����), ������ �������� ������ �� ������, ������� �������� � ��������� �B103�.

SELECT Teachers.Name,Teachers.Surname,Subjects.Name,Groups.Name
FROM Teachers
JOIN Lectures ON Lectures.TeacherId=Teachers.Id
JOIN Subjects ON Lectures.SubjectId=Subjects.Id
JOIN GroupsLectures ON Lectures.Id=GroupsLectures.LectureId
JOIN Groups ON GroupsLectures.GroupId=Groups.Id
WHERE Lectures.LectureRoom LIKE 'B103'