USE mydb1;

-- 테이블 만들기 
CREATE TABLE myTable01 (
	-- 컬럼명 자료형 나열 (타입:varchar , 크기:255)
    col1 VARCHAR(255),
    col2 VARCHAR(255),
    col3 VARCHAR(255)
);

SELECT * FROM myTable01;

-- 테이블 구조 보기 
DESCRIBE myTable01;
DESC myTable01;

-- 새 테이블 만들기 
-- 테이블명 myTable02
-- 컬럼명 name, age, address
-- 데이터 타입은 모두 varchar(255)
CREATE TABLE myTable02 (
	name VARCHAR(255),
    age VARCHAR(255),
    adress VARCHAR(255)
);

DESC myTable02;

-- 테이블 삭제
DROP TABLE myTable02;

DESC myTable02;

-- myTable01 삭제
DROP TABLE myTable01;

DESC myTable01;

-- 테이블 복사하기 
CREATE TABLE myCustomers AS
SELECT * FROM w3schools.Customers;

DESC myCustomers;

-- w3schools.Employees 테이블을 
-- mydb1에 myEMployees 테이블로 복사 
CREATE TABLE myEmployees AS
SELECT * FROM w3schools.Employees;

DESC myEmployees;
SELECT * FROM myEmployees;

-- Products 골라서 복사하기 
CREATE TABLE myProducts AS
SELECT ProductID id,
		ProductName name,
		Price price
FROM w3schools.Products;

DESC myProducts;

SELECT * FROM myProducts;
