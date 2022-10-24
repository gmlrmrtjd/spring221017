-- n : n , 다대다 관계의 테이블

DESC Student;

-- 강의
CREATE TAble Lecture ( 
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL
);
INSERT INTO Lecture (name)
VALUES ('math'), ('english');

SELECT * FROM Lecture;
SELECT * FROM Student;
INSERT INTO Student
(name, age, gender)
VALUES ('lee', 40, 'M');

-- 다대다 관계는 새 테이블을 만들어서 해결 
CREATE TABLE StudentLecture (
	studentId INT NOT NULL,
    lectureId INT NOT NULL,
    FOREIGN KEY (studentId) REFERENCES Student(id),
    FOREIGN KEY (lectureId) REFERENCES Lecture(id),
    PRIMARY KEY (studentId, lectureId)
);

INSERT INTO StudentLecture (studentId, lectureId)
VALUES (1, 1),
		(1, 2),
        (4, 1),
        (4, 2);
        
SELECT * FROM StudentLecture;