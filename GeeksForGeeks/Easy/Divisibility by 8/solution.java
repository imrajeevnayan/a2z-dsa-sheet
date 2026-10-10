class Solution {
    public boolean isDivBy8(String s) {
        if (s == null || s.isEmpty()) return false;

        // Take at most last 3 characters
        int len = s.length();
        String lastDigits = s.substring(Math.max(0, len - 3));

        // Convert to integer and check divisibility
        int num = Integer.parseInt(lastDigits);

        return num % 8 == 0;
    }
}