
DELIMITER $$

CREATE FUNCTION CalculateMortalityRate(
    p_country VARCHAR(100),
    p_date DATE
)
RETURNS DECIMAL(10,2)

DETERMINISTIC

BEGIN

    DECLARE mortality DECIMAL(10,2);

    SELECT (deaths / confirmed) * 100
    INTO mortality
    FROM covid_cases
    WHERE country = p_country
      AND report_date = p_date;

    RETURN mortality;

END$$

DELIMITER ;
