Find the Majority Element that occurs more than N/2 times
using the Boyer-Moore Voting Algorithm.


import java.util.*;

// Class containing the majority element logic
class Solution {
    // Function to find the majority element in an array
    public int majorityElement(int[] nums) {
        
        // Size of the given array
        int n = nums.length;
        
        // Hash map to store element counts
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count occurrences of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        /* Iterate through the map to
           find the majority element */
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        
        // Return -1 if no majority element is found
        return -1;
    }
}

// Separate class containing only the main method
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        
        // Create an instance of Solution class
        Solution sol = new Solution();
 
        int ans = sol.majorityElement(arr);
        
        // Print the majority element found
        System.out.println("The majority element is: " + ans);
    }
}
