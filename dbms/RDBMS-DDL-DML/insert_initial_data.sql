
USE covid_db;

INSERT INTO covid_cases
(report_date,
report_time,
state,
confirmed_indian_national,
confirmed_foreign_national,
recoveries,
deaths,
confirmed_cases)

VALUES
('2020-03-15',
'10:00:00',
'India',
95,
5,
50,
2,
100);

-- Additional Sample Records

INSERT INTO covid_cases
(report_date, report_time, state,
confirmed_indian_national,
confirmed_foreign_national,
recoveries,
deaths,
confirmed_cases)

VALUES
('2020-03-15','10:00:00','USA',180,20,80,5,200),

('2020-03-15','10:00:00','UK',140,10,60,3,150),

('2020-03-16','10:00:00','India',110,10,70,3,120),

('2020-03-16','10:00:00','USA',220,30,100,7,250),

('2020-03-16','10:00:00','UK',170,15,80,4,190);
