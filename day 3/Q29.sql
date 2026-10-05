SELECT DISTINCT s.name
FROM students s
JOIN enrollments e
    ON s.student_id = e.student_id
WHERE e.marks > (
    SELECT AVG(marks)
    FROM enrollments
    WHERE marks IS NOT NULL
)
ORDER BY s.name;
