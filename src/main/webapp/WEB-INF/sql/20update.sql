-- UPDATE 레코드(row)의 필드(column)들을 수정
SELECT * FROM Customers WHERE CustomerID = 1;

-- CustomaerID변경 
UPDATE Customers
SET ContactName = 'Alfred Schmit'
WHERE CustomerID = 1;

-- ContactName, City 동시변경 
UPDATE Customers
SET ContactName = 'Maria Schmit', City = 'Frankfurt'
WHERE CustomerID = 1;

UPDATE Customers
SET CustomerName = 'son',
ContactName = 'HM',
Address = 'london',
City = 'London',
PstalCode = '2222',
Country = 'UK'
WHERE CustomerID = 93;

SELECT * FROM Customers
WHERE CustomerID = 93;


