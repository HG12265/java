CREATE DATABASE emp;

-- Connect to the emp database before running the statements below.

CREATE TABLE emp_detail (
    eid INTEGER PRIMARY KEY,
    ename VARCHAR(100),
    eage INTEGER,
    eaddress VARCHAR(200),
    esalary REAL
);

INSERT INTO emp_detail (eid, ename, eage, eaddress, esalary) VALUES
(1, 'Mr.X', 30, 'Salem, Chennai', 50000.0),
(2, 'Mr.X', 25, 'Salem, Chennai', 55000.0);
