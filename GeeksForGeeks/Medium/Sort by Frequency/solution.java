import java.util.*;

class Solution {
    public String frequencySort(String s) {
        // Step 1: Frequency count
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Min-Heap banao (Kam frequency wale pehle aayenge)
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> {
            int freqDiff = map.get(a) - map.get(b); // Ascending Frequency
            if (freqDiff != 0) {
                return freqDiff;
            } else {
                return a - b; // Agar frequency same hai, toh Lexicographically smallest pehle
            }
        });

        pq.addAll(map.keySet());

        // Step 3: Result string build karo
        StringBuilder sb = new StringBuilder();

        while (!pq.isEmpty()) {
            char c = pq.poll();
            int freq = map.get(c);

            for (int i = 0; i < freq; i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}