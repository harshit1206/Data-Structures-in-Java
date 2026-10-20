
import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {

        // 1. Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2. Insert key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        // 3. Print the HashMap
        System.out.println(map);

        // 4. Access a value
        System.out.println(map.get(2));

        // 5. Check if a key exists
        System.out.println(map.containsKey(1));

        // 6. Update a value
        map.put(2, "Orange");

        // 7. Remove an entry
        map.remove(3);

        // 8. Get the size
        System.out.println(map.size());

        // 9. Iterate through the HashMap
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }

        // 10. Get a default value
        System.out.println(map.getOrDefault(4, "Not Found"));
    }
}
