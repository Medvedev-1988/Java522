----SELECT * 
----FROM books 

----SELECT [Name] , Price , Pressrun , Pressrun , Pressrun , Pressrun , Pressrun , Pressrun FROM books 

----SELECT Name , Price , Pressrun  
----FROM books 


----SELECT Name as Title, Price , Pressrun  as Tiraj
----FROM books 

----SELECT Name as 'Nazvanie kniqi', Price , Pressrun  as 'Tiraj kniqi'
----FROM books

--/*
--SELECT Name  , Price  
--FROM books
--*/


----select name  , price  
----from BOOKS



------SELECT TOP 10 PERCENT   Name , Price  
------FROM books


------SELECT TOP 10 *     
------FROM books

------CTRL + K + C    COMMENT
------CTRL + K + U    UNCOMMET
------SELECT TOP 10 *     
------FROM books


----SELECT  * FROM books


----ORDER BY columName ASC / DESC

----SELECT Name,Price ,Pressrun
----FROM books
----ORDER BY Price DESC  ,Pressrun DESC,Name


----SELECT TOP 3 Name,Price 
----FROM books
----ORDER BY Price DESC 



----SELECT Name,Price ,Pressrun,Price*Pressrun AS 'Total sum'
----FROM books
----ORDER BY Price*Pressrun DESC

----> < >= <= = !=(<>)  !> !<  

----SELECT Name,Price ,Pressrun,Price*Pressrun AS 'Total sum'
----FROM books
----WHERE Price > 100 AND Price < 300
----ORDER BY Price*Pressrun DESC

----SELECT Name,Price ,Pressrun,Price*Pressrun AS 'Total sum' 
----FROM books
----WHERE Price > 100 AND Price < 300
----ORDER BY N DESC


----SELECT Name,Price ,Pressrun
----FROM books
----WHERE Price BETWEEN 100 AND 300
----ORDER BY Price  DESC  

----SELECT Name,Price ,Pressrun
----FROM books
----WHERE Pressrun = 2000 OR  Pressrun = 3000 OR  Pressrun = 5000



----SELECT Name,Price ,Pressrun
----FROM books
----WHERE Pressrun = 2000 OR  Pressrun = 3000 OR  Pressrun = 5000 



----SELECT Name,Price ,Pressrun,Price*Pressrun
----FROM books
----WHERE Price*Pressrun > 500000


----SELECT Name,Price ,Pressrun
----FROM books
----WHERE Pressrun = 2000 OR  Pressrun = 3000 OR  Pressrun = 5000 


----SELECT Name,Price ,Pressrun
----FROM books
----WHERE Pressrun IN (2000, 3000, 5000)

----SELECT Name,IZD,Price ,Pressrun
----FROM books
----WHERE Izd = 'DiaSoft'

--SELECT Name,IZD,Price ,Pressrun
--FROM books
--WHERE Izd IN ('DiaSoft','Âèëüÿìñ','ÄÝÑÑ')


--PRINT('Hello world!')