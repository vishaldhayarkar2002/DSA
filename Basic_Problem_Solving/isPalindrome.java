// Java program to check if the given 
// number is a palindrome
class GFG {

    // Function to check if the number is palindrome
    static boolean isPalindrome(int n) {

        // Convert the absolute value
        // of number to string
        String s = Integer.toString(Math.abs(n));
        int len = s.length();

        for (int i = 0; i < len / 2; i++) {

            // Comparing i th character from starting
            //  and len-i th character from end
            if (s.charAt(i) != s.charAt(len - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 12321;
        if (isPalindrome(n) == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

// Java program to check if the given 
// number is a palindrome
class GFG {

    // Function to check if the number is palindrome
    static boolean isPalindrome(int n) {
        int reverse = 0;

        // Copy of the original number so that the original
        // number remains unchanged while finding the reverse
        int temp = Math.abs(n);
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }

        // If reverse is equal to the original number, the
        // number is palindrome
        return (reverse == Math.abs(n));
    }

    public static void main(String[] args) {
        int n = 12321;
        if (isPalindrome(n) == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}