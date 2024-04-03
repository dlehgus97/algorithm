SELECT I.INGREDIENT_TYPE , SUM(TOTAL_ORDER) TOTAL_ORDER
FROM ICECREAM_INFO I JOIN FIRST_HALF F ON I.FLAVOR = F.FLAVOR
GROUP BY I.INGREDIENT_TYPE
ORDER BY TOTAL_ORDER