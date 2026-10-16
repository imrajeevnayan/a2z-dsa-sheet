class Solution {
    public int reachNumber(int target) {
        // Symmetry handle karna zaroori hai
        target = Math.abs(target);
        
        // Edge case: agar target 0 hai toh 0 steps
        if (target == 0) return 0;

        // Binary Search range define karte hain
        // Low = 1, High = target (kyunki worst case mein target steps lagenge)
        long low = 1;
        long high = target; 
        long k = 0; // Ye store karega wo minimum steps jo target ko cross karein

        // Binary Search loop: Smallest 'k' dhundna hai jahan sum >= target
        while (low <= high) {
            long mid = low + (high - low) / 2;
            
            // Sum of first 'mid' integers: mid * (mid + 1) / 2
            long sum = mid * (mid + 1) / 2;

            if (sum >= target) {
                k = mid;       // Ye ek potential answer hai
                high = mid - 1; // Ab chote values check karte hain taaki minimum mile
            } else {
                low = mid + 1; // Sum abhi chota hai, bada k
            }
        }

        // Ab 'k' wo minimum steps hai jahan humne target ko cross kiya ya touch kiya
        long sum = k * (k + 1) / 2;
        long diff = sum - target;

        // Parity Check:
        // Agar difference even hai, toh hum kuch steps flip karke exact target pe pahunch sakte hain
        if (diff % 2 == 0) {
            return (int) k;
        } 
        
        // Agar difference odd hai:
        // Hume extra steps lene padenge jab tak difference even na ho jaye
        // Note: Har naye step se parity change hoti hai.
        // Agar k odd hai, toh next step (k+1) even hoga -> diff odd + even = odd (still odd)
        // Toh hume ek aur step lena padega (k+2) -> diff odd + even + odd = even
        
        // Simple rule:
        // If k is even, next step (k+1) is odd. Odd diff + Odd step = Even diff. So ans = k + 1
        // If k is odd, next step (k+1) is even. Odd diff + Even step = Odd diff. 
        // Then step (k+2) is odd. Odd diff + Odd step = Even diff. So ans = k + 2
        
        if (k % 2 == 0) {
            return (int) (k + 1);
        } else {
            return (int) (k + 2);
        }
    }
}