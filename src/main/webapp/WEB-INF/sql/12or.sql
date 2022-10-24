-- OR : 두 조건 중 하나만 true 이면 row 선택됨 
SELECT * FROM Customers;
SELECT * FROM Customers WHERE Country = 'Germany';
SELECT * FROM Customers WHERE Country = 'Mexico';

SELECT * 
FROM Customers
WHERE Country = 'Germany'
OR Country = 'Mexico';

-- usa와 uk에 사는 고객들 조회 (Suppliers)
SELECT * 
FROM Suppliers
WHERE Country = 'Germany'
OR Country = 'Mexico';

-- city가 berlin과 london에 있는 고객들 조회
SELECT *
FROM Customers
WHERE City = 'Berlin'
OR City = 'London';

-- 카테고리가 1, 2번인 상품 조회 (Products)
SELECT * 
FROM Products
WHERE CategoryID = 1
OR CategoryID = 2;