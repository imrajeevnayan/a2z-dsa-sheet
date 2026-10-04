class Solution {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                low++;
                high++;
            }
            else if (ch == ')') {
                low--;
                high--;
            }
            else { // '*'
                low--;     // if '*' acts as ')'
                high++;    // if '*' acts as '('
            }

            // too many ')'
            if (high < 0) {
                return false;
            }

            // low should never be negative
            low = Math.max(low, 0);
        }

        return low == 0;
    }
}