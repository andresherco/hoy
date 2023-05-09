CREATE DATABASE AFHC;
USE AFHC;
CREATE TABLE users_tbl (
                           user_id INT PRIMARY KEY auto_increment,
                           user_firstname VARCHAR(40) NOT NULL,
                           user_lastname VARCHAR(40) NOT NULL,
                           user_email VARCHAR(60) NOT NULL,
                           user_password VARBINARY(256));
INSERT INTO users_tbl (user_firstname, user_lastname, user_email, user_password)
VALUES (UPPER('ANDRES'), UPPER('HERNANDEZ'), 'andresherco@gmail.com',AES_ENCRYPT("Emerica100",'$2a$12$rDp6jto0QwVKSu1ryFTOv.jLWx/2dqdcsYkwNfHgkfKtB3jdVP49a'));
SELECT * FROM users_tbl;

SELECT *,
       CAST(AES_DECRYPT(user_password,'$2a$12$rDp6jto0QwVKSu1ryFTOv.jLWx/2dqdcsYkwNfHgkfKtB3jdVP49a') AS CHAR(50))
           end_data FROM users_tbl WHERE user_id = 1;