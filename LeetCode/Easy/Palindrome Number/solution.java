class Solution {
    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
        rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        return x == reverse(x);
    }
}