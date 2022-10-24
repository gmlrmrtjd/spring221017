-- 3개의 테이블 엮는 방법 
SELECT *
FROM Customers c JOIN Orders o
				 JOIN Employees e;
                 
                 
-- 총 rows : cRow * oRow * eRow
-- 총 cols : cCol + oCol + eCol
SELECT Count(*) FROM Customers; -- 91 row
SELECT Count(*) FROM Employees; -- 9 row
SELECT Count(*) FROM Orders; -- 830 row
SELECT Count(*)
FROM Customers c JOIN Orders o
				 JOIN Employees e; -- 679770

DESC Customers; -- 7 cols
DESC Orders; -- 5 cols
DESC Employees; -- 6 cols

SELECT c.CustomerName, e.FirstName, e.LastName
FROM Customers c JOIN Orders o ON c.CustomerID = o.CustomerID
				 JOIN Employees e ON o.EmployeeID = e.EmployeeID
WHERE o.OrderDate = '1996-07-04';

-- '1996-07-04'에 주문한 고객, 처리한 직원 이름과 배송자명 조회 
SELECT c.CustomerName, e.LastName, e.FirstName, s.ShipperName
FROM Orders o JOIN Shippers s ON o.ShipperID = s.ShipperID
				JOIN Employees e ON o.EmployeeID = e.EmployeeId
                JOIN Customers c ON o.CustomerID = c.CustomerID
WHERE o.OrderDate = '1996-07-04';

