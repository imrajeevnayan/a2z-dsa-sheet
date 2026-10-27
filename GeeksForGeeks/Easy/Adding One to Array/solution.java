class Solution {
    ArrayList<Integer> addOne(int[] arr) {
        int n = arr.length;

        // Traverse from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;

                ArrayList<Integer> ans = new ArrayList<>();
                for (int num : arr) {
                    ans.add(num);
                }
                return ans;
            }

            // If digit is 9, make it 0 and continue carry
            arr[i] = 0;
        }

        // If all digits were 9
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        for (int num : arr) {
            ans.add(num);
        }

        return ans;
    }
}