
-- use to create database
CREATE DATABASE D07171;

-- to use databasae
USE D07171;

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

TRUNCATE TABLE student;  -- use to delete all data from table
DROP TABLE course; -- use to delete table
DROP DATABASE d0717;