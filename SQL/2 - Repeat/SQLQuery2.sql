--Задание 1:
--Выведи все книги, которые: 
--изданы не "DiaSoft" 
--стоят больше 150 
--и при этом имеют значение в колонке Date (то есть дата известна) 
--?? Подсказка: NOT, AND, IS NOT NULL

--SELECT * 
--FROM books
--WHERE Izd != 'DiaSoft' AND Price > 150 AND Date IS NOT NULL

--Задание 2:
--Покажи топ 3% самых дешёвых книг, у которых: 
--больше 300 страниц 
--и цена не входит в список (100, 200, 300) 
--?? Подсказка: TOP, PERCENT, NOT IN, ORDER BY Price ASC

--SELECT TOP (3) PERCENT *
--FROM books
--WHERE Pages >300 AND Price NOT IN (100,200,300)
--ORDER BY Price 

--Задание 3:
--Выведи имя книги, цену и информацию о тираже, используя IIF и IS NULL
--Используй IIF для создания новой колонки, отражающей состояние тиража (Pressrun):
--Если Pressrun IS NULL ? "нет данных о тираже" 
--Если Pressrun = 1 ? "остался 1 экземпляр" 
--Во всех других случаях ? "в наличии"

--SELECT Name,Price,Pressrun,
--IIF(Pressrun IS NULL,'нет данных о тираже',IIF(Pressrun =1,'Остался 1 экземпляр',IIF(Pressrun=0,'нет в наличии','в наличии'))) AS 'информация о тираже'
--FROM books

--Задание 4: Фильтр по издателям и по дате
--Выведи Name, Price, Izd, [Date] только для книг издательств из списка ('DiaSoft','Вильямс','ДЭСС'),
-- у которых дата между 1993-11-01 и 1997-01-01 включительно. Отсортируй по Price по возрастанию, затем по Name. 
--Подсказка: IN, BETWEEN, ORDER BY

--SELECT Name,Price,Izd,Date
--FROM books
--WHERE Izd IN('DiaSoft','Вильямс','ДЭСС') AND Date BETWEEN '1993-11-01' AND '1997-01-01'
--ORDER BY Price,Name

--Задание 5: Топ по общей сумме (Price * Pressrun)
--Выведи Name, Price, Pressrun и вычисляемую колонку TotalSum = Price * Pressrun. 
--Покажи топ 5 по TotalSum среди книг, где Pressrun не NULL и > 0. Отсортируй по TotalSum убыв., затем по Price убыв. 
--Подсказка: вычисляемая колонка, фильтр по Pressrun, TOP

--SELECT TOP 5 Name,Price,Price * Pressrun AS 'TotalSum'
--FROM books
--WHERE Pressrun IS NOT NULL AND Pressrun >0
--ORDER BY TotalSum DESC,Price DESC

--Задание 6: Статус «новинки» с default через CASE
--Выведи Name, Price и колонку Status, где: 
--New = 1 ? New 
--New = 0 ? Old 
--во всех остальных случаях ? Unknown
--Покажи только книги издателя DiaSoft, где [Date] известна. Отсортируй по [Date] убыв. 
--Подсказка: CASE ... WHEN ... ELSE ... END, IS NOT NULL

--SELECT Name,Price,
--CASE
--WHEN New=1 THEN 'New'
--WHEN New=0 THEN 'Old'
--ELSE 'Unknown'
--END AS 'Status'
--FROM books
--WHERE Izd IN('DiaSoft') AND Date IS NOT NULL
--ORDER BY Date DESC

--Задание 7: Сложный фильтр по цене и издателю
--Выведи Name, Price, Izd. Включай книги, где (Price между 20 и 30 включительно)
--ИЛИ Price входит в список (29, 20, 25). Исключи книги издателя 'ДЭСС'. 
--Отсортируй по Price убыв., затем Name возр. 
--Подсказка: BETWEEN, IN, NOT IN, скобки в логике

--SELECT Name,Price,Izd
--FROM books
--WHERE  (Price BETWEEN 20 AND 30  OR Price IN(29,20,25)) AND Izd NOT IN('ДЭСС')
--ORDER BY Price DESC,Name

--Задание 8: Топ 10% самых дешёвых без даты
--Покажи топ 10% самых дешёвых книг, у которых [Date] IS NULL.
--Выведи Name, Price, [Date]. Отсортируй по Price возр., при равенстве — Name возр. 
--Подсказка: TOP (10) PERCENT, обязательно ORDER BY Price ASC, Name ASC

SELECT TOP (10) PERCENT Name,Price,Date
FROM books
WHERE Date IS NULL
ORDER BY Price ASC,Name ASC