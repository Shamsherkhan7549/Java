-- ORDER BY CLAUSE :- Used to sort the result set by one or more columns
USE school;

CREATE TABLE student2
(
	id INT PRIMARY KEY AUTO_INCREMENT, 
    name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    city VARCHAR(50) NOT NULL
);

INSERT INTO student2 (name, age, city) VALUES
	('Ali',	20,	'Delhi'),
	('Meena',	22, 'Mumbai'),
	('Raj',	21,	'Kolkata'),
	('Sara', 22, 'Mumbai');
    
    drop table student2;
    
-- ➤ Sort by age (default is ASC):
SELECT * FROM student2
ORDER BY age;

-- ➤ Sort by name in descending order:
SELECT * FROM student2
ORDER BY age DESC;

-- 🔗 3. Sort by Multiple Columns
SELECT * FROM student2
ORDER BY age, name;

SELECT * FROM student2
ORDER BY age, name DESC;

-- LIMIT CLAUSE:- Use to restrict no of rows returned.alter
SELECT * FROM student2 
LIMIT 3;                   -- get  first three element

-- ➤ Get top 2 oldest students:
SELECT * FROM student2
ORDER BY age DESC 
LIMIT 2;

-- ⚡ Combine WHERE, ORDER BY, and LIMIT
SELECT * FROM student2 
Where age > 20
ORDER BY age DESC
LIMIT 2;

-- 1. Show all students sorted by name in ascending order.
SELECT * FROM student2 
ORDER BY name;

-- 2. Get the top 2 youngest students.
SELECT * FROM student2 
ORDER BY age ASC
LIMIT 2;

-- 3. Display students who are from Delhi, sorted by age descending.
SELECT * FROM student2
WHERE city = 'delhi'
ORDER BY age DESC;

-- 4. Show students aged 22, sorted by name, and limit to 1 result.
SELECT * FROM student2 
WHERE age = 22
ORDER BY name
LIMIT 1;


