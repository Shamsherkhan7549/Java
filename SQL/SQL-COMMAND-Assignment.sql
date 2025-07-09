-- create employee table with following information:
--      id,name,email and salalry.

-- create database
CREATE DATABASE ABC;

-- to use database 
USE ABC;

-- to create table
CREATE TABLE employee
(
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(25) NOT NULL,
    email VARCHAR(50) UNIQUE,
    salary INT NOT NULL
);

-- insert record in employee table and perform following task.
INSERT INTO employee(name, email, salary) VALUES
('Danish', 'danish@gmail.com', 15000),
('Harsh', 'harsh@gmail.com', 12000),
('Athrwa', 'athrwa@gmail.com', 14000),
('sadan', 'sadan@gmail.com', 18000),
('shamsher', 'shamsher@gmail.com', 21000);

-- a. Find out the names of all employee.
SELECT  name FROM employee;

-- b. Retrieve the entire contents of the employee table;
SELECT * FROM employee;

-- c. Retrieve the list of names,salary and email of all the employee.
SELECT name,salary FROM employee;

-- d. Destroy the table client_master along with its data 
DROP TABLE employee;

