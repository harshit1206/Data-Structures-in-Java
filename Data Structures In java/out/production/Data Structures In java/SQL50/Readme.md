# SQL 50 — First 5 Problems

## 1. 1757. Recyclable and Low Fat Products

**Concept:** `WHERE`, `AND`

Select products that are both low fat and recyclable.

```sql
SELECT product_id
FROM Products
WHERE low_fats = 'Y'
  AND recyclable = 'Y';
```

**Remember:** Use `AND` when both conditions must be true.

---

## 2. 584. Find Customer Referee

**Concept:** `WHERE`, `OR`, `IS NULL`

Find customers who were not referred by customer 2. Customers with no referee (`NULL`) should also be included.

```sql
SELECT name
FROM Customer
WHERE referee_id != 2
   OR referee_id IS NULL;
```

**Remember:** `NULL` cannot be checked using `= NULL` or `!= NULL`. Use `IS NULL` or `IS NOT NULL`.

---

## 3. 595. Big Countries

**Concept:** `WHERE`, `OR`

Find countries with an area of at least 3 million or a population of at least 25 million.

```sql
SELECT name, population, area
FROM World
WHERE area >= 3000000
   OR population >= 25000000;
```

**Remember:** `OR` means either condition can be true.

---

## 4. 1148. Article Views I

**Concept:** `WHERE`, comparing columns, `DISTINCT`, `ORDER BY`

Find authors who viewed at least one of their own articles. Return each author only once and sort the IDs in ascending order.

```sql
SELECT DISTINCT author_id AS id
FROM Views
WHERE author_id = viewer_id
ORDER BY id ASC;
```

**Remember:**
- `author_id = viewer_id` identifies an author viewing their own article.
- `DISTINCT` removes duplicate IDs.
- `ORDER BY ... ASC` sorts in ascending order.

---

## 5. 1683. Invalid Tweets

**Concept:** `WHERE`, `CHAR_LENGTH()`

Find the IDs of tweets whose content has more than 15 characters.

```sql
SELECT tweet_id
FROM Tweets
WHERE CHAR_LENGTH(content) > 15;
```

**Remember:** `CHAR_LENGTH()` returns the number of characters in a string.

---

## 6. 175. Combine Two Tables

**Concept:** `LEFT JOIN`

Return each person's first name, last name, city, and state. If no address exists, return `NULL` for city and state.

### Solution

```sql
SELECT p.firstName, p.lastName, a.city, a.state
FROM Person p
LEFT JOIN Address a
ON p.personId = a.personId;
````

### Remember

- `LEFT JOIN` keeps all rows from the left table (`Person`).
- If no matching address exists, `city` and `state` return `NULL`.
- `ON` specifies how the two tables are matched.



# 7. 176. Second Highest Salary

**Concept:** `DISTINCT`, Subquery, `LIMIT`, `OFFSET`

Find the second highest distinct salary. If it doesn't exist, return `NULL`.

## Solution

```sql
SELECT (
    SELECT DISTINCT salary
    FROM Employee
    ORDER BY salary DESC
    LIMIT 1 OFFSET 1
) AS SecondHighestSalary;
````

Remember:

- `DISTINCT` removes duplicates.
- `ORDER BY ... DESC` sorts highest to lowest.
- `LIMIT 1 OFFSET 1` skips the highest salary and selects the second.
- If no second salary exists, the result is `NULL`.



# 8. 1581. Customer Who Visited but Did Not Make Any Transactions

**Concept:** `LEFT JOIN`, `IS NULL`, `COUNT()`, `GROUP BY`

Find customers who visited without making any transactions and count these visits.

## Solution

```sql
SELECT v.customer_id, COUNT(v.visit_id) AS count_no_trans
FROM Visits v
LEFT JOIN Transactions t
ON t.visit_id = v.visit_id
WHERE t.transaction_id IS NULL
GROUP BY v.customer_id;
````

Remember:

- `LEFT JOIN` keeps all visits, even when no transaction exists.
- `WHERE t.transaction_id IS NULL` finds visits without transactions.
- `COUNT(v.visit_id)` counts visits with no transactions.
- `GROUP BY v.customer_id` gives the count for each customer.
