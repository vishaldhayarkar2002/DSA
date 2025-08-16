List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

// Binary search (list must be sorted)
Collections.sort(names);
int index = Collections.binarySearch(names, "Bob"); // returns 1

// Unsorted search
int freq = Collections.frequency(names, "Alice"); // returns 1

// Swap elements
Collections.swap(list, 0, 4);

// Rotate elements
Collections.rotate(list, 2);

// Replace all occurrences
Collections.replaceAll(list, "default", "newValue");

// Check for common elements
boolean disjoint = Collections.disjoint(list1, list2);

// Add multiple elements
Collections.addAll(list, "a", "b", "c");

// Reverse order
Collections.reverse(list);

// Copy elements
Collections.copy(destList, srcList);

//Java 8 enhacncements
// Replace all elements
list.replaceAll(x -> x * 2);

// Remove if condition
list.removeIf(x -> x % 2 == 0);

// Comparator static methods
Comparator.naturalOrder();
Comparator.reverseOrder();
Comparator.comparing();

// Comparable
Collections.sort(list); // Uses compareTo()

// Comparator
Collections.sort(list, comparator); // Uses compare()