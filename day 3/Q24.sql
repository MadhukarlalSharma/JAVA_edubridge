SELECT city, COUNT(*) AS total
FROM students
GROUP BY city
ORDER BY total DESC, city;
