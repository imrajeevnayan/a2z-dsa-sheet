class Solution {
    public ArrayList<ArrayList<Integer>> mergeOverlap(int[][] arr) {

        // Final merged intervals store karne ke liye
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // Intervals ko start point ke basis par sort karo
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        // Pehla interval current interval maan lo
        int start = arr[0][0];
        int end = arr[0][1];

        // Baaki intervals traverse karo
        for (int i = 1; i < arr.length; i++) {

            // Agar overlap hai
            if (arr[i][0] <= end) {

                // End ko maximum value se update karo
                end = Math.max(end, arr[i][1]);
            }
            else {

                // Current merged interval answer me add karo
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(start);
                temp.add(end);
                ans.add(temp);

                // Naya interval start karo
                start = arr[i][0];
                end = arr[i][1];
            }
        }

        // Last interval add karna na bhoolna
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(start);
        temp.add(end);
        ans.add(temp);

        return ans;
    }
}