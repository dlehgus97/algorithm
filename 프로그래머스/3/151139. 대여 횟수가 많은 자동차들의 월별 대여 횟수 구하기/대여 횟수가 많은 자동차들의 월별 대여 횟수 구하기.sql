SELECT MONTH(START_DATE) AS MONTH, CAR_ID, COUNT(*) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
WHERE CAR_ID IN (SELECT CAR_ID
                 FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
                 WHERE MONTH(START_DATE) >= 8 AND MONTH(START_DATE) <= 10
                 GROUP BY CAR_ID
                 HAVING COUNT(*) >= 5
                ) 
    AND MONTH(START_DATE) >= 8 
    AND MONTH(START_DATE) <= 10
GROUP BY 
    CAR_ID, 
    MONTH(START_DATE)
ORDER BY 
    MONTH, 
    CAR_ID DESC;
