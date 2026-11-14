SELECT
    customer_id,
    COUNT(*) AS total_orders,
    ROUND(
        100 * AVG(
            CASE
                WHEN TIME(order_timestamp) BETWEEN '11:00:00' AND '14:00:00'
                  OR TIME(order_timestamp) BETWEEN '18:00:00' AND '21:00:00'
                THEN 1
                ELSE 0
            END
        )
    ) AS peak_hour_percentage,
    ROUND(AVG(order_rating), 2) AS average_rating
FROM restaurant_orders
GROUP BY customer_id
HAVING COUNT(*) >= 3
   AND AVG(
        CASE
            WHEN TIME(order_timestamp) BETWEEN '11:00:00' AND '14:00:00'
              OR TIME(order_timestamp) BETWEEN '18:00:00' AND '21:00:00'
            THEN 1
            ELSE 0
        END
   ) >= 0.6
   AND AVG(order_rating) >= 4.0
   AND AVG(CASE WHEN order_rating IS NOT NULL THEN 1 ELSE 0 END) >= 0.5
ORDER BY average_rating DESC, customer_id DESC;