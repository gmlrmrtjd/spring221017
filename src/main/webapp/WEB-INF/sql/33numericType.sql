USE mydb1;

-- DATA TYPE
-- Numeric
-- int : 정수
-- DEC : 소수점 있는 형식 

USE mydb1;
CREATE TABLE myTable03 (
	col1 INT(3),
    col2 INT(4),
    col3 INT -- -21억 ~ +21억 (?)
);
INSERT INTO myTable03 (col1, col2, col3)
VALUES (999, 9999, 2100000000); -- ok
INSERT INTO myTable03 (col1, col2, col3)
VALUES (9999, 9999, 2100000000);
INSERT INTO myTable03 (col1, col2, col3)
VALUES (999, 9999, 4200000000); -- not ok
SELECT * FROM myTable03;


CREATE TABLE myTable04 (
	col1 INT(3) ZEROFILL,
    col2 INT(4) ZEROFILL,
    col3 INT -- -21억 ~ +21억 (?)
);
INSERT INTO myTable04 (col1, col2, col3)
VALUES (22, 22, 22);
SELECT * FROM myTable04;-- DEC : 소수점 있는 형식 수 저장
CREATE TABLE myTable05 (
	col1 DEC(3, 1), -- 총 길이 3, 소수점 아래 1
    col2 DEC(5, 2) -- 총 길이 5, 소수점 아래 2
);
INSERT INTO myTable05 (col1, col2)
VALUES (10.5, 200.01); -- ok
INSERT INTO myTable05 (col1, col2)
VALUES (100.5, 200.01); -- not ok
INSERT INTO myTable05 (col1, col2)
VALUES (10.55, 200.01); -- 반올림 입력됨
SELECT * FROM myTable05;

-- INT -> java int, long
-- DEC -> java double, BigDecimal