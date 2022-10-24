-- COUNT() 함수 : 레코드가 몇개 인지?
SELECT * FROM Customers; -- 91개
SELECT COUNT(*) FROM Customers; -- 91개
SELECT COUNT(Country) FROM Customers; -- 91개
SELECT COUNT(DISTINCT Country) FROM Customers; -- 21개

-- Employees 테이블의 레코드가 몇 개인지?
SELECT COUNT(*) FROM Employees; -- 9개 
-- Suppliers 테이블의 Country 값이 중복 제거 하고 몇 개인지?
SELECT COUNT(DISTINCT Country) FROM Suppliers; -- 16개 