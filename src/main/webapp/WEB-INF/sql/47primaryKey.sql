USE mydb2;
-- 학생 Tabel
-- id, 이름, 나이, 성별
CREATE TABLE Student (
	id INT PRIMARY KEY AUTO_INCREMENT, -- UNIQUE and NOT NULL, -- primary Key
	name VARCHAR(255),
    age INT,
    gender VARCHAR(1)
);
DROP TABLE Student;

INSERT INTO Student (id, name, age, gender)
VALUES (1, 'kim', 30, 'F');
INSERT INTO Student (id, name, age, gender)
VALUES (2, 'lee', 40, 'M');

INSERT INTO Student(name, age, gender)
VALUES ('choi', 50, 'F'); -- 자동으로 primaryKey 생성 

SELECT * FROM Student;

DELETE FROM Student WHERE id = 2;
DELETE FROM Student WHERE id = 3;

INSERT INTO Student (name, age, gender)
VALUES ('park', 60, 'M');