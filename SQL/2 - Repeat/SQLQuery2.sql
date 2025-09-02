--������� 1:
--������ ��� �����, �������: 
--������ �� "DiaSoft" 
--����� ������ 150 
--� ��� ���� ����� �������� � ������� Date (�� ���� ���� ��������) 
--?? ���������: NOT, AND, IS NOT NULL

--SELECT * 
--FROM books
--WHERE Izd != 'DiaSoft' AND Price > 150 AND Date IS NOT NULL

--������� 2:
--������ ��� 3% ����� ������� ����, � �������: 
--������ 300 ������� 
--� ���� �� ������ � ������ (100, 200, 300) 
--?? ���������: TOP, PERCENT, NOT IN, ORDER BY Price ASC

--SELECT TOP (3) PERCENT *
--FROM books
--WHERE Pages >300 AND Price NOT IN (100,200,300)
--ORDER BY Price 

--������� 3:
--������ ��� �����, ���� � ���������� � ������, ��������� IIF � IS NULL
--��������� IIF ��� �������� ����� �������, ���������� ��������� ������ (Pressrun):
--���� Pressrun IS NULL ? "��� ������ � ������" 
--���� Pressrun = 1 ? "������� 1 ���������" 
--�� ���� ������ ������� ? "� �������"

--SELECT Name,Price,Pressrun,
--IIF(Pressrun IS NULL,'��� ������ � ������',IIF(Pressrun =1,'������� 1 ���������',IIF(Pressrun=0,'��� � �������','� �������'))) AS '���������� � ������'
--FROM books

--������� 4: ������ �� ��������� � �� ����
--������ Name, Price, Izd, [Date] ������ ��� ���� ����������� �� ������ ('DiaSoft','�������','����'),
-- � ������� ���� ����� 1993-11-01 � 1997-01-01 ������������. ���������� �� Price �� �����������, ����� �� Name. 
--���������: IN, BETWEEN, ORDER BY

--SELECT Name,Price,Izd,Date
--FROM books
--WHERE Izd IN('DiaSoft','�������','����') AND Date BETWEEN '1993-11-01' AND '1997-01-01'
--ORDER BY Price,Name

--������� 5: ��� �� ����� ����� (Price * Pressrun)
--������ Name, Price, Pressrun � ����������� ������� TotalSum = Price * Pressrun. 
--������ ��� 5 �� TotalSum ����� ����, ��� Pressrun �� NULL � > 0. ���������� �� TotalSum ����., ����� �� Price ����. 
--���������: ����������� �������, ������ �� Pressrun, TOP

--SELECT TOP 5 Name,Price,Price * Pressrun AS 'TotalSum'
--FROM books
--WHERE Pressrun IS NOT NULL AND Pressrun >0
--ORDER BY TotalSum DESC,Price DESC

--������� 6: ������ �������� � default ����� CASE
--������ Name, Price � ������� Status, ���: 
--New = 1 ? New 
--New = 0 ? Old 
--�� ���� ��������� ������� ? Unknown
--������ ������ ����� �������� DiaSoft, ��� [Date] ��������. ���������� �� [Date] ����. 
--���������: CASE ... WHEN ... ELSE ... END, IS NOT NULL

--SELECT Name,Price,
--CASE
--WHEN New=1 THEN 'New'
--WHEN New=0 THEN 'Old'
--ELSE 'Unknown'
--END AS 'Status'
--FROM books
--WHERE Izd IN('DiaSoft') AND Date IS NOT NULL
--ORDER BY Date DESC

--������� 7: ������� ������ �� ���� � ��������
--������ Name, Price, Izd. ������� �����, ��� (Price ����� 20 � 30 ������������)
--��� Price ������ � ������ (29, 20, 25). ������� ����� �������� '����'. 
--���������� �� Price ����., ����� Name ����. 
--���������: BETWEEN, IN, NOT IN, ������ � ������

--SELECT Name,Price,Izd
--FROM books
--WHERE  (Price BETWEEN 20 AND 30  OR Price IN(29,20,25)) AND Izd NOT IN('����')
--ORDER BY Price DESC,Name

--������� 8: ��� 10% ����� ������� ��� ����
--������ ��� 10% ����� ������� ����, � ������� [Date] IS NULL.
--������ Name, Price, [Date]. ���������� �� Price ����., ��� ��������� � Name ����. 
--���������: TOP (10) PERCENT, ����������� ORDER BY Price ASC, Name ASC

SELECT TOP (10) PERCENT Name,Price,Date
FROM books
WHERE Date IS NULL
ORDER BY Price ASC,Name ASC