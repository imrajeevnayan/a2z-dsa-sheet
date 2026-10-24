class Solution {
    public int minFlips(int a, int b, int c) {
        int flips = 0;
        
        // Har bit position ko check karo (0 se 31 tak for integers)
        for (int i = 0; i < 32; i++) {
            // Current bits nikalo using right shift and AND with 1
            int bitA = (a >> i) & 1;
            int bitB = (b >> i) & 1;
            int bitC = (c >> i) & 1;
            
            if (bitC == 1) {
                // Agar c ka bit 1 hai, toh a ya b mein se kam se kam ek 1 hona chahiye
                if (bitA == 0 && bitB == 0) {
                    flips++; // Kisi ek ko 1 bana do
                }
            } else {
                // Agar c ka bit 0 hai, toh a aur b dono 0 hone chahiye
                if (bitA == 1) {
                    flips++; // a ke bit ko 0 karo
                }
                if (bitB == 1) {
                    flips++; // b ke bit ko 0 karo
                }
            }
        }
        
        return flips;
    }
}