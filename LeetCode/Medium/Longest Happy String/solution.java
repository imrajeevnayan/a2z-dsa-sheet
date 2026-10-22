class Solution {
    public String longestDiverseString(int a, int b, int c) {
        // Max Heap based on count (descending order)
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> y[1] - x[1]);
        
        if (a > 0) pq.add(new int[]{'a', a});
        if (b > 0) pq.add(new int[]{'b', b});
        if (c > 0) pq.add(new int[]{'c', c});
        
        StringBuilder sb = new StringBuilder();
        
        while (!pq.isEmpty()) {
            // Get the character with highest remaining count
            int[] first = pq.poll();
            char char1 = (char) first[0];
            int count1 = first[1];
            
            int len = sb.length();
            
            // Check if adding this char would create "xxx"
            if (len >= 2 && sb.charAt(len - 1) == char1 && sb.charAt(len - 2) == char1) {
                // If heap is empty, we can't pick another char, so break
                if (pq.isEmpty()) break;
                
                // Pick the second most frequent character
                int[] second = pq.poll();
                char char2 = (char) second[0];
                int count2 = second[1];
                
                sb.append(char2);
                count2--;
                
                // Put back second char if count remains
                if (count2 > 0) {
                    pq.add(new int[]{char2, count2});
                }
                
                // Put back first char as it wasn't used
                pq.add(first);
            } else {
                // Safe to add the most frequent character
                sb.append(char1);
                count1--;
                
                // Put back if count remains
                if (count1 > 0) {
                    pq.add(new int[]{char1, count1});
                }
            }
        }
        
        return sb.toString();
    }
}