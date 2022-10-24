-- NULL 관련 함수
SELECT * FROM Products;
SELECT COUNT(*) FROM Products;
SELECT COUNT(Price) FROM Products;
SELECT AVG(Price) FROM Products;

-- IFNULL : 값이 없으면(NULL) 다른 값으로 바꿔서 조회
SELECT Price FROM Products;
SELECT IFNULL(Price, 0) FROM Products;

SELECT ProductID, ProductName, SupplierID, CategoryID, IFNULL(Price, 0)
FROM Products;

SELECT AVG(Price) FROM Products; -- 28.866364
SELECT AVG(IFNULL(Price, 0)) FROM Products; -- 28.496282


-- Customers 테이블에서 CustomerName 이 NULL 이면 -> 'Anonymous'
SELECT 
	CustomerID, 
	IFNULL(CustomerName, 'Anonymous'),
	ContactName,
	Address,
	City,
	PostalCode,
	Country
FROM Customers;Categories


