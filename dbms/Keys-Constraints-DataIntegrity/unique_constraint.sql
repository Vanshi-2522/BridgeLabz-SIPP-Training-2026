
CREATE TABLE covid_cases (

    country VARCHAR(100),

    report_date DATE,

    confirmed_cases INT,

    deaths INT,

    recoveries INT,

    CONSTRAINT unique_country_date
    UNIQUE (country, report_date)

);
