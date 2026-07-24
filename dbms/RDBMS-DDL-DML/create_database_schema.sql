
-- Create Database
CREATE DATABASE covid_db;

-- Select Database
USE covid_db;

-- Create covid_cases Table
CREATE TABLE covid_cases (

    id INT AUTO_INCREMENT PRIMARY KEY,

    report_date DATE,

    report_time TIME,

    state VARCHAR(100),

    confirmed_indian_national INT,

    confirmed_foreign_national INT,

    recoveries INT,

    deaths INT,

    confirmed_cases INT

);

-- Create covid_deaths Table
CREATE TABLE covid_deaths (

    id INT AUTO_INCREMENT PRIMARY KEY,

    country VARCHAR(100),

    report_date DATE,

    deaths INT

);

-- Create covid_vaccines Table
CREATE TABLE covid_vaccines (

    id INT AUTO_INCREMENT PRIMARY KEY,

    country VARCHAR(100),

    report_date DATE,

    vaccinated_people INT

);
