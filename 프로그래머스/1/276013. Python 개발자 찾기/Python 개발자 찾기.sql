SELECT ID , EMAIL , FIRST_NAME , LAST_NAME
FROM DEVELOPER_INFOS
WHERE SKILL_1 = 'python' OR SKILL_2 = 'python' OR SKILL_3 = 'python'
ORDER BY ID