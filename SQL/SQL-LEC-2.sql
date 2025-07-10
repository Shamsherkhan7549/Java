USE school;

CREATE TABLE student
(
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50) NOT NULL,
age INT NOT NULL,
city VARCHAR(50) NOT NULL
);

INSERT INTO student(name, age, city) VALUES
("Ali", 20, "Delhi"),
("Meena", 22, "Mumbai"),
("Rah", 21, "Kolkata"),
("Sara", 22, "Mumbai");

-- WHERE clause
SELECT * FROM student 
WHERE age = 22;

SELECT * FROM student 
WHERE age < 22;

SELECT * FROM student 
WHERE age = 22 AND city = 'Mumbai';

SELECT * FROM student 
WHERE age = 21 OR city = 'Mumbai';

SELECT * FROM student
WHERE NOT city = 'Mumbai';

SELECT * FROM student
WHERE age BETWEEN 20 AND 21;

SELECT * FROM student
WHERE city IN("Kolkata", "Mumbai");

SELECT * FROM student
WHERE name LIKE('M%'); -- select name starts with m

SELECT * FROM student
WHERE name LIKE('%M'); -- select name not ends with m

SELECT * FROM student
WHERE name LIKE('%a%');   -- select name which includes a

-- Practice quesions
-- 1. Find all students who are older than 20.
SELECT * from student
WHERE age>20;
 
 -- 2. Get students who are from either Delhi or Kolkata.
 SELECT * FROM student
 WHERE city = 'Kolkata' OR city = 'Mumbai';
 
 -- 3. Show students whose name ends with 'a'.
SELECT * FROM student
WHERE name LIKE('%A');

-- 4. Find students whose age is between 21 and 23
SELECT * FROM student 
WHERE age BETWEEN 21 AND 23;

