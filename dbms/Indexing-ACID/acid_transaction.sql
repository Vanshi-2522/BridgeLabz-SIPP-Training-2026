-
START TRANSACTION;

INSERT INTO vaccine_data
(country, report_date, total_vaccinated)
VALUES
('India', '2021-06-01', 500000);

INSERT INTO vaccine_data
(country, report_date, total_vaccinated)
VALUES
('USA', '2021-06-01', 650000);

COMMIT;
