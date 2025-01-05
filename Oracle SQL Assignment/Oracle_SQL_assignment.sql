CREATE USER Unnati2503 IDENTIFIED BY SQL2003;
GRANT ALL PRIVILEGES TO Unnati2503;

CREATE TABLE dept (
    id INT PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE emp (
    id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    salary INT,
    dept_id INT,
    status VARCHAR(20), 
    position VARCHAR(50),
    FOREIGN KEY (dept_id) REFERENCES dept(id)
);

INSERT INTO dept (id, name) VALUES (1, 'Sales');
INSERT INTO dept (id, name) VALUES (2, 'Marketing');
INSERT INTO dept (id, name) VALUES (3, 'HR');
INSERT INTO dept (id, name) VALUES (4, 'IT');

INSERT INTO emp (id, first_name, last_name, salary, dept_id, status, position) 
VALUES (101, 'Jaggu', 'Singh', 45000, 1, 'Active', 'Sales Manager');
INSERT INTO emp (id, first_name, last_name, salary, dept_id, status, position) 
VALUES (102, 'Jiya', 'Sharma', 52000, 2, 'Active', 'Marketing Executive');
INSERT INTO emp (id, first_name, last_name, salary, dept_id, status, position) 
VALUES (103, 'Sam', 'Singh', 67000, 3, 'Active', 'HR Coordinator');
INSERT INTO emp (id, first_name, last_name, salary, dept_id, status, position) 
VALUES (104, 'Anjali', 'Verma', 95000, 4, 'Active', 'Software Developer');
INSERT INTO emp (id, first_name, last_name, salary, dept_id, status, position) 
VALUES (105, 'Mona', 'Patel', 58000, 1, 'Active', 'Sales Associate');
INSERT INTO emp (id, first_name, last_name, salary, dept_id, status, position) 
VALUES (106, 'Priya', 'Desai', 41000, NULL, 'Inactive', 'HR Assistant');
INSERT INTO emp (id, first_name, last_name, salary, dept_id, status, position) 
VALUES (107, 'Madhav', 'Reddy', 55000, NULL, 'Active', 'Marketing Analyst');
INSERT INTO emp (id, first_name, last_name, salary, dept_id, status, position) 
VALUES (108, 'Jagdish', 'Iyer', 49000, 1, 'Active', 'Sales Representative');
INSERT INTO emp (id, first_name, last_name, salary, dept_id, status, position) 
VALUES (109, 'Jasmin', 'Kumar', 65000, 2, 'Active', 'Marketing Manager');
INSERT INTO emp (id, first_name, last_name, salary, dept_id, status, position) 
VALUES (110, 'Krishna', 'Mehta', 57000, 3, 'Inactive', 'HR Manager');
INSERT INTO emp (id, first_name, last_name, salary, dept_id, status, position) 
VALUES (111, 'Tanu', 'Rajput', 44000, NULL, 'Active', 'Sales Executive');
INSERT INTO emp (id, first_name, last_name, salary, dept_id, status, position) 
VALUES (112, 'Sanya', 'Joshi', 50000, 4, 'Inactive', 'Software Engineer');

--1
SELECT * FROM emp;

--2
SELECT * FROM emp
WHERE dept_id = (SELECT id FROM dept WHERE name = 'Sales');

--3
SELECT first_name, last_name, salary 
FROM emp 
WHERE dept_id = (SELECT id FROM dept WHERE name = 'Marketing')
ORDER BY salary DESC;

--4
SELECT AVG(salary) AS avg_salary
FROM emp
WHERE dept_id = (SELECT id FROM dept WHERE name = 'HR');

--5
SELECT dept_id, COUNT(*) AS total_employees
FROM emp
GROUP BY dept_id;

--6
SELECT DISTINCT position
FROM emp;

--7
SELECT * FROM emp
WHERE first_name LIKE 'J%';

--8
SELECT * FROM emp
WHERE dept_id = (SELECT id FROM dept WHERE name = 'IT') OR salary > 50000;

--9
SELECT first_name, last_name, d.name AS dept_name
FROM emp 
INNER JOIN dept d ON dept_id = d.id;

--10
SELECT e.first_name, e.last_name, d.name AS dept_name
FROM emp e
LEFT JOIN dept d ON e.dept_id = d.id;

--11
SELECT * FROM emp
WHERE salary > (SELECT AVG(salary) FROM emp);

--12
SELECT * FROM emp
WHERE dept_id IN (SELECT id FROM dept WHERE name IN ('Sales', 'Marketing', 'HR'));

--13
SELECT * FROM emp
WHERE salary BETWEEN 40000 AND 60000;

--14
SELECT name FROM dept
WHERE EXISTS (
    SELECT 1 
    FROM emp
    WHERE emp.dept_id = dept.id AND emp.salary > 70000
);

--15
ALTER TABLE emp
ADD hire_date DATE;
UPDATE emp SET hire_date = TO_DATE('2019-04-15', 'YYYY-MM-DD') WHERE id = 101; 
UPDATE emp SET hire_date = TO_DATE('2020-06-20', 'YYYY-MM-DD') WHERE id = 102;
UPDATE emp SET hire_date = TO_DATE('2018-05-30', 'YYYY-MM-DD') WHERE id = 103;
UPDATE emp SET hire_date = TO_DATE('2021-03-25', 'YYYY-MM-DD') WHERE id = 104;
UPDATE emp SET hire_date = TO_DATE('2021-07-10', 'YYYY-MM-DD') WHERE id = 105;
UPDATE emp SET hire_date = TO_DATE('2022-01-05', 'YYYY-MM-DD') WHERE id = 106;
UPDATE emp SET hire_date = TO_DATE('2021-11-15', 'YYYY-MM-DD') WHERE id = 107;
UPDATE emp SET hire_date = TO_DATE('2020-02-20', 'YYYY-MM-DD') WHERE id = 108;
UPDATE emp SET hire_date = TO_DATE('2019-09-12', 'YYYY-MM-DD') WHERE id = 109;
UPDATE emp SET hire_date = TO_DATE('2022-05-15', 'YYYY-MM-DD') WHERE id = 110;
UPDATE emp SET hire_date = TO_DATE('2018-08-25', 'YYYY-MM-DD') WHERE id = 111;
UPDATE emp SET hire_date = TO_DATE('2020-07-30', 'YYYY-MM-DD') WHERE id = 112;

FROM emp
WHERE hire_date > TO_DATE('2020-01-01', 'YYYY-MM-DD');

-16
UPDATE emp
SET salary = salary * 1.10
WHERE dept_id = (SELECT id FROM dept WHERE name = 'IT');

SELECT * FROM emp;

-17
DELETE FROM emp
WHERE status = 'Inactive';
SELECT * FROM emp;

--18
CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100),
    phone_number VARCHAR(20)
);
SELECT * FROM customers;

--19
ALTER TABLE emp
ADD hire_date DATE;

UPDATE emp SET hire_date = TO_DATE('2019-04-15', 'YYYY-MM-DD') WHERE id = 101; 
UPDATE emp SET hire_date = TO_DATE('2020-06-20', 'YYYY-MM-DD') WHERE id = 102;
UPDATE emp SET hire_date = TO_DATE('2018-05-30', 'YYYY-MM-DD') WHERE id = 103;
UPDATE emp SET hire_date = TO_DATE('2021-03-25', 'YYYY-MM-DD') WHERE id = 104;
UPDATE emp SET hire_date = TO_DATE('2021-07-10', 'YYYY-MM-DD') WHERE id = 105;
UPDATE emp SET hire_date = TO_DATE('2022-01-05', 'YYYY-MM-DD') WHERE id = 106;
UPDATE emp SET hire_date = TO_DATE('2021-11-15', 'YYYY-MM-DD') WHERE id = 107;
UPDATE emp SET hire_date = TO_DATE('2020-02-20', 'YYYY-MM-DD') WHERE id = 108;
UPDATE emp SET hire_date = TO_DATE('2019-09-12', 'YYYY-MM-DD') WHERE id = 109;
UPDATE emp SET hire_date = TO_DATE('2022-05-15', 'YYYY-MM-DD') WHERE id = 110;
UPDATE emp SET hire_date = TO_DATE('2018-08-25', 'YYYY-MM-DD') WHERE id = 111;
UPDATE emp SET hire_date = TO_DATE('2020-07-30', 'YYYY-MM-DD') WHERE id = 112;

SELECT * FROM emp;

--20
CREATE TABLE temporary_employees (
    emp_id INT PRIMARY KEY,
    first_name VARCHAR2(50),
    last_name VARCHAR2(50),
    salary NUMBER(10, 2),
    department_id INT,
    status VARCHAR2(20),
    position VARCHAR2(50)
);

DROP TABLE temporary_employees;


