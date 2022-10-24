-- PRIMARY KEY : NOT NULL, UNIQUE 조합

CREATE TABLE MyTable16 (
	col1 INT,
    col2 INT NOT NULL UNIQUE,
    col3 int PRIMARY KEY
);
DESC MyTable16;
INSERT INTO MyTable16 (col1, col2, col3)
VALUES (1, 1, 1);
INSERT INTO MyTable16 (col1, col2, col3)
VALUES (1, 2, 2);
INSERT INTO MyTable16 (col1, col2, col3)
VALUES (1, 2, 3);
INSERT INTO MyTable16 (col1, col2, col3)
VALUES (1, 3, 2);
INSERT INTO MyTable16 (col1, col2)
VALUES (1, 3);
SELECT * FROM MyTable16;

