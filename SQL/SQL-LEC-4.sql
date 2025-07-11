
USE school;

SHOW TABLES; -- it show all tables of database
SELECT * FROM student;

-- It print no of student or row 
SELECT COUNT(*) FROM student;

SELECT avg(age) AS age_avg
FROM student;

SELECT avg(age)  FROM student 
AS age_avg;

SELECT sum(age) FROM student
AS age_sum;

SELECT max(age) AS max_age, max(id) AS max_id
FROM student;

SELECT min(age) AS min_age
FROM student;

