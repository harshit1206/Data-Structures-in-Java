
# 1. ArrayList in Java

`ArrayList` is a resizable array in Java. Unlike normal arrays, its size can grow or shrink dynamically when elements are added or removed.

It belongs to the `java.util` package.

## Import

```java
import java.util.ArrayList;
import java.util.Collections;
````

## Creating an ArrayList

```java
ArrayList<Integer> list = new ArrayList<>();
```

`ArrayList` can store different types:

```java
ArrayList<Integer>
ArrayList<Float>
ArrayList<String>
ArrayList<Boolean>
```

> Use wrapper classes like `Integer` instead of primitive types like `int`.

---

## Common ArrayList Functions

| Function                 | Example                   | Brief Explanation                           |
| ------------------------ | ------------------------- | ------------------------------------------- |
| `add(x)`                 | `list.add(10);`           | Adds an element at the end of the list.     |
| `add(index, x)`          | `list.add(2, 10);`        | Adds an element at a specific index.        |
| `get(index)`             | `list.get(2);`            | Returns the element at the given index.     |
| `set(index, x)`          | `list.set(2, 10);`        | Replaces the element at the given index.    |
| `remove(index)`          | `list.remove(2);`         | Removes the element at the given index.     |
| `size()`                 | `list.size();`            | Returns the number of elements in the list. |
| `Collections.sort(list)` | `Collections.sort(list);` | Sorts the list in ascending order.          |


## Example

[Click here to view the complete code → `ArrayLists.java`](ArrayLists.java)

# 2. Hashset In Java

`HashSets` is a collection in Java that stores **unique elements**. Unlike an `ArrayList`, a `HashSets` does not allow duplicate values and does not maintain a guaranteed order.

It belongs to the `java.util` package.

## Import

```java
import java.util.HashSets;
```

---

## Creating a HashSets

```java
HashSets<Integer> set = new HashSets<>();
```

`HashSets` can store different types:

```java
HashSets<Integer>
HashSets<Float>
HashSets<String>
HashSets<Boolean>
```

> Use wrapper classes like `Integer` instead of primitive types like `int`.

---

## Common HashSets Functions

| **Function**  | **Example**         | **Brief Explanation**                                                   |
| ------------- | ------------------- | ----------------------------------------------------------------------- |
| `add(x)`      | `set.add(10);`      | Adds an element to the set.                                             |
| `contains(x)` | `set.contains(10);` | Checks whether an element exists in the set. Returns `true` or `false`. |
| `remove(x)`   | `set.remove(10);`   | Removes an element from the set.                                        |
| `size()`      | `set.size();`       | Returns the number of unique elements.                                  |
| `isEmpty()`   | `set.isEmpty();`    | Checks whether the set is empty.                                        |
| `clear()`     | `set.clear();`      | Removes all elements from the set.                                      |

---

## Important Property: No Duplicates

```java
HashSets<Integer> set = new HashSets<>();

set.

add(10);
set.

add(20);
set.

add(10);
set.

add(30);
```

The set will contain:

```text
[10, 20, 30]
```

The second `10` is **ignored** because it already exists.

---

## Checking an Element

```java
if (set.contains(20)) {
    System.out.println("Present");
}
```

`contains()` is especially useful in DSA when you need to quickly check whether an element already exists.

---

## Loop Through HashSets

```java
for (int num : set) {
    System.out.println(num);
}
```

> Remember: **HashSets does not guarantee insertion order**, so don't rely on the order of elements when looping.

---

## Example

```java
import java.util.HashSets;

public class HashSets {
    public static void main(String[] args) {

        HashSets<Integer> set = new HashSets<>();

        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);

        System.out.println(set);

        System.out.println(set.contains(20));

        set.remove(20);

        System.out.println(set.size());
    }
}
```

### 🧠 ArrayList vs HashSets

|              | ArrayList                 | HashSets                       |
| ------------ | ------------------------- | ----------------------------- |
| Duplicates   | ✅ Allowed                 | ❌ Not allowed                 |
| Index        | ✅ Yes                     | ❌ No                          |
| `get(index)` | ✅ Yes                     | ❌ No                          |
| `contains()` | ✅ Yes                     | ✅ Yes                         |
| Order        | Maintains insertion order | No guaranteed order           |
| Main use     | Store/access elements     | Fast lookup + unique elements |

**DSA tip:** When you see a problem involving **"duplicates", "already seen", "exists or not"**, think **HashSets**.
