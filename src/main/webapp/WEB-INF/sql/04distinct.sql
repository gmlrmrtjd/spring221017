-- distinct
SELECT * FROM Customers;
SELECT Country FROM Customers; -- 91
SELECT DISTINCT Country FROM Customers; -- 21개
SELECT DISTINCT City, Country FROM Customers; -- 69개

-- Suppliers 테이블의 Country 컬럼을 중복 제거해서 조회
SELECT DISTINCT Country FROM Suppliers;
-- Suppliers 테이블의 Country 컬럼을 중복 제거하지 않고 조회
SELECT Country FROM Suppliers;

