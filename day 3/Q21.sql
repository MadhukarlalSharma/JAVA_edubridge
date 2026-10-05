CREATE TABLE fees (
    fee_id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT NOT NULL,
    amount DECIMAL(10,2) NOT NULL CHECK (amount > 0),
    paid_on DATE,
    FOREIGN KEY (student_id)
        REFERENCES students(student_id)
);

INSERT INTO fees (student_id, amount, paid_on)
VALUES
    (1, 5000, '2026-09-01'),
    (2, 7000, '2026-09-02'),
    (1, 3000, '2026-09-03');

SELECT * FROM fees;
