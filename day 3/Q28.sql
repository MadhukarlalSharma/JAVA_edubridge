SELECT
    s.name,
    COUNT(e.course_id) AS course_count
FROM students s
LEFT JOIN enrollments e
    ON s.student_id = e.student_id
GROUP BY s.student_id, s.name
ORDER BY course_count DESC, s.name;
