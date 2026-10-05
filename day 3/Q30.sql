SELECT
    s.name,
    c.title AS course_title,
    e.marks,
    CASE
        WHEN e.marks IS NULL THEN 'N/A'
        WHEN e.marks >= 85 THEN 'A'
        WHEN e.marks >= 70 THEN 'B'
        WHEN e.marks >= 50 THEN 'C'
        ELSE 'D'
    END AS grade
FROM enrollments e
JOIN students s
    ON e.student_id = s.student_id
JOIN courses c
    ON e.course_id = c.course_id
WHERE e.course_id IN (101, 103)
ORDER BY c.course_id, e.marks DESC;
