// When to Choose HashMap
// Need fast lookups/insertions/deletions

// Need to store key-value associations

// Don't care about ordering

// Need to count frequencies or check existence

import java.util.HashMap;

// Create empty HashMap
HashMap<String, Integer> map = new HashMap<>();

// Create with initial capacity
HashMap<String, String> config = new HashMap<>(20);

// Create from existing map
HashMap<String, Integer> copy = new HashMap<>(map);
int apples = map.get("apple");       // 3 (throws NPE if key missing)
int oranges = map.getOrDefault("orange", 0);  // 0 (safe access)
boolean hasBanana = map.containsKey("banana"); // true
map.remove("banana");   // Remove by key
map.remove("apple", 3); // Remove only if key maps to this value
map.clear();            // Remove all entries

// Iterate keys
for (String key : map.keySet()) {
    System.out.println(key);
}

// Iterate values
for (int value : map.values()) {
    System.out.println(value);
}

// Iterate entries
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}

// Java 8 forEach
map.forEach((k, v) -> System.out.println(k + ": " + v));