class Solution {
    public int findMinOperation(int n) {
        // Base case
        if (n <= 1)  return 0;
        int operations = 0;
        int divisor = 2;

        // Prime factorization
        while (n > 1) {
            // Jab tak current divisor se divide ho raha hai
            while (n % divisor == 0) {
                operations += divisor;  // Har prime factor ko add karo
                n /= divisor;
            }
            divisor++;
        }

        return operations;
    }
}