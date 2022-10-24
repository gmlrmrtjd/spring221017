USE mydb1;

-- data type
-- 문자열 
-- VARCHAR, CHAR

-- 숫자 
-- INT, DEC 

-- 날짜 
-- DATE, DATETIME 


-- 문자열
-- VARCHAR(size) : size까지의 문자열 저장 가능 
CREATE TABLE myTable01 (
	col1 VARCHAR(5), 
    col2 VARCHAR(2)
);
INSERT INTO myTable01 (col1, col2)
VALUES ('abcde', 'ab'); -- ok
INSERT INTO myTable01 (col1, col2)
VALUES('abc', 'a'); -- ok 
INSERT INTO myTable01 (col1, col2)
VALUES('abc', 'abc'); -- not ok 
INSERT INTO myTable01 (col1, col2)
VALUES ('a', 'b');
SELECT * FROM myTable01;

CREATE TABLE myTable02 (
	col1 VARCHAR(33),
    col2 VARCHAR(30)
);
INSERT INTO myTable02 (col1, col2)
VALUES('k', 'i');

SELECT * FROM myTable02;

-- 이름 : VARCHAR(50)
-- 주소 : VARCHAR(255)

-- CHAR : 고정길이 데이터 저장 
-- CHAR(size) : size만큼 고정길이 데이터 저장 

CREATE TABLE myTable03 (
	col1 VARCHAR(3),
    col2 CHAR(3) 
);
INSERT INTO myTable03 (col1, col2)
VALUES ('abc', 'abc');
INSERT INTO myTable03 (col1, col2)
VALUES('ab', 'ab ');

SELECT * FROM myTable03;



    