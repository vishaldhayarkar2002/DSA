// Solution class to check if a string is a palindrome using recursion
class Solution {
    // Function to check if a string is a palindrome using recursion
    public boolean palindrome(int i, String s) {
        // Base Condition: If i exceeds half of the string, all the elements have been compared
        // and the string is a palindrome, return true.
        if (i >= s.length() / 2) return true;

        // If the start and end characters are not equal, it's not a palindrome.
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;

        // If both characters are the same, increment i and check start+1 and end-1.
        return palindrome(i + 1, s);
    }
}

// Main class to test the Solution class
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();  // Create an instance of the Solution class
        String s = "madam";  // Example string to check

        // Check if the string is a palindrome using the Solution class
        System.out.println(solution.palindrome(0, s));  // Output true if palindrome, false if not
    }
}
