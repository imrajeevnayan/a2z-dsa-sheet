WITH ranked_exams AS (
    SELECT
        student_id,
        subject,
        score,
        exam_date,
        ROW_NUMBER() OVER (
            PARTITION BY student_id, subject
            ORDER BY exam_date
        ) AS first_rn,
        ROW_NUMBER() OVER (
            PARTITION BY student_id, subject
            ORDER BY exam_date DESC
        ) AS last_rn
    FROM Scores
),
first_last_scores AS (
    SELECT
        student_id,
        subject,
        MAX(CASE WHEN first_rn = 1 THEN score END) AS first_score,
        MAX(CASE WHEN last_rn = 1 THEN score END) AS latest_score
    FROM ranked_exams
    GROUP BY student_id, subject
)
SELECT
    student_id,
    subject,
    first_score,
    latest_score
FROM first_last_scores
WHERE latest_score > first_score
ORDER BY student_id, subject;