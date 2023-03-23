CREATE database mydb;
use mydb;
CREATE TABLE task (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description VARCHAR(255),
    completed VARCHAR(255) NOT NULL
);

SELECT * FROM task;

drop table task;
