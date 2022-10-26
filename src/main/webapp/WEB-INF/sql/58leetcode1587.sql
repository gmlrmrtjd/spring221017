CREATE DATABASE leetcode1587;
USE leetcode1587;
CREATE TABLE Users (
	account INT PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE Transactions (
	trans_id INT PRIMARY KEY,
    account INT,
    amount INT,
    transacted_on DATE
);

INSERT INTO Users (account, name)
VALUES 
(900001, 'Alice'),
(900002, 'Bob'),
(900003, 'Charlie');

INSERT INTO Transactions (trans_id, account, amount, transacted_on)
VALUES
(1, 900001, 7000, '2020-08-01'),
(2, 900001, 7000, '2020-09-01'),
(3, 900001, -3000, '2020-09-02'),
(4, 900002, 1000, '2020-09-12'),
(5, 900003, 6000, '2020-08-07'),
(6, 900003, 6000, '2020-09-07'),
(7, 900003, -4000, '2020-09-11');

SELECT u.name name, SUM(amount) balance
FROM Users AS u JOIN Transactions AS t ON u.account = t.account
GROUP By u.account
HAVING balance >= 10000;




