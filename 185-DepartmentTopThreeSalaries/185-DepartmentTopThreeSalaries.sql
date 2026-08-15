-- Last updated: 15/08/2026, 20:05:04
SELECT Department, Employee, Salary
FROM (
    SELECT
        d.Name AS Department,
        e.Name AS Employee,
        e.Salary,
        DENSE_RANK() OVER (
            PARTITION BY d.Name
            ORDER BY e.Salary DESC
        ) AS salary_rank
    FROM Employee e
    JOIN Department d ON e.DepartmentId = d.Id
) ranked
WHERE salary_rank <= 3;