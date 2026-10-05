SELECT name, city, age
FROM students
WHERE age > 20
  AND city <> 'Hyderabad'
ORDER BY age DESC;
