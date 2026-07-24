
SELECT
    country,
    population,
    confirmed,
    ROUND((confirmed / population) * 100, 2) AS infection_rate
FROM covid_cases
ORDER BY infection_rate DESC;
