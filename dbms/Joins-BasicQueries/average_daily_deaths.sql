
SELECT
    report_date,
    AVG(deaths) AS average_daily_deaths
FROM covid_cases
GROUP BY report_date
ORDER BY report_date;
