INSERT INTO courses
    (course_id, title, fee, duration_weeks)
VALUES
    (106, 'Cloud Basics', 9000, 5);

UPDATE courses
SET fee = fee + 500
WHERE duration_weeks <= 6;

SELECT *
FROM courses
ORDER BY fee;
