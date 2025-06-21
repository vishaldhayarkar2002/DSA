// Java program for space optimized Dynamic Programming
// Solution of Binomial Coefficient

class GfG {

    // Returns value of Binomial Coefficient C(n, k)
    static int binomialCoeff(int n, int k) {
        int[] dp = new int[k + 1];

        // nC0 is 1
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
          
            // Compute next row of pascal triangle using
            // the previous row
            for (int j = Math.min(i, k); j > 0; j--)
                dp[j] = dp[j] + dp[j - 1];
        }
        return dp[k];
    }

    public static void main(String[] args) {
        int n = 5, k = 2;
        System.out.println(binomialCoeff(n, k));
    }
}