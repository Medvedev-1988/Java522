--������� ������ ���� � �� ������� (�������� ����� + ��� � ������� ������).

--SELECT Books.Name,Authors.FirstName,Authors.LastName FROM Books
--INNER JOIN Authors ON Books.Id_Author=Authors.Id

--�������� ��� ����� ������ � �������������� (Press), � ������� ��� ������.

--SELECT Books.Name,Press.Name FROM Books
--INNER JOIN Press ON Books.Id_Press=Press.Id

--�������� ��� ����� ������ � ������ (Themes).

--SELECT Books.Name,Themes.Name FROM Books
--INNER JOIN Themes ON Books.Id_Themes=Themes.Id	

--������� ��� �����, ���� ���� � ��� ��� ������ (������������ LEFT JOIN).

--SELECT * FROM Books
--LEFT OUTER JOIN Authors ON Books.Id_Author=Authors.Id

--�������� ���� ������� � �����, ������� ��� �������� (������������ INNER JOIN).

--SELECT Authors.FirstName,Authors.LastName,Books.Name
--FROM Authors
--INNER JOIN Books ON Authors.Id=Books.Id_Author

--������� ������ ��������� � �� ������������ �������� (S_Cards) � ������������ INNER JOIN.

--SELECT * FROM Students
--INNER JOIN S_Cards ON Students.Id=S_Cards.Id_Student

--�������� ���� ���������, ���� ���� � ��� ��� �������� (LEFT JOIN).

--SELECT * FROM Students
--LEFT OUTER JOIN S_Cards ON Students.Id=S_Cards.Id_Student

--�������� ��� �������� (S_Cards) �, ���� ����, ���������, ������� ��� ����������� (RIGHT JOIN).

--SELECT * FROM S_Cards
--RIGHT OUTER JOIN Students ON S_Cards.Id_Student=Students.Id

--�������� ���� ��������� � ��� �������� ������������, ���� ���� � ����-�� ��� ���� (FULL OUTER JOIN).

--SELECT * FROM Students
--FULL OUTER JOIN S_Cards ON Students.Id=S_Cards.Id_Student

--������� ������ ���� ������ � ��������, ������������� (Press) � ����� (Themes) � ����� ������� (��������� LEFT JOIN).

--SELECT Books.Name,Authors.FirstName,Authors.LastName,Press.Name,Themes.Name
--FROM books
--LEFT OUTER JOIN Authors ON books.Id_Author=Authors.Id 
--LEFT OUTER JOIN Press ON books.Id_Press=Press.Id 
--LEFT OUTER JOIN Themes ON books.Id_Themes=Themes.Id 


--�������� ����� ������ ������� ���� ��������� � �������������� (UNION).

--SELECT Students.LastName FROM Students
--UNION 
--SELECT Teachers.LastName FROM Teachers

--�������� ������ ���� ������� ��������� � �������������� � ���������� ��������� (UNION ALL).

--SELECT Students.LastName FROM Students
--UNION ALL
--SELECT Teachers.LastName FROM Teachers

--�������� ������ ���������� ��� (FirstName) ��������� � �������� (UNION).

--SELECT DISTINCT Students.FirstName FROM Students
--UNION 
--SELECT DISTINCT Teachers.FirstName FROM Teachers

--������� ��� �������, ������������� � ������� ��������� ��� � ������� �������������� (UNION).

--SELECT Students.LastName FROM Students
--UNION 
--SELECT Teachers.LastName FROM Teachers


--����� �����, ������� ������������ �������� � ����������, � ��������������� (INTERSECT).

--SELECT Students.FirstName,Students.LastName FROM Students
--INTERSECT
--SELECT Teachers.FirstName,Teachers.LastName FROM Teachers

--����� �����, ������� ����������� � ����� ���������, � ����� ������� (INTERSECT).

--SELECT Students.FirstName,Students.LastName FROM Students
--INTERSECT
--SELECT Authors.FirstName,Authors.LastName FROM Authors


--������� ������� ���������, ������� �� �������� ��������������� (EXCEPT).

--SELECT Students.LastName FROM Students
--EXCEPT
--SELECT Teachers.LastName FROM Teachers

--������� ������� ��������������, ������� ��� ����� ��������� (EXCEPT).

--SELECT Teachers.LastName FROM Teachers
--EXCEPT
--SELECT Students.LastName FROM Students

--����� �����, � ������� ���� �����, �� ��� ������������ (������������ EXCEPT ).

--SELECT * FROM Books
--WHERE Id_Author IS NOT NULL
--EXCEPT
--SELECT * FROM Books
--WHERE Id_Press IS NOT NULL











