class Solution {
    public boolean stringStack(String pat, String tar) {

        int j = tar.length() - 1;
        int pending = 0;

        for (int i = pat.length() - 1; i >= 0; i--) {

            char ch = pat.charAt(i);

            if (pending > 0) {
                // Use current character as a delete operation
                pending--;
            }
            else if (j >= 0 && ch == tar.charAt(j)) {
                // Keep this character in the final string
                j--;
            }
            else {
                // This character must be removed later
                pending++;
            }
        }

        return j < 0;
    }
}
