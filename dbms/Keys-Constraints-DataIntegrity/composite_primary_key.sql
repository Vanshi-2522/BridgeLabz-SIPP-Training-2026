
CREATE TABLE covid_cases (

    country VARCHAR(100),
    report_date DATE,
    confirmed_cases INT,
    deaths INT,
    recoveries INT,

    PRIMARY KEY (country, report_date)

);
