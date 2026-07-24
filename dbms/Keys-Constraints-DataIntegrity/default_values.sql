
CREATE TABLE covid_cases (

    country VARCHAR(100),

    report_date DATE,

    confirmed_cases INT,

    deaths INT,

    recoveries INT DEFAULT 0,

    last_updated TIMESTAMP
    DEFAULT CURRENT_TIMESTAMP

);
