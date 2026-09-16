
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

When you see a problem involving **"duplicates", "already seen", "exists or not"**, think **HashSets**.

[Click here to view the complete code → `HashSets.java`](HashSets.java)



# Strings in Java

A `String` is a sequence of characters in Java.

## Declaration

```java
String name = "Tony";
```

## Taking Input

```java
Scanner sc = new Scanner(System.in);
String name = sc.next();
```

---

## Common String Functions

| Function | Example | Brief Explanation |
| -------- | ------- | ----------------- |
| `length()` | `str.length();` | Returns the length of the String. |
| `charAt(index)` | `str.charAt(2);` | Returns the character at the given index. |
| `equals(str)` | `str1.equals(str2);` | Compares the contents of two Strings. |
| `substring(start, end)` | `str.substring(0, 4);` | Returns a part of the String. |
| `parseInt()` | `Integer.parseInt(str);` | Converts String to `int`. |
| `toString()` | `Integer.toString(num);` | Converts `int` to String. |

---

## Concatenation

Concatenation means joining two Strings.

```java
String firstName = "Tony";
String secondName = "Stark";

String fullName = firstName + " " + secondName;

System.out.println(fullName);
```

Output:

```text
Tony Stark
```

---

## Print Length

```java
String name = "Tony";

System.out.println(name.length());
```

---

## Access Characters

String indexing starts from `0`.

```java
String name = "Tony";

for(int i = 0; i < name.length(); i++) {
    System.out.println(name.charAt(i));
}
```

---

# Comparing Strings

Use `.equals()` to compare String contents.

```java
String name1 = "Tony";
String name2 = "Tony";

if(name1.equals(name2)) {
    System.out.println("They are the same string");
}
```

> **Do not use `==` to check String equality.**

`==` checks references, while `.equals()` checks the String contents.

---

# Substring

A substring is a subpart of a String.

```java
String name = "TonyStark";

System.out.println(name.substring(0, 4));
```

Output:

```text
Tony
```

> The `end` index is excluded.

---

# String ↔ Integer

## String → int

```java
String str = "123";

int number = Integer.parseInt(str);
```

## int → String

```java
int number = 123;

String str = Integer.toString(number);
```

---
## Note: Strings are Immutable

[Click here to view the complete code → `Strings.java`](Strings.java)