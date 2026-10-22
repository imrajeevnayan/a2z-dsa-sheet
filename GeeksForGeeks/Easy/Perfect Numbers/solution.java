class Solution {
    static boolean isPerfect(int n) {
        if (n <= 1) return false; // 1 perfect number nahi hai

        int sum = 1; // 1 har number ka factor hai

        // Loop from 2 to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                // Agar i aur n/i alag hain, toh n/i ko bhi add karo
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        return sum == n;
    }
}