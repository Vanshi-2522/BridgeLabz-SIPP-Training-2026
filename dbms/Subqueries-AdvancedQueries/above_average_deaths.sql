
SELECT
    country,
    SUM(deaths) AS total_deaths
FROM covid_cases
GROUP BY country
HAVING SUM(deaths) >
(
    SELECT AVG(total_deaths)
    FROM
    (
        SELECT SUM(deaths) AS total_deaths
        FROM covid_cases
        GROUP BY country
    ) AS avg_deaths
);
