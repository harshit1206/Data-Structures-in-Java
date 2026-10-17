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

## Quick Revision

| Concept | Use |
|---|---|
| `WHERE` | Filters rows using a condition |
| `AND` | All conditions must be true |
| `OR` | At least one condition must be true |
| `IS NULL` | Checks for missing (`NULL`) values |
| `DISTINCT` | Removes duplicate results |
| `ORDER BY ... ASC` | Sorts in ascending order |
| `CHAR_LENGTH()` | Counts characters in a string |
