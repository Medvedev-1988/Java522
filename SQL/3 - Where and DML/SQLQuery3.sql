--INSERT (5 ��.)
--1) �������� ������ ������ �� ����� ��������� ������

--INSERT INTO books (Code,New,Name,Price,Izd,Pages,Format,Date,Pressrun,Themes,Category)
--VALUES (4496,0,'SQL ��������',10.00,'������',200,'70�100/16','20250823 00:00:00.000',2000,'���� ������','��������')

--2) �������� ������ � ����������� ������� �����

--INSERT INTO books (New,Name,Price)
--VALUES (1,'SQL ��������',10.00)

--3) ������������� ���������� ���� ����� ����������

--INSERT INTO books (Code,New,Name,Price,Izd,Pages,Format,Date,Pressrun,Themes,Category)
--VALUES 
--(4497,0,'SQL ��������',10.00,'������',200,'70�100/16','20250823 00:00:00.000',2000,'���� ������','��������'),
--(4498,1,'SQL ��������',10.00,'������',200,'70�100/16','20250823 00:00:00.000',2000,'���� ������','��������'),
--(4499,0,'SQL ��������',10.00,'������',200,'70�100/16','20250823 00:00:00.000',2000,'���� ������','��������')

--4) ������� � Unicode-��������� 

--INSERT INTO books (Code,New,Name,Price,Izd,Pages,Format,Date,Pressrun,Themes,Category)
--VALUES (4496,0,N'SQL ��������',10.00,N'������',200,'70�100/16','20250823 00:00:00.000',2000,N'���� ������',N'��������')

--5) ������� � ������� ����������� ���������

--INSERT INTO books (Code,New,Name,Price,Izd,Pages,Format,Date,Pressrun,Themes,Category)
--VALUES (4496,0,'SQL ��������',10.00+10.00,'������',200,'70�100/16','20250823 00:00:00.000',2000+1000,'���� ������','��������')

--SELECT * FROM books
--WHERE Code >4495 AND Code < 4497

--UPDATE (5 ��.)
--6) �������� ���� �� ������������� �������� ��� ����������� ��������

--UPDATE books
--set Price = 20.00
--WHERE Izd = '������'

--SELECT 
--* FROM books
--WHERE Izd ='������'

--7) ���������� ���� New = 1 ��� ����, �������� � 2018-01-01

--UPDATE books
--set New = 1
--WHERE Date >= '2018-01-01'

--SELECT 
--* FROM books
--WHERE Date >= '2018-01-01'

--8) ��������� ���� �� 15% ��� ���� ������ 300

--UPDATE books
--set Price = Price * 0.85
--WHERE Price > 300

--SELECT 
--* FROM books
--WHERE Price > 280

--9) �������� (NULL) ���� Themes ���, ��� ��� ��������� ������ 'none'

--UPDATE books
--set THEMES IS NULL
--WHERE THEMES = '�����������'

--SELECT
--* FROM books
--WHERE THEMES IS NULL

--10) ������������� ������ A5 ? A5+ ��� ���� ��������������� �����


--UPDATE books
--set Format = '100x100/32'
--WHERE Format = '70�100/16'

--SELECT
--* FROM books
--WHERE Format IN ('100x100/32')

--DELETE (5 ��.)
--11) ������� �������� ������ �� �������� (Test)

--DELETE books
--WHERE Izd = '������'

--SELECT
--* FROM books

--12) ������� ������ � ������������ ����� (<= 0)

--INSERT INTO books (Name,Price,Izd)
--VALUES ('���������� ������',15.15,'������')
--DELETE books 
--WHERE Price = 15.15
--SELECT 
--* FROM books

--13) ������� ������ ��� ���� � ��� ���������� �������
--INSERT INTO books (Name,Pages)
--VALUES ('������',0),
--('������',0),
--('������',0)

--DELETE books WHERE Date IS NULL AND Pages = 0

--SELECT
--* FROM books

--14) ������� ����� ������ 5 ����� (��� ����������)

--DELETE TOP(5)
--FROM books

--SELECT
--* FROM books

--15) ������� �����, ��� �������� ���������� �� 'Z'

--INSERT INTO books (Name)
--VALUES ('SQL ��������')

--DELETE books
--WHERE Name LIKE 'S%'

--SELECT * FROM books

--SELECT (5 ��.)
--16) ���-10 ����� ������� ���� (Name, Price)

--SELECT TOP (10)
--* FROM books
--ORDER BY Price DESC

--17) ���������� �������� �� ��������

--SELECT
--* FROM books
--ORDER BY Name 

--18) ����������� ������� ������ ����� = Price * Pressrun

--SELECT Name,Price,Pressrun,Price * Pressrun AS '����� �����'
--FROM books

--19) ����� �� Unicode-������� (�������� �� ����� �Ļ)

--SELECT Name
--FROM books
--WHERE Name LIKE N'�%'

--20) ������������� ���� ����� CASE (��� �����������)

--SELECT Name,Price,
--CASE 
--WHEN Price < 10 THEN '���������'
--WHEN Price > 10 AND Price < 50 THEN '������� ���������'
--WHEN Price > 50 THEN '�������'
--END AS '������������� ����'
--FROM books
