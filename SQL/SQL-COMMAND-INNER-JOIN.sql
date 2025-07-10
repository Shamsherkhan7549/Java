-- CREATE DB
CREATE DATABASE D07173;

-- TO USE DB
USE D07173;

-- CREATE TABLE
CREATE TABLE student
(
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE,
    course_id INT NOT NULL,
    FOREIGN KEY (course_id) REFERENCES course(course_id)
);

-- INSERT INTO student
INSERT INTO student(name, email, course_id) VALUE
('shams', 'shams@gmail.com', 2),
('dan', 'dan@gmail.com', 4),
('harsh', 'harsh@gmail.com', 5),
('raj', 'raj@gmail.com', 2),
('rahul', 'rahul@gmail.com', 3),
('ram', 'ram@gmail.com', 1),
('rock', 'rock@gmail.com', 1),
('ronny', 'ronny@gmail.com', 5);

-- FETCH STUDENT 
SELECT * FROM STUDENT;
-- TO UPDATE TABLE sutdent
UPDATE student SET course_id = 1 WHERE id = 4;

-- CREATE COURSE
CREATE TABLE course
(
	course_id INT PRIMARY KEY AUTO_INCREMENT,
    course VARCHAR(30) NOT NULL,
    fee INT NOT NULL
);

-- INSERT INTO COURSE
INSERT INTO course(course, fee) VALUE
('java',3000),
('c++',3000),
('c',3000),
('c#',3000),
('js',3000);

-- FETCH COURSE
SELECT * FROM course;



			
SELECT s.name , s.email, c.course, c.fee FROM student s INNER JOIN COURSE c ON s.course_id = c.course_id;

-- RIGHT JOIN
SELECT s.name, s.email, c.course, c.fee FROM student s RIGHT JOIN course c ON s.course_id = c.course_id;

-- LEFT JOIN
SELECT s.name, s.email, c.course, c.fee FROM course c LEFT JOIN student s ON s.course_id = c.course_id;