-- LIKE : 패턴으로 레코드 조회 
-- 패턴에서 사용하는 특수기호(wildcard) : % (0개 이상의 문자), _(하나의 문자)

-- A로 시작
SELECT * 
FROM Customers 
WHERE CustomerName
LIKE 'A%';

SELECT * 
FROM Customers 
WHERE CustomerName
LIKE '%A';

SELECT * 
FROM Customers 
WHERE CustomerName
LIKE '%OR%';

-- 두번째 글자가 R인
SELECT * 
FROM Customers 
WHERE CustomerName
LIKE '_R%';

-- A로 시작하고 3글자 이상 
SELECT * 
FROM Customers 
WHERE CustomerName
LIKE 'A_%_%';

-- A로 시작하고 O로 끝나는 
SELECT * 
FROM Customers 
WHERE ContacName
LIKE 'A%O';

-- firstName이 A로 시작하는 직원들(Employees)
SELECT * 
FROM Employees 
WHERE firstName
LIKE 'A%';

-- ContactName이 E로 끝나는 공급자들(Suppliers)
SELECT *
FROM Suppliers
WHERE ContactName
LIKE '%E';

-- C로 시작하고 s로 끝나는 상품명들 (Products)
SELECT *
FROM Products
WHERE ProductName
LIKE 'C%s';

-- C로 시작하는 5글자 상품명을 가진 상품들
SELECT *
FROM Products
WHERE ProductName
Like 'C____'
