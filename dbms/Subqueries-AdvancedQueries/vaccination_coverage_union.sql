
SELECT
    country,
    vaccinated AS population_count,
    'Vaccinated' AS category
FROM vaccination_data

UNION

SELECT
    country,
    unvaccinated,
    'Unvaccinated'
FROM vaccination_data;
