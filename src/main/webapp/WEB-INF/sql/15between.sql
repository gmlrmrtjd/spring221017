-- BETWEEN : 범위 내의 조건
SELECT * FROM Orders;
SeleCT * 
FROM Orders 
WHERE OrderDate >= '1996-08-01' 
AND OrderDate < '1996-09-01';

SELECT *
FROM Orders
WHERE OrderDate BETWEEN '1996-08-01' AND '1996-08-31'; -- 두 값 포함됨 

-- 가격이 10.00이상 ~ 20.00이하인 상품들
SELECT *
FROM Products
WHERE Price BETWEEN 10.00 AND 20.00;

-- 주문일이 1998년 1월에 주문한 주문들 
SELECT *
FROM Orders
WHERE OrderDate BETWEEN '1998-01-01' AND '1998-01-31';

-- 50년대생 직원들 조회 
SELECT *
FROM Employees
WHERE BirthDate BETWEEN '1950-01-01' AND '1959-12-31';
 
