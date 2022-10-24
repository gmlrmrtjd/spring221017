USE w3schools;

SELECT * FROM Employees ORDER BY EmployeeID DESC;   
-- INSERT INTO : 테이블에 레코드 추가하는 명령문
INSERT INTO Employees 
(EmployeeID, LastName, FirstName, BirthDate, Photo, Notes)
VALUES
(10, 'Son', 'HM', '1999-01-01', 'EmpID10.pic', 'soccer player');

-- 11번째 직원 추가 
INSERT INTO Employees 
(EmployeeID, LastName, FirstName, BirthDate, Photo, Notes)
VALUES
(11, 'Tony', 'Stark', '1980-01-01', 'EmpID11.pic', 'ironman');

-- 12번째 직원 추가, notes 컬럼 빼고
INSERT INTO Employees
(EmployeeID, LastName, FirstName, BirthDate, Photo)
VALUES
(12, 'Black', 'Panther', '1970-01-01', 'EmpID12.pic');

-- 13번째 직원 추가, birthDate, notes 컬럼 빼고
INSERT INTO Employees
(EmployeeID, LastName, FirstName, Photo)
VALUES
(13, 'Doctor', 'Strange', 'EmpID13.pic');

-- 새 직원 추가 , EmployeeID컬럼 빼고
INSERT INTO Employees
(LastName, FirstName)
VALUES
('Natasha', 'Romanoff');

INSERT INTO Employees
(LastName, FirstName, Notes)
VALUES
('Kim', 'kildong', '');

INSERT INTO Employees
(LastName, FirstName, Notes)
VALUES
('Kim', 'kildong2', ' ');

-- NULL은 값이 없음

INSERT INTO Employees
(LastName, FirstName) VALUES ('Wonsik', 'Jung');

INSERT INTO Employees
(EmployeeID, LastName, FirstName) VALUES (12, 'Wonsik', 'Jung');