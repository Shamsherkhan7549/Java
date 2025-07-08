
-- use to create database
CREATE DATABASE D0717;

-- to use databasae
USE D0717;

-- use to create table in database
CREATE TABLE student
(
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  email VARCHAR(50) UNIQUE
);

-- use to fetch all data from student
SELECT * FROM  student;

-- use to store data in table
INSERT INTO student (name, email) VALUES  
('shamsher', "shamsher@gmail.com"),
('khan', "khan@gmail.com"),
('ram', "ram@gmail.com"),
('rahul', "ahul@gmail.com");

-- use to update single data from table
UPDATE student SET email= 'khan123@gmail.com' WHERE id = 2;

DELETE FROM student WHERE id= 2; -- use to delete single data from table

TRUNCATE TABLE student;  -- use to delete all data from table
DROP TABLE student; -- use to delete table
DROP DATABASE d0717;