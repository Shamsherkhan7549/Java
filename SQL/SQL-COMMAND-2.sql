CREATE DATABASE D07172;
USE d07172;

-- use to create table in database
CREATE TABLE student
(
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  email VARCHAR(50) UNIQUE,
  course_id INT NOT NULL,
		FOREIGN KEY (course_id) REFERENCES  course(course_id)
);

-- use to store data in table
INSERT INTO student (name, email,course_id) VALUES  
('shamsher', "shamsher@gmail.com",1),
('khan', "khan@gmail.com",3),
('ram', "ram@gmail.com",1),
('rahul', "ahul@gmail.com",2);
-- use to fetch all data from student
SELECT * FROM  student;
RENAME TABLE student TO student_info;
SELECT * FROM  student_info;
ALTER TABLE student_info CHANGE name fullname VARCHAR(25);
ALTER TABLE student_info ADD age INT ;
SELECT * FROM student_info WHERE id>1 AND id<4;
SELECT * FROM student_info WHERE id IN(1,4);
SELECT * FROM student_info WHERE id NOT IN(1,4);
SELECT * FROM student_info WHERE fullname LIKE 'r%';
SELECT * FROM student_info WHERE fullname NOT LIKE 'r%';

CREATE TABLE course
(
	course_id INT PRIMARY KEY AUTO_INCREMENT,
	course_name VARCHAR(50) NOT NULL,
    course_fee INT NOT NULL
);

INSERT INTO course (course_name, course_fee) VALUES 
('JAVA', 1000),
('C++', 1500),
('C', 1200),
('JS', 1600);
-- use to fetch all data from course
SELECT * FROM  course;