-- Create database
CREATE DATABASE IF NOT EXISTS library;

-- Use the database
USE library;

-- Create tables
CREATE TABLE IF NOT EXISTS Book (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    author VARCHAR(255),
    description VARCHAR(255)
    );

-- Insert initial data
INSERT INTO Book (title, author, description) VALUES ('Book 1', 'Author 1', 'Description 1');
INSERT INTO Book (title, author, description) VALUES ('Book 2', 'Author 2', 'Description 2');
