--INSERT (5 шт.)
--1) Вставить полную строку со всеми основными полями

--INSERT INTO books (Code,New,Name,Price,Izd,Pages,Format,Date,Pressrun,Themes,Category)
--VALUES (4496,0,'SQL Обучение',10.00,'МОсква',200,'70х100/16','20250823 00:00:00.000',2000,'База данных','Учебники')

--2) Вставить строку с минимальным набором полей

--INSERT INTO books (New,Name,Price)
--VALUES (1,'SQL Обучение',10.00)

--3) Мультивставка нескольких книг одним оператором

--INSERT INTO books (Code,New,Name,Price,Izd,Pages,Format,Date,Pressrun,Themes,Category)
--VALUES 
--(4497,0,'SQL Обучение',10.00,'МОсква',200,'70х100/16','20250823 00:00:00.000',2000,'База данных','Учебники'),
--(4498,1,'SQL Обучение',10.00,'МОсква',200,'70х100/16','20250823 00:00:00.000',2000,'База данных','Учебники'),
--(4499,0,'SQL Обучение',10.00,'МОсква',200,'70х100/16','20250823 00:00:00.000',2000,'База данных','Учебники')

--4) Вставка с Unicode-символами 

--INSERT INTO books (Code,New,Name,Price,Izd,Pages,Format,Date,Pressrun,Themes,Category)
--VALUES (4496,0,N'SQL Обучение',10.00,N'МОсква',200,'70х100/16','20250823 00:00:00.000',2000,N'База данных',N'Учебники')

--5) Вставка с простым вычислением литералов

--INSERT INTO books (Code,New,Name,Price,Izd,Pages,Format,Date,Pressrun,Themes,Category)
--VALUES (4496,0,'SQL Обучение',10.00+10.00,'МОсква',200,'70х100/16','20250823 00:00:00.000',2000+1000,'База данных','Учебники')

--SELECT * FROM books
--WHERE Code >4495 AND Code < 4497

--UPDATE (5 шт.)
--6) Обновить цену на фиксированное значение для конкретного издателя

--UPDATE books
--set Price = 20.00
--WHERE Izd = 'Москва'

--SELECT 
--* FROM books
--WHERE Izd ='Москва'

--7) Установить флаг New = 1 для книг, изданных с 2018-01-01

--UPDATE books
--set New = 1
--WHERE Date >= '2018-01-01'

--SELECT 
--* FROM books
--WHERE Date >= '2018-01-01'

--8) Уменьшить цену на 15% для книг дороже 300

--UPDATE books
--set Price = Price * 0.85
--WHERE Price > 300

--SELECT 
--* FROM books
--WHERE Price > 280

--9) Очистить (NULL) поле Themes там, где оно заполнено словом 'none'

--UPDATE books
--set THEMES IS NULL
--WHERE THEMES = 'Мультимедиа'

--SELECT
--* FROM books
--WHERE THEMES IS NULL

--10) Переименовать формат A5 → A5+ для всех соответствующих строк

--UPDATE books
--set Format = '100x100/32'
--WHERE Format = '70х100/16'

--SELECT
--* FROM books
--WHERE Format IN ('100x100/32')

--DELETE (5 шт.)
--11) Удалить тестовые записи по издателю (Test)

--DELETE books
--WHERE Izd = 'Москва'

--SELECT
--* FROM books

--12) Удалить записи с некорректной ценой (<= 0)

--INSERT INTO books (Name,Price,Izd)
--VALUES ('Интересная страна',15.15,'Москва')
--DELETE books 
--WHERE Price = 15.15
--SELECT 
--* FROM books

--13) Удалить записи без даты и без количества страниц

--INSERT INTO books (Name,Pages)
--VALUES ('Москва',0),
--('Москва',0),
--('Москва',0)

--DELETE books WHERE Date IS NULL AND Pages = 0

--SELECT
--* FROM books

--14) Удалить любые первые 5 строк (без сортировки)

--DELETE TOP(5)
--FROM books

--SELECT
--* FROM books

--15) Удалить книги, где название начинается на 'Z'

--INSERT INTO books (Name)
--VALUES ('SQL обучение')

--DELETE books
--WHERE Name LIKE 'S%'

--SELECT * FROM books


--SELECT (5 шт.)
--16) Топ-10 самых дорогих книг (Name, Price)

--SELECT TOP (10)
--* FROM books
--ORDER BY Price DESC

--17) Уникальные издатели по алфавиту

--SELECT Izd
-- FROM books
--ORDER BY Name 

--18) Вычисляемая колонка «Общая сумма» = Price * Pressrun

--SELECT Name,Price,Pressrun,Price * Pressrun AS 'Общая сумма'
--FROM books

--19) Поиск по Unicode-шаблону (названия на букву «Д»)

--SELECT Name
--FROM books
--WHERE Name LIKE N'Д%'

--20) Классификация цены через CASE (без подзапросов)

--SELECT Name,Price,
--CASE 
--WHEN Price < 10 THEN 'недорогие'
--WHEN Price > 10 AND Price < 50 THEN 'средняя стоимость'
--WHEN Price > 50 THEN 'дорогие'
--END AS 'Классификация цены'
--FROM books
