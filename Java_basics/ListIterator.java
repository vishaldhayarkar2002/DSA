import java.util.*;

public class BidirectionalTraversal {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        ListIterator<String> iterator = names.listIterator();

        System.out.println("Forward Traversal:");
        while (iterator.hasNext()) {
            System.out.println("Index " + iterator.nextIndex() + ": " + iterator.next());
        }

        System.out.println("\nBackward Traversal:");
        while (iterator.hasPrevious()) {
            System.out.println("Index " + iterator.previousIndex() + ": " + iterator.previous());
        }
    }
}


// Key Methods of ListIterator:
// hasNext() → checks if there’s a next element.

// next() → moves forward and returns the element.

// hasPrevious() → checks if there’s a previous element.

// previous() → moves backward and returns the element.

// nextIndex() / previousIndex() → gives the current index.