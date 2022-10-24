-- NULL : 필드(컬럼)에 값이 없음
SELECT * FROM Employees;

-- NULL인 필드가 있는 레코드 조회
SELECT * FROM Employees
WHERE Notes = NULL; -- xxx

SELECT * FROM Employees
WHERE Notes IS NULL; -- IS NULL

-- NULL 이 아닌 필드가 있는 레코드 조회
SELECT * FROM Employees
WHERE Notes IS NOT NULL; -- IS NOT NULL

SELECT * FROM Employees
WHERE NOT Notes IS NULL;

-- DESCRIBE : 테이블 구조 조회, 제약사항(Constraints) 조회 
DESC Customers; 


