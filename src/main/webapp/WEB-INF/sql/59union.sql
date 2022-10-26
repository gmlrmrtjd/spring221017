USE mydb6;
-- 합집합 
SELECT * FROM TableA
UNION
SELECT * FROM TableB;

-- 중복 포함 전체 
SELECT * FROM TableA
UNION ALL
SELECT * FROM TableB;

-- FULL OUTER JOIN 
SELECT * FROM TableA a LEFT JOIN TableB ON a.col1 = b.col1
UNION
SELECT * FROM TableA a RIGHT JOIN TableB ON a.col1 = b.col1;
