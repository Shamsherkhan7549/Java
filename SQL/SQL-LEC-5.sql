CREATE DATABASE college;

USE college;

CREATE TABLE students
(
	id  INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
	age INT NOT NULL,
    marks INT NOT NULL ,
    city VARCHAR(50) NOT NULL
);

INSERT INTO students(name, age, marks, city) VALUES
('Ali',21,78,'Delhi'),
('Meena',22,88,'Mumbai'),
('Raj',21,71,'Kolkata'),
('Sara',22,90,'Mumbai'),
('Omar',20,55,'Delhi');

SELECT * FROM students;
TRUNCATE TABLE students;

-- 🔹 1. What is GROUP BY?
-- GROUP BY is used to group rows that have the same values in specified columns.
-- It is typically used with aggregate functions.

SELECT age, avg(marks) AS avg_marks
FROM students
GROUP BY age;

SELECT city, count(*) AS city_count
FROM students
GROUP BY city;

-- 🔍 2. The HAVING Clause
-- WHERE filters rows before grouping
-- HAVING filters groups after grouping

SELECT city, count(*) AS total_student
FROM students
GROUP BY city
HAVING count(*)>1;


-- Practice questions
-- 1. Group students by age and count how many are in each age group.
SELECT age , COUNT(*) AS student_count
FROM students
GROUP BY age;

-- 2. Show average marks of students grouped by city.
SELECT city , avg(marks) AS avg_marks
FROM students
GROUP BY city;

-- 3. Show only those age groups where the average marks is greater than 80.
SELECT age , avg(marks) AS avg_marks
FROM students
GROUP BY age
HAVING avg(marks)>80;

-- 4. Find the total marks scored by students from each city.
SELECT city , sum(marks) AS total_marks
FROM students
GROUP BY city;

-- 5. Find the city that has more than 1 student.
SELECT city , count(*) AS student_count
FROM students
GROUP BY city
HAVING count(*)>1;

-- SECOND MAXIMUM MARKS
SELECT marks FROM students
ORDER BY marks DESC
LIMIT 1 OFFSET 1;