class Solution {
    int unvisitedLeaves(int arr[], int k) {
        // Visited array: index 1 se k tak leaves represent karte hain
        boolean[] visited = new boolean[k + 1];

        // Duplicate strengths avoid karne ke liye HashSet use karo
        // Taaki same strength wale frogs baar-baar marking na karein
        
        
        Set<Integer> uniqueStrengths = new HashSet<>();
        for (int s : arr) {
            uniqueStrengths.add(s);
        }

        // Har unique strength ke multiples mark karo
        for (int strength : uniqueStrengths) {
            // Optimization: Agar strength > k hai toh wo kisi leaf par land nahi karega
            if (strength > k) continue;

            // Strength ke saare multiples ko visit mark karo
            for (int leaf = strength; leaf <= k; leaf += strength) {
                visited[leaf] = true;
            }
        }

        // Count unvisited leaves (index 1 se start hota hai)
        int count = 0;
        for (int i = 1; i <= k; i++) {
            if (!visited[i]) {
                count++;
            }
        }

        return count;
    }
}