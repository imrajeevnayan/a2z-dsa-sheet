
class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        // 1. Frequency Map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Max-Heap with Custom Comparator
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int freqDiff = map.get(b) - map.get(a); // Pehle Frequency check karo (Desc)
            if (freqDiff != 0) {
                return freqDiff;
            } else {
                return b - a; // Agar frequency same hai, toh Bada Number pehle lao (Desc)
            }
        });

        pq.addAll(map.keySet());

        // 3. Top K elements
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(pq.poll());
        }

        return ans;
    }
}