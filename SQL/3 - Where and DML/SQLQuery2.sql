-- ������� ��� ������� Izd ���������� ���� � �������� ������ �� ������������, ��� ���� ? 10.
--SELECT 
--* FROM books

--SELECT Izd, COUNT (*) AS '���������� ����'
--FROM books
--GROUP BY Izd 
--HAVING COUNT (*) >= 10
--ORDER BY COUNT(*) DESC

-- ��� ������� Category �������� ������� ���� � �������� ��������� �� ������� ����� > 25.

--SELECT Category,AVG(Price) AS '������� ����'
--FROM books
--GROUP BY Category
--HAVING AVG(Price) >25
--ORDER BY AVG(Price) DESC 

-- �� Themes ������� ������������ ���� � �������� ������ ����, ��� MAX(Price) ? 100.

--SELECT Themes,MAX(Price) AS '������������ ����'
--FROM books
--GROUP BY Themes
--HAVING MAX(Price) >= 100
--ORDER BY MAX(Price) DESC

-- ��� ������� Format ��������� ����� ����� ������� (SUM(Pages)) � ������� �������, ��� ����� > 5000.

--SELECT Format,SUM(Pages) AS '����� ����� �������'
--FROM books
--GROUP BY Format
--HAVING SUM(Pages) > 5000
--ORDER BY SUM(Pages) DESC

-- �� Izd ��������� ������� ����� � ������� ������������ �� ������� ������� ����� 1000 � 5000.

--SELECT Izd,AVG(Pressrun) AS '������� �����'
--FROM books
--GROUP BY Izd
--HAVING AVG(Pressrun) BETWEEN 1000 AND 5000
--ORDER BY AVG(Pressrun) DESC

-- �� Category ������� ����������� � ������������ �������� Pages � �������� ���������, ��� MIN(Pages) ? 50.

--SELECT Category,MIN(Pages) AS '����������� ��������',MAX(Pages) AS '������������ ��������' 
--FROM books 
--GROUP BY Category
--HAVING MIN(Pages) >=50
--ORDER BY MIN(Pages) DESC

-- ��� ������� Izd ��������� ���������� ���� � ��������� ����� � �������� ������������, ��� ����� ���� ? 5.

--INSERT INTO books (Name,Price,Izd)
--VALUES ('SQL ��������',0,'������')
--SELECT Izd,COUNT(CASE WHEN Price > 0 THEN 1 END) AS '���������� ���� � ��������� �����'
--FROM books
--GROUP BY Izd
--HAVING COUNT(CASE WHEN Price > 0 THEN 1 END) >=5

-- �� Themes ��������� ���������� ���������� �������� (COUNT(DISTINCT Format)) � �������� ����, ��� �� ? 2.

--SELECT Themes,COUNT(DISTINCT Format) AS '���������� �������'
--FROM books
--GROUP BY Themes
--HAVING COUNT(DISTINCT Format) >= 2
--ORDER BY COUNT(DISTINCT Format) DESC

-- ��� ������� ���� �� ���� Date (YEAR(Date)) ��������� ���������� ���� � �������� ����, ��� ���� > 20.

--SELECT Date,COUNT(*) AS '���������� ����' 
--FROM books
--GROUP BY Date
--HAVING COUNT(*) > 20
--ORDER BY COUNT(*)

-- �� Izd ��������� ������� ����� ������� � �������� ������������ �� ������� > 200.

--SELECT Izd,AVG (Pages) AS '������� ����� �������' 
--FROM books
--GROUP BY Izd
--HAVING AVG(Pages) > 200
--ORDER BY AVG(Pages) DESC

-- �� Category ������� ���������� ���� � ������� ����, �������� ������ ��, ��� COUNT(*) ? 15 � AVG(Price) > 30.

--SELECT Category,COUNT(*) AS '���������� ����',AVG(Price) AS '������� ����'
--FROM books
--GROUP BY Category
--HAVING COUNT(*) >= 15 AND AVG(Price) > 30

-- ��� Themes ������� ��������� ����� � �������� ����, ��� SUM(Pressrun) = 0 (��� IS NULL, ���� ����).

--SELECT Themes,SUM(Pressrun) AS '��������� ����� '
--FROM books
--GROUP BY Themes
--HAVING SUM(Pressrun) = 0 OR SUM(Pressrun) IS NULL

-- �� Format ������� ���������� ���� � �������� ������ �������, ��� ���������� ��������� � ��������� [5, 12].

--SELECT Format,COUNT(*) AS '���������� ����'
--FROM books
--GROUP BY Format
--HAVING COUNT(*) BETWEEN 5 AND 12 

-- �� Izd ��������� ���������� ���������� ���� (Price = 0) ����� �������� ��������� � �������� ������������, ��� ����� ���� ? 1.

--INSERT INTO books (Name,Price)
--VALUES ('MMA Legends',0)
--SELECT Izd,COUNT(Case WHEN Price = 0 THEN 1 END) AS '���������� ���������� ����'
--FROM books
--GROUP BY Izd
--HAVING COUNT(Case WHEN Price = 0 THEN 1 END) >= 1  

-- ��� Category ��������� ���������� ������� ���� (Price > 50) � �������� ���������, ��� �� ? 3.

--SELECT Category,COUNT(CASE WHEN Price > 50 THEN 1 END) AS '���������� ������� ����'
--FROM books
--GROUP BY Category
--HAVING COUNT(CASE WHEN Price > 50 THEN 1 END) >= 3

-- �� Themes ��������� ������� ����� �� �������� (AVG(Price / NULLIF(Pages,0))) � �������� ����, ��� ��� < 0.2.

--SELECT Themes, AVG(Price / NULLIF(Pages, 0)) AS '������� ����� �� ��������'
--FROM books
--GROUP BY Themes
--HAVING AVG(Price / NULLIF(Pages, 0)) < 0.2

-- �� Izd ������� ����������� ���� � �������� ������������, ��� MIN(Price) IS NOT NULL � MIN(Price) ? 5.

--SELECT Izd,MIN(Price) AS '����������� ����'
--FROM books
--GROUP BY Izd
--HAVING MIN(Price) IS NOT NULL AND MIN(Price) >= 5

-- �� Format ������� ���������� ���� ��� ���� (Price IS NULL) � �������� �������, ��� ����� ���� > 0.

--SELECT Format,COUNT(CASE WHEN Price IS NULL THEN 1 END) AS '���������� ���� ��� ����'
--FROM books
--GROUP BY Format
--HAVING COUNT(CASE WHEN Price IS NULL THEN 1 END) > 0

-- �� Category ��������� ���������� ������� (New = 1) � �������� ���������, ��� ���-�� ������� ? 10.

--SELECT Category,COUNT(CASE WHEN New = 1 THEN 1 END) AS '���������� �������'
--FROM books
--GROUP BY Category
--HAVING COUNT(CASE WHEN New = 1 THEN 1 END) >= 10

-- ��� ������ ���� (Izd, Format) ��������� ���������� ���� � �������� ������ ����, ��� COUNT(*) ? 4.

SELECT Izd,Format,COUNT(*) AS '���������� ����'
FROM books
GROUP BY Izd,Format
HAVING COUNT(*) = 4