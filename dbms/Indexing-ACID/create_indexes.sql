
-- Composite Index
CREATE INDEX idx_country_date
ON covid_cases(country, report_date);

-- Single Column Index
CREATE INDEX idx_report_date
ON covid_cases(report_date);

-- Example Query
SELECT *
FROM covid_cases
WHERE country = 'India'
AND report_date = '2021-06-01';
