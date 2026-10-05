SELECT name, city
FROM students
WHERE name LIKE 'A%'
   OR city IN ('Chennai', 'Delhi')
ORDER BY name;
