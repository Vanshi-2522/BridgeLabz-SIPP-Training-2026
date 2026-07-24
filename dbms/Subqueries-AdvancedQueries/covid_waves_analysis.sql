
SELECT
    c1.state,
    c1.report_date,
    c1.confirmed,
    CASE
        WHEN c1.confirmed =
        (
            SELECT MAX(c2.confirmed)
            FROM covid_cases c2
            WHERE c2.state = c1.state
        )
        THEN 'Peak Wave'
        ELSE 'Normal Day'
    END AS wave_status
FROM covid_cases c1
WHERE c1.state = 'Mumbai'
ORDER BY c1.report_date;
