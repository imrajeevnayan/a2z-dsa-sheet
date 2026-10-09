class Solution {
    public int minOperation(int n) {
        int operations = 0;

        // Jab tak n 0 nahi ho jata
        while (n > 0) {
            if (n % 2 == 0) {
                // Agar even hai, toh divide by 2 (reverse of multiply by 2)
                n = n / 2;
            } else {
                // Agar odd hai, toh subtract 1 (reverse of add 1)
                n = n - 1;
            }
            operations++;
        }

        return operations;
    }
}