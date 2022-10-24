SELECT *
FROM Orders
WHERE OrderDate = '1996-07-04';

SELECT *
FROM OrderDetails
WHERE OrdereID = 10248;

SELECT *
FROM Products
WHERE ProductID IN (11, 42, 72);

-- '1996-07-04' 에 주문된 상품명들 조회
SELECT p.ProductName, o.OrderDate
FROM OrderDetails d JOIN Orders o ON d.OrderID = o.OrderID
					JOIN Products p ON p.ProductID = d.ProductID
WHERE o.OrderDate = '1996-07-04';

-- '1996-07-04' 에 주문된 총 주문 금액 
SELECT SUM(d.Quantity * p.Price)
FROM OrderDetails d JOIN Orders o ON d.OrderID = o.OrderID
					JOIN Products p ON p.ProductID = d.ProductID
WHERE o.OrderDate = '1996-07-04';

-- 각 날짜별 매출액(판매금액)
SELECT o.OrderDate, SUM(d.Quantity * p.Price)
FROM OrderDetails d JOIN Orders o ON d.OrderID = o.OrderID
					JOIN Products p ON p.ProductID = d.ProductID
GROUP By o.OrderDate
ORDER By o.OrderDate;

-- 고객별 주문 총 금액 조회 10000이상 
SELECT c.CustomerID, c.CustomerName, SUM(d.Quantity * p.Price) Total
FROM Customers c JOIN Orders o ON o.CustomerID = c.CustomerID
				 JOIN OrderDetails d ON o.OrderID = d.OrderID
			     JOIN Products p ON p.ProductID = d.ProductID
GROUP BY c.CustomerID
HAVING Total >= 10000
ORDER BY c.CustomerID;
