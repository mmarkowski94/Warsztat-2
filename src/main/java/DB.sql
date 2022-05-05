CREATE DATABASE workshop2
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;
use workshop2;

CREATE TABLE users (
    id INT AUTO_INCREMENT,
    email VARCHAR(255) NOT NULL UNIQUE,
    username VARCHAR(255) NOT NULL ,
    password VARCHAR(60) NOT NULL ,
    PRIMARY KEY(id)
);

DESC users;


INSERT INTO users(email, username, password) VALUES (?,?,?);

UPDATE users SET email = ?, username = ?, password = ? WHERE id = ?;

SELECT * FROM users WHERE id = ?;

DELETE FROM users WHERE id = ?;

SELECT * FROM users;




