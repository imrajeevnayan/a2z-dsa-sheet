class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        ArrayList<Integer> ans = new ArrayList<>();

        // Array ke saare elements ko HashSet mein store karenge
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) set.add(x);
        
        // low se high tak har number check karo
        for (int i = low; i <= high; i++) {

            // Agar number array mein nahi hai,
            // to ye missing number hai
            if (!set.contains(i)) ans.add(i);
        }

        return ans;
    }
}
