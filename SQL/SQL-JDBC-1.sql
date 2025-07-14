-- CREATE DB
CREATE DATABASE db0717;

-- to use databasae
USE DB0717;

-- use to create table in database
CREATE TABLE student
(
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  email VARCHAR(50) UNIQUE,
  password VARCHAR(50)
);

-- use to fetch all data from student
SELECT * FROM  student;
DELETE  FROM student WHERE id = 3;
DROP TABLE student;

-- use to update single data from table
UPDATE student SET email= 'khan123@gmail.com' WHERE id = 2;

-- use to store data in table
INSERT INTO student (name, email) VALUES  
('shamsher', "shamsher1@gmail.com"),
('khan', "khan1@gmail.com"),
('ram', "ram1@gmail.com"),
('rahul', "ahul1@gmail.com");

DELETE FROM student WHERE id= 2; -- use to delete single data from table

TRUNCATE TABLE student;  -- use to delete all data from table
DROP TABLE student; -- use to delete table
DROP DATABASE d0717;