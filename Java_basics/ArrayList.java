import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDSADemo {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();

        // 1. Add elements (O(1) amortized)
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After add(e): " + list);

        // 2. Add element at a specific index (O(n))
        list.add(1, 15);
        System.out.println("After add(index, e): " + list);

        // 3. Get element at index (O(1))
        int element = list.get(2);
        System.out.println("get(2): " + element);

        // 4. Set element at index (O(1))
        list.set(2, 25);
        System.out.println("After set(2, 25): " + list);

        // 5. Remove by index (O(n))
        list.remove(1);
        System.out.println("After remove(index 1): " + list);

        // 6. Remove by value (O(n))
        list.remove(Integer.valueOf(25));
        System.out.println("After remove(Object 25): " + list);

        // 7. Size of the list (O(1))
        System.out.println("Size of list: " + list.size());

        // 8. Check if list contains an element (O(n))
        System.out.println("Contains 30? " + list.contains(30));
        System.out.println("Contains 100? " + list.contains(100));

        // 9. Sort the list (O(n log n))
        list.add(5);
        list.add(40);
        System.out.println("Before sorting: " + list);
        Collections.sort(list);
        System.out.println("After sorting: " + list);

        // 10. Iterate using Iterator
        System.out.print("Using iterator(): ");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 11. Iterate using ListIterator (bidirectional)
        System.out.print("Using listIterator() forward: ");
        ListIterator<Integer> lit = list.listIterator();
        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
        }
        System.out.println();

        System.out.print("Using listIterator() backward: ");
        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
        System.out.println();

        // 12. Convert to Array
        Object[] array = list.toArray();
        System.out.print("Converted to Array: ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // 13. Clear the list (O(1))
        list.clear();
        System.out.println("After clear(): " + list);
    }
}
