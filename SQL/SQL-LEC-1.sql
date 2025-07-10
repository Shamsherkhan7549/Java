CREATE DATABASE school;

USE school;

CREATE TABLE students(
id INT PRIMARY KEY  AUTO_INCREMENT,
name VARCHAR(50) NOT NULL,
age INT NOT NULL
);

INSERT INTO students(name, age) VALUES
("Rehan",4),
("Rehnuma",2),
("samar",8),
("sameer",9);

-- Each row - record
-- Each column - field
-- SQL commands are not case-sensitive (but keywords are usually written in UPPERCASE).
-- SQL ends with a semicolon (;)

SELECT * FROM students;
SELECT name FROM students;

-- Practice quesitonns
-- 1. Create a table named courses with fields course_id, course_name, and duration.
CREATE TABLE courses
(
	course_id INT PRIMARY KEY AUTO_INCREMENT,
    course_name VARCHAR(50) NOT NULL,
    duration INT NOT NULL
);

-- 2. Insert two records into the courses table.
INSERT INTO courses(course_name, duration) VALUE
("JAVA", 3),
("C++", 4.5);

-- 3. Write a query to display all data from courses.
SELECT * FROM courses;