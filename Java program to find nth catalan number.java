// Java program to find nth catalan number

class GfG {

    static int findCatalan(int n) {
      
        // Table to store results of subproblems
        int[] catalan = new int[n + 1];

        // Initialize first two values in the table
        catalan[0] = catalan[1] = 1;

        // Fill entries in catalan[] using the recursive
        // formula
        for (int i = 2; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i]
                    += catalan[j] * catalan[i - j - 1];
            }
        }

        // Return the last entry
        return catalan[n];
    }

    public static void main(String[] args) {
        int n = 6;
        int res = findCatalan(n);
         System.out.println(res);
    }
}