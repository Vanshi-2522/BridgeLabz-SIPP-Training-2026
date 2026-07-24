
CREATE TABLE covid_audit (

    audit_id INT AUTO_INCREMENT PRIMARY KEY,

    country VARCHAR(100),

    report_date DATE,

    old_confirmed INT,
    new_confirmed INT,

    old_deaths INT,
    new_deaths INT,

    old_recovered INT,
    new_recovered INT,

    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP

);
