
SELECT DISTINCT country
FROM covid_cases
WHERE country IN
(
    SELECT country
    FROM covid_cases
    GROUP BY country
    HAVING MAX(confirmed) > 1000000
);
