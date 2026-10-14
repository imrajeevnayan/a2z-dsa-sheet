class Solution {
    public String maxSumOfSquares(int num, int sum) {
        // Check if it's possible to form such a number
        // Max possible sum with 'num' digits is 9 * num
        if (sum > 9 * num || sum < 0) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        int remainingSum = sum;
        int remainingDigits = num;
        
        for (int i = 0; i < num; i++) {
            
            for (int d = 9; d >= 0; d--) {
                if (d > remainingSum) continue; // Can't place a digit larger than remaining sum
                
                int nextRemainingSum = remainingSum - d;
                int nextRemainingDigits = remainingDigits - 1;
                
                // Check if the rest of the sum can be formed by remaining digits
                if (nextRemainingSum <= 9 * nextRemainingDigits) {
                    sb.append(d);
                    remainingSum -= d;
                    remainingDigits--;
                    break; // Move to next position
                }
            }
        }
        
        return sb.toString();
    }
}