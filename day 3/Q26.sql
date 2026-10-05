SELECT
    course_id,
    COUNT(*) AS number_of_students,
    ROUND(AVG(marks), 1) AS average_marks,
    MAX(marks) AS highest_marks,
    MIN(marks) AS lowest_marks
FROM enrollments
GROUP BY course_id
HAVING COUNT(*) >= 2;
