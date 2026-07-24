
CREATE TABLE countries (

    country_id INT AUTO_INCREMENT PRIMARY KEY,
    country_name VARCHAR(100) UNIQUE NOT NULL

);

CREATE TABLE covid_cases (

    country_id INT,
    report_date DATE,
    confirmed_cases INT,
    deaths INT,
    recoveries INT,

    PRIMARY KEY (country_id, report_date),

    CONSTRAINT fk_country
    FOREIGN KEY (country_id)
    REFERENCES countries(country_id)

);
