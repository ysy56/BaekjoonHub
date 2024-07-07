-- 코드를 입력하세요
SELECT p.ID, p.NAME, p.HOST_ID
FROM PLACES AS p, (
                SELECT HOST_ID
                FROM PLACES
                GROUP BY HOST_ID
                HAVING COUNT(HOST_ID) > 1) AS h
WHERE p.HOST_ID = h.HOST_ID
ORDER BY ID;
