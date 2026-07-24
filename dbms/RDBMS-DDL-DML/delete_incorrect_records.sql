
USE covid_db;

DELETE FROM covid_cases

WHERE state = 'IN';

-- Example for deleting duplicate records
-- (Assuming duplicate IDs exist)

DELETE FROM covid_cases

WHERE id NOT IN
(
SELECT MIN(id)
FROM covid_cases
GROUP BY state, report_date
);
