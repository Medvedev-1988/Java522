--Вывести для каждого Izd количество книг и оставить только те издательства, где книг ≥ 10.

--SELECT 
--* FROM books

--SELECT Izd, COUNT (*) AS 'Количество книг'
--FROM books
--GROUP BY Izd 
--HAVING COUNT (*) >= 10
--ORDER BY COUNT(*) DESC

--Для каждого Category показать среднюю цену и оставить категории со средней ценой > 25.

--SELECT Category,AVG(Price) AS 'Средняя цена'
--FROM books
--GROUP BY Category
--HAVING AVG(Price) >25
--ORDER BY AVG(Price) DESC 

--По Themes вывести максимальную цену и оставить только темы, где MAX(Price) ≥ 100.

--SELECT Themes,MAX(Price) AS 'Максимальная цена'
--FROM books
--GROUP BY Themes
--HAVING MAX(Price) >= 100
--ORDER BY MAX(Price) DESC

--Для каждого Format посчитать общее число страниц (SUM(Pages)) и выбрать форматы, где сумма > 5000.

--SELECT Format,SUM(Pages) AS 'Общее число страниц'
--FROM books
--GROUP BY Format
--HAVING SUM(Pages) > 5000
--ORDER BY SUM(Pages) DESC

--По Izd посчитать средний тираж и выбрать издательства со средним тиражом между 1000 и 5000.

--SELECT Izd,AVG(Pressrun) AS 'Средний тираж'
--FROM books
--GROUP BY Izd
--HAVING AVG(Pressrun) BETWEEN 1000 AND 5000
--ORDER BY AVG(Pressrun) DESC

--По Category вывести минимальное и максимальное значение Pages и оставить категории, где MIN(Pages) ≥ 50.

--SELECT Category,MIN(Pages) AS 'Минимальное значение',MAX(Pages) AS 'Максимальное значение' 
--FROM books 
--GROUP BY Category
--HAVING MIN(Pages) >=50
--ORDER BY MIN(Pages) DESC


--Для каждого Izd посчитать количество книг с ненулевой ценой и оставить издательства, где таких книг ≥ 5.

--INSERT INTO books (Name,Price,Izd)
--VALUES ('SQL Обучение',0,'Москва')
--SELECT Izd,COUNT(CASE WHEN Price > 0 THEN 1 END) AS 'Количество книг с ненулевой ценой'
--FROM books
--GROUP BY Izd
--HAVING COUNT(CASE WHEN Price > 0 THEN 1 END) >=5

--По Themes посчитать количество уникальных форматов (COUNT(DISTINCT Format)) и оставить темы, где их ≥ 2.

--SELECT Themes,COUNT(DISTINCT Format) AS 'Уникальные форматы'
--FROM books
--GROUP BY Themes
--HAVING COUNT(DISTINCT Format) >= 2
--ORDER BY COUNT(DISTINCT Format) DESC

--Для каждого года из поля Date (YEAR(Date)) посчитать количество книг и оставить годы, где книг > 20.

--SELECT Date,COUNT(*) AS 'Количество книг' 
--FROM books
--GROUP BY Date
--HAVING COUNT(*) > 20
--ORDER BY COUNT(*)

--По Izd посчитать среднее число страниц и оставить издательства со средним > 200.

--SELECT Izd,AVG (Pages) AS 'среднее число страниц' 
--FROM books
--GROUP BY Izd
--HAVING AVG(Pages) > 200
--ORDER BY AVG(Pages) DESC

--По Category вывести количество книг и среднюю цену, оставить только те, где COUNT(*) ≥ 15 и AVG(Price) > 30.

--SELECT Category,COUNT(*) AS 'Количество книг',AVG(Price) AS 'Средняя цена'
--FROM books
--GROUP BY Category
--HAVING COUNT(*) >= 15 AND AVG(Price) > 30

--Для Themes вывести суммарный тираж и оставить темы, где SUM(Pressrun) = 0 (или IS NULL, если надо).

--SELECT Themes,SUM(Pressrun) AS 'Суммарный тираж '
--FROM books
--GROUP BY Themes
--HAVING SUM(Pressrun) = 0 OR SUM(Pressrun) IS NULL

--По Format вывести количество книг и оставить только форматы, где количество находится в диапазоне [5, 12].

--SELECT Format,COUNT(*) AS 'Количество книг'
--FROM books
--GROUP BY Format
--HAVING COUNT(*) BETWEEN 5 AND 12 

--По Izd посчитать количество бесплатных книг (Price = 0) через условную агрегацию и оставить издательства, где таких книг ≥ 1.

--INSERT INTO books (Name,Price)
--VALUES ('MMA Legends',0)
--SELECT Izd,COUNT(Case WHEN Price = 0 THEN 1 END) AS 'Количество бесплатных книг'
--FROM books
--GROUP BY Izd
--HAVING COUNT(Case WHEN Price = 0 THEN 1 END) >= 1  

--Для Category посчитать количество дорогих книг (Price > 50) и оставить категории, где их ≥ 3.

--SELECT Category,COUNT(CASE WHEN Price > 50 THEN 1 END) AS 'Количество дорогих книг'
--FROM books
--GROUP BY Category
--HAVING COUNT(CASE WHEN Price > 50 THEN 1 END) >= 3

--По Themes посчитать среднюю «цену за страницу» (AVG(Price / NULLIF(Pages,0))) и оставить темы, где она < 0.2.

--SELECT Themes, AVG(Price / NULLIF(Pages, 0)) AS 'Средняя «цена за страницу»'
--FROM books
--GROUP BY Themes
--HAVING AVG(Price / NULLIF(Pages, 0)) < 0.2

--По Izd вывести минимальную цену и оставить издательства, где MIN(Price) IS NOT NULL и MIN(Price) ≥ 5.


--SELECT Izd,MIN(Price) AS 'Минимальная цена'
--FROM books
--GROUP BY Izd
--HAVING MIN(Price) IS NOT NULL AND MIN(Price) >= 5

--По Format вывести количество книг без цены (Price IS NULL) и оставить форматы, где таких книг > 0.

--SELECT Format,COUNT(CASE WHEN Price IS NULL THEN 1 END) AS 'Количество книг без цены'
--FROM books
--GROUP BY Format
--HAVING COUNT(CASE WHEN Price IS NULL THEN 1 END) > 0

--По Category посчитать количество новинок (New = 1) и оставить категории, где кол-во новинок ≥ 10.


--SELECT Category,COUNT(CASE WHEN New = 1 THEN 1 END) AS 'Количество новинок'
--FROM books
--GROUP BY Category
--HAVING COUNT(CASE WHEN New = 1 THEN 1 END) >= 10

--Для каждой пары (Izd, Format) посчитать количество книг и оставить только пары, где COUNT(*) ≥ 4.

--SELECT Izd,Format,COUNT(*) AS 'Количество книг'
--FROM books
--GROUP BY Izd,Format
--HAVING COUNT(*) >= 4