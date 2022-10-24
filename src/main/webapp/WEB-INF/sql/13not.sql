-- NOT : false -> true, true -> false

SELECT * FROM Customers;
SELECT * FROM Customers WHERE Country = 'Germany';
SELECT * FROM Customers WHERE Country <> 'Germany';
SELECT * FROM Customers WHERE Country != 'Germany';
SELECT * FROM Customers WHERE NOT Country = 'Germany';

-- 미국 (USA) 살지 않는 고객들 
SELECT * 
FROM Customers 
WHERE NOT Country = 'USA';

-- USA있지 않는 공급자들 (Suppliers)
SELECT *
FROM Suppliers
WHERE NOT Country = 'USA';


