import java.util.HashSet;
public class HashSets {

    public static void main(String[] args) {

        // Creating HashSet
        HashSet<Integer> set = new HashSet<>();

        // add()
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // duplicate, will not be added

        System.out.println("Set: " + set);

        // contains()
        System.out.println("Contains 20: " + set.contains(20));
        System.out.println("Contains 50: " + set.contains(50));

        // size()
        System.out.println("Size: " + set.size());

        // remove()
        set.remove(20);
        System.out.println("After removing 20: " + set);

        // Loop through HashSet
        System.out.println("Elements:");
        for (int num : set) {
            System.out.println(num);
        }

        // isEmpty()
        System.out.println("Is empty: " + set.isEmpty());

        // clear()
        set.clear();
        System.out.println("After clear: " + set);

        System.out.println("Is empty: " + set.isEmpty());
    }
}