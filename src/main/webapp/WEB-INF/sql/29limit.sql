-- LIMIT : 조회 결과 row 수를 제한
SELECT * FROM Customers;
SELECT * FROM Customers LIMIT 5;
SELECT * FROM Customers LIMIT 3;

SELECT * FROM Products ORDER BY Price DESC LIMIT 3;
SELECT * FROM Products ORDER BY Price LIMIT 3;
SELECT * 
FROM Products 
WHERE Price IS NOT NULL 
ORDER BY Price 
LIMIT 3;

-- 가장 나이가 많은 직원 2명 조회
SELECT * FROM Employees ORDER BY BirthDate LIMIT 2;
-- 가장 나이가 어린 직원 2명 조회
SELECT * FROM Employees ORDER BY BirthDate DESC LIMIT 2;

-- LIMIT : 중간 record만 조회
SELECT * 
FROM Customers 
WHERE CustomerID 
ORDER BY CustomerID
LIMIT 3, 3; -- 3번 인덱스부터 3개

SELECT * 
FROM Customers 
WHERE CustomerID 
ORDER BY CustomerID
LIMIT 0, 3; -- 0번 인덱스부터 3개

SELECT * 
FROM Customers 
WHERE CustomerID 
ORDER BY CustomerID
LIMIT 3; -- 위에서부터 3개

-- 직원의 나이가 두번째,세번째 많은 사람 조회
SELECT * FROM Employees ORDER BY BirthDate LIMIT 1, 2;
-- 두번째로 어린 직원 조회
SELECT * FROM Employees ORDER BY BirthDate DESC LIMIT 1, 1;
-- 두번째로 가격이 비싼 상품 조회
SELECT * FROM Products ORDER BY Price DESC LIMIT 1, 1;
-- 10번째로 가격이 비싼 상품 조회
SELECT * FROM Products ORDER BY Price DESC LIMIT 9, 1;
SELECT * FROM Products ORDER BY Price DESC;




