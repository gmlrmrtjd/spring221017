-- ORDER BY : 조회된 레코드(행, row) 정렬

SELECT *
FROM Customers;

-- CustomerID 기준 정렬 
SELECT *
FROM Customers
ORDER BY CustomerID;

-- CustomerName 기준 정렬 
SELECT *
FROM Customers
ORDER BY CustomerName;

-- Country 기준 정렬
SELECT *
FROM Customers
ORDER BY Country, City;

-- ASC : 오름 차순
-- DESC : 내림 차순 

SELECT * 
FROM Customers
ORDER BY Country ASC; -- ASC가 기본

SELECT *
FROM Customers
ORDER BY Country ASC, City ASC;

SELECT *
FROM Customers
ORDER BY Country DESC, City ASC;

SELECT *
FROM Customers
ORDER BY Country DESC, City DESC;

-- 컬럼명 대신 컬럼 번호로 작성 가능 
-- CustomerName 기준 정렬 
SELECT * 
FROM Customers 
ORDER BY CustomerName;

-- 2번째 행 기준 정렬 
SELECT *
FROM Customers
ORDER BY 2;

SELECT CustomerName, City
FROM Customers;
SELECT CustomerName, City
FROM Customers;


-- 직원 생일 순으로 직원 조회 
SELECT *
FROM Employees
ORDER BY BirthDate;

-- 상품명순으로 상품 조회
SELECT *
FROM Products
ORDER BY ProductName;

-- 가격이 높은 것부터 낮은 것 순으로 상품 조회
SELECT *
FROM Products
ORDER BY Price DESC;

-- 공급자를 나라, 도시순으로 조회
SELECT *
FROM Suppliers
ORDER BY Country, City;

-- 1번 카테로기에 있는 상품들을 상품명, 가격 조회 (가격 내림차순으로)
SELECT ProductName, Price
FROM Products
WHERE CategoryID =1
ORDER BY Price DESC;



--







