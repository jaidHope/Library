-- Create database
CREATE DATABASE IF NOT EXISTS library;

-- Use the database
USE library;

-- Create tables
CREATE TABLE IF NOT EXISTS books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    author VARCHAR(255)
    );

-- Insert initial data
INSERT INTO books (title, author) VALUES ('Book 1', 'Author 1');
INSERT INTO books (title, author) VALUES ('Book 2', 'Author 2');
