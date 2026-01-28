class Solution {
    // Function to find the missing number using XOR approach
    public int missingNumber(int[] a, int N) {
        int xor1 = 0, xor2 = 0;

        // XOR all the elements and numbers from 1 to N-1
        for (int i = 0; i < N - 1; i++) {
            xor2 ^= a[i];        // XOR of array elements
            xor1 ^= (i + 1);     // XOR of numbers from 1 to N-1
        }

        xor1 ^= N; // Include N in the XOR

        // XOR of xor1 and xor2 gives the missing number
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5};
        int N = 5;

        Solution obj = new Solution();
        int ans = obj.missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }
}
