class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] arr, int target) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {

            // Duplicate first element skip
            if (i > 0 && arr[i] == arr[i - 1])
                continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {

                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[left]);
                    temp.add(arr[right]);

                    ans.add(temp);

                    left++;
                    right--;

                    // Duplicate second element skip
                    while (left < right && arr[left] == arr[left - 1])
                        left++;

                    // Duplicate third element skip
                    while (left < right && arr[right] == arr[right + 1])
                        right--;

                } 
                else if (sum < target) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }

        return ans;
    }
}