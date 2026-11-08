CREATE DATABASE IF NOT EXISTS college;
USE college;

CREATE TABLE IF NOT EXISTS students (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(50) NOT NULL,
    department VARCHAR(30) NOT NULL
);

INSERT INTO students (student_id, student_name, department)
VALUES
    (101, 'Ravi', 'CSE'),
    (102, 'Priya', 'AIML'),
    (103, 'Kiran', 'CSE')
ON DUPLICATE KEY UPDATE
    student_name = VALUES(student_name),
    department = VALUES(department);

SELECT * FROM students;
