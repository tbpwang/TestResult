DROP DATABASE IF EXISTS practice;
CREATE DATABASE practice;

DROP TABLE IF EXISTS practice.student;
CREATE TABLE practice.student(
  sNo VARCHAR(255),
  name VARCHAR(255),
  sex VARCHAR(10),
  age INT,
  major VARCHAR(255)
);

DROP TABLE IF EXISTS practice.A;
CREATE TABLE practice.A AS SELECT * FROM practice.student;

DROP TABLE IF EXISTS practice.B;
CREATE TABLE practice.B AS SELECT * FROM practice.student;

SELECT *
FROM practice.A;

INSERT INTO practice.B(sNo, name, sex, age, major) VALUES ('1','1','1',20,'1');
INSERT INTO practice.B(sNo, name, sex, age, major) VALUES ('2','1','1',17,'1');
INSERT INTO practice.B(sNo, name, sex, age, major) VALUES ('3','1','1',18,'1');
INSERT INTO practice.B(sNo, name, sex, age, major) VALUES ('4','1','1',19,'1');
INSERT INTO practice.B(sNo, name, sex, age, major) VALUES ('5','1','1',21,'1');

INSERT INTO practice.A SELECT *
                       FROM practice.B WHERE age >18;;