-- IN : 나열된 값 중에 하나라도 일치하면
SELECT * FROM Customers;
SELECT * 
FROM Customers 
WHERE Country = 'Mexico' 
OR Country = 'Germany';

-- IN
SELECT * 
FROM Customers 
WHERE Country
IN ('Germany', 'Mexico');

SELECT * 
FROM Customers 
WHERE Country
IN ('Germany', 'Mexico', 'UK');

-- 'Madrid', 'München', 'London'에 사는 고객들 조회
SELECT *
FROM Customers
WHERE City IN ('Madrid', 'München', 'London');

-- uk, usa, japan 에 있는 공급자들
SELECT *
FROM Suppliers
WHERE Country IN ('uk', 'usa', 'japan');

-- 카테고리번호 1,2,3 인 상품들
SELECT * 
FROM Products
WHERE CategoryID IN (1, 2, 3);

-- 1996년 7월 8일, 1996년 7월 19일 에 주문한 주문번호들
SELECT *
FROM Orders
WHERE OrderDate IN ('1996-07-08', '1996-07-19');