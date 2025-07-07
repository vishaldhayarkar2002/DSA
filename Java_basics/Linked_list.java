import java.util.*;

public class LinkedListDSADemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // --- Add Methods ---
        list.add(10);                        // [10]
        list.add(20);                        // [10, 20]
        list.add(1, 15);                     // [10, 15, 20]
        list.addFirst(5);                    // [5, 10, 15, 20]
        list.addLast(25);                    // [5, 10, 15, 20, 25]

        System.out.println("After adding: " + list);

        // --- Remove Methods ---
        list.remove();                       // removes 5
        list.remove(1);                      // removes 15
        list.remove(Integer.valueOf(20));    // removes value 20
        list.removeFirst();                  // removes 10
        list.removeLast();                   // removes 25

        System.out.println("After removing: " + list);

        // --- Get/Set Methods ---
        list.add(100);                       // [100]
        list.add(200);                       // [100, 200]
        System.out.println("Element at index 1: " + list.get(1));  // 200
        list.set(1, 300);                    // [100, 300]
        System.out.println("After set: " + list);

        // --- Size and Contains ---
        System.out.println("Size: " + list.size());               // 2
        System.out.println("Contains 100: " + list.contains(100)); // true
        System.out.println("Contains 200: " + list.contains(200)); // false

        // --- Clear ---
        list.clear();                        // []
        System.out.println("After clear: " + list);

        // --- Deque Operations ---
        LinkedList<String> deque = new LinkedList<>();
        deque.offerFirst("A");               // [A]
        deque.offerLast("B");                // [A, B]
        deque.offerLast("C");                // [A, B, C]
        System.out.println("Deque: " + deque);

        System.out.println("pollFirst(): " + deque.pollFirst());  // A
        System.out.println("pollLast(): " + deque.pollLast());    // C
        System.out.println("peekFirst(): " + deque.peekFirst());  // B
        System.out.println("peekLast(): " + deque.peekLast());    // B

        // --- Iteration ---
        deque.addFirst("X");
        deque.addLast("Y");
        System.out.println("\nForward iteration:");
        for (String s : deque) {
            System.out.print(s + " ");       // X B Y
        }

        System.out.println("\n\nBidirectional iteration:");
        ListIterator<String> it = deque.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " "); // X B Y
        }

        System.out.println("\n\nReverse iteration:");
        Iterator<String> rev = deque.descendingIterator();
        while (rev.hasNext()) {
            System.out.print(rev.next() + " "); // Y B X
        }
    }
}


// output
// After adding: [5, 10, 15, 20, 25]
// After removing: []
// Element at index 1: 200
// After set: [100, 300]
// Size: 2
// Contains 100: true
// Contains 200: false
// After clear: []
// Deque: [A, B, C]
// pollFirst(): A
// pollLast(): C
// peekFirst(): B
// peekLast(): B

// Forward iteration:
// X B Y 

// Bidirectional iteration:
// X B Y 

// Reverse iteration:
// Y B X
