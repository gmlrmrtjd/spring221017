-- SELECT : 데이터를 얻는 명령문

/*
SELECT 컬럼명리스트 FROM 테이블명;
*/

-- Customers 테이블의 모든 레코드와 모든 컬럼 조회 
SELECT * FROM Customers;

-- Customers 테이블의 모든 레코드를 CustomerName 열 조회 
SELECT CustomerName FROM Customers;

-- Customers 테이블의 모든 레코드를 CustomerName, Address 열 조회
SELECT CustomerName, Address FROM Customers;

-- Emaployees 테이블의 모든 레코드(행)을 LastName, BirthDate열 조회 
SELECT LastName, BirthDate FROM Employees;

-- sql 작성 시 주의할 점 
-- 대소문자를 구별하지 않는다.
-- 데이터베이스 종류에 따라 구분할 수도 있다. (MariaDB는 컬럼명 대소문자 구분)
-- 키워드는 대문자
-- 그 외는 소문자 or CamelCase
SELECT LastName, BirthDate From Employees; -- 권장 
select lastname, birthdate from Employees;
select lastname, birthdate from employees;

-- 모든 컬럼 : *
SELECT * FROM Customers;
Select 
	CustomerID, 
	CustomerName, 
	ContactName, 
	Address, 
	City, 
	PostalCode, 
	Country 
From 
	Customers;
    
-- Emplyees 테이블의 모든 레코드와 모든 컬럼 조회
SELECT * FROM Emplyees;

-- SELECT 이후의 컬럼의 순서가 결과의 순서가 됨
SELECT CustomerName, Address FROM Customers;
SELECT Address, CustomerName FROM Customers;

-- Employees 테이블의 모든 레코드를 FirstName, LastName, BirthDate 컬럼으로 조회
SELECT FirstName, LastName, BirthDate FROM Employees;
SELECT LastName, FirstName, BirthDate FROM Employees;

