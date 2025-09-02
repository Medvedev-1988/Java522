--Вывести список книг и их авторов (название книги + имя и фамилия автора).

--SELECT Books.Name,Authors.FirstName,Authors.LastName FROM Books
--INNER JOIN Authors ON Books.Id_Author=Authors.Id

--Показать все книги вместе с издательствами (Press), в которых они изданы.

--SELECT Books.Name,Press.Name FROM Books
--INNER JOIN Press ON Books.Id_Press=Press.Id

--Показать все книги вместе с темами (Themes).

--SELECT Books.Name,Themes.Name FROM Books
--INNER JOIN Themes ON Books.Id_Themes=Themes.Id	

--Вывести все книги, даже если у них нет автора (использовать LEFT JOIN).

--SELECT * FROM Books
--LEFT OUTER JOIN Authors ON Books.Id_Author=Authors.Id

--Показать всех авторов и книги, которые они написали (использовать INNER JOIN).

--SELECT Authors.FirstName,Authors.LastName,Books.Name
--FROM Authors
--INNER JOIN Books ON Authors.Id=Books.Id_Author

--Вывести список студентов и их библиотечных карточек (S_Cards) — использовать INNER JOIN.

--SELECT * FROM Students
--INNER JOIN S_Cards ON Students.Id=S_Cards.Id_Student

--Показать всех студентов, даже если у них нет карточки (LEFT JOIN).

--SELECT * FROM Students
--LEFT OUTER JOIN S_Cards ON Students.Id=S_Cards.Id_Student

--Показать все карточки (S_Cards) и, если есть, студентов, которым они принадлежат (RIGHT JOIN).

--SELECT * FROM S_Cards
--RIGHT OUTER JOIN Students ON S_Cards.Id_Student=Students.Id

--Показать всех студентов и все карточки одновременно, даже если у кого-то нет пары (FULL OUTER JOIN).

--SELECT * FROM Students
--FULL OUTER JOIN S_Cards ON Students.Id=S_Cards.Id_Student

--Вывести список книг вместе с авторами, издательством (Press) и темой (Themes) в одном запросе (несколько LEFT JOIN).

--SELECT Books.Name,Authors.FirstName,Authors.LastName,Press.Name,Themes.Name
--FROM books
--LEFT OUTER JOIN Authors ON books.Id_Author=Authors.Id 
--LEFT OUTER JOIN Press ON books.Id_Press=Press.Id 
--LEFT OUTER JOIN Themes ON books.Id_Themes=Themes.Id 


--Получить общий список фамилий всех студентов и преподавателей (UNION).

--SELECT Students.LastName FROM Students
--UNION 
--SELECT Teachers.LastName FROM Teachers

--Получить список всех фамилий студентов и преподавателей с возможными повторами (UNION ALL).

--SELECT Students.LastName FROM Students
--UNION ALL
--SELECT Teachers.LastName FROM Teachers

--Получить список уникальных имён (FirstName) студентов и учителей (UNION).

--SELECT DISTINCT Students.FirstName FROM Students
--UNION 
--SELECT DISTINCT Teachers.FirstName FROM Teachers

--Вывести все фамилии, встречающиеся в таблице студентов или в таблице преподавателей (UNION).

--SELECT Students.LastName FROM Students
--UNION 
--SELECT Teachers.LastName FROM Teachers


--Найти людей, которые одновременно числятся и студентами, и преподавателями (INTERSECT).

--SELECT Students.FirstName,Students.LastName FROM Students
--INTERSECT
--SELECT Teachers.FirstName,Teachers.LastName FROM Teachers

--Найти имена, которые встречаются и среди студентов, и среди авторов (INTERSECT).

--SELECT Students.FirstName,Students.LastName FROM Students
--INTERSECT
--SELECT Authors.FirstName,Authors.LastName FROM Authors


--Вывести фамилии студентов, которые не являются преподавателями (EXCEPT).

--SELECT Students.LastName FROM Students
--EXCEPT
--SELECT Teachers.LastName FROM Teachers

--Вывести фамилии преподавателей, которых нет среди студентов (EXCEPT).

--SELECT Teachers.LastName FROM Teachers
--EXCEPT
--SELECT Students.LastName FROM Students

--Найти книги, у которых есть автор, но нет издательства (использовать EXCEPT ).

--SELECT * FROM Books
--WHERE Id_Author IS NOT NULL
--EXCEPT
--SELECT * FROM Books
--WHERE Id_Press IS NOT NULL











