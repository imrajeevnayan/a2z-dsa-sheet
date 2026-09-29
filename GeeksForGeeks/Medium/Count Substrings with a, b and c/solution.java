class Solution {
    public static int countSubstring(String s) {
        int n = s.length();
        if (n < 3) return 0;

        int left = 0;
        int countA = 0, countB = 0, countC = 0;
        long result = 0; // Use long to avoid overflow for large strings

        for (int right = 0; right < n; right++) {
            // Character include karo
            char ch = s.charAt(right);
            if (ch == 'a') countA++;
            else if (ch == 'b') countB++;
            else if (ch == 'c') countC++;

            // Jab tak window valid hai (teeno characters present hain)
            while (countA > 0 && countB > 0 && countC > 0) {
                result += (n - right);

                // Ab left pointer ko aage badhao taaki next window check kar sako
                char leftChar = s.charAt(left);
                if (leftChar == 'a') countA--;
                else if (leftChar == 'b') countB--;
                else if (leftChar == 'c') countC--;

                left++;
            }
        }

        return (int) result;
    }
}