import java.util.HashMap;
import java.util.Map;

class Solution {
    public int equal012(String s) {
        // Map to store frequency of (diff1, diff2) pairs
        // Key format: "diff1,diff2"
        Map<String, Integer> map = new HashMap<>();

        // Initial state: jab koi char nahi dekha, diff (0,0) hai
        // Ye isliye zaroori hai taaki shuru se valid substring bhi count ho
        map.put("0,0", 1);

        int count0 = 0, count1 = 0, count2 = 0;
        int result = 0;

        for (char c : s.toCharArray()) {
            // Current character ke hisaab se counts update karo
            if (c == '0') count0++;
            else if (c == '1') count1++;
            else count2++;

            // Relative differences calculate karo
            int diff1 = count1 - count0;
            int diff2 = count2 - count0;

            String key = diff1 + "," + diff2;

            // Agar ye state pehle bhi dekh chuke hain, 
            // toh utne hi valid substrings exist karte hain
            if (map.containsKey(key)) {
                result += map.get(key);
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        return result;
    }
}