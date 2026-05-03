29. Count Words in a String
import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Read the full line (including spaces)
        String str = sc.nextLine().trim();   // .trim() removes extra spaces at start & end
        
        if (str.isEmpty()) {                 // if user just pressed Enter or only spaces
            System.out.println(0);
        } else {
            // Split the string wherever there is one or more spaces
            String[] words = str.split("\\s+");
            
            // Number of words = length of the array
            System.out.println(words.length);
        }
    }
}

//2. TO remove all teh whitespaces
str = str.replaceAll("\\s+", "");

//3. charater to take input
char ch = sc.next().charAt(0);           // character to remove

//check prime
// Helper function to check prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

//4. Rottate array ksteps
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);      // whole array
        reverse(nums, 0, k - 1);      // first k
        reverse(nums, k, n - 1);      // remaining
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

//5. maximum product subarray
    public int maxProduct(int[] A) {
        int n = A.length, res = A[0], l = 0, r = 0;
        for (int i = 0; i < n; i++) {
            l =  (l == 0 ? 1 : l) * A[i];
            r =  (r == 0 ? 1 : r) * A[n - 1 - i];
            res = Math.max(res, Math.max(l, r));
        }
        return res;
    }

//6.Group Anagrams
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr); // key
            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}

//Search a 2D Matrix -- it is 
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int m = matrix.length;
    int n = matrix[0].length;

    int left = 0, right = m * n - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        int row = mid / n; // this is the 
        int col = mid % n; //important part

        if (matrix[row][col] == target) {
            return true;
        } else if (matrix[row][col] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return false;
}
}