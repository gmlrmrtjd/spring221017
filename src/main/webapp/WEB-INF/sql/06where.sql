-- WHERE : 결과 행의 조건을 작성할 수 있는 키워드
SELECT * 
FROM Customers 
WHERE Country = 'Mexico';

-- Customers 테이블에서 Country가 France인 레코드만 조회
SELECT *
FROM Customers
WHERE Country = 'France';

-- Suppliers 테이블에서 Country가 UK 인 레코드만 조회
SELECT *
FROM Suppliers
WHERE Country = 'UK';

-- Customers 테이블에서 Country가 France인 고객의 이름만 조회
SELECT CustomerName FROM Customers WHERE Country = 'France';

-- Suppliers 테이블에서 Country가 Japan인 공급자면(SupplierName) 조회
SELECT SupplierName FROM Suppliers WHERE Country = 'Japan';