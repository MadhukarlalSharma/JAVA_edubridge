SELECT
    s.name,
    c.title AS course_title,
    e.marks
FROM enrollments e
JOIN students s
    ON e.student_id = s.student_id
JOIN courses c
    ON e.course_id = c.course_id
WHERE e.marks IS NOT NULL
ORDER BY e.marks DESC;
