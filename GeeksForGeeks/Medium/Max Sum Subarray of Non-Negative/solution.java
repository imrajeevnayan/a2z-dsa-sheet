class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {

        long maxSum = -1;
        long currSum = 0;

        int start = 0;
        int bestStart = -1;
        int bestEnd = -1;

        for (int i = 0; i <= arr.length; i++) {

            if (i < arr.length && arr[i] >= 0) {
                currSum += arr[i];
            } else {

                if (i > start) { // segment exists

                    if (currSum > maxSum) {
                        maxSum = currSum;
                        bestStart = start;
                        bestEnd = i - 1;
                    }
                    else if (currSum == maxSum) {

                        int currLen = i - start;
                        int bestLen = bestEnd - bestStart + 1;

                        if (currLen > bestLen) {
                            bestStart = start;
                            bestEnd = i - 1;
                        }
                    }
                }

                currSum = 0;
                start = i + 1;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        if (bestStart == -1) {
            ans.add(-1);
            return ans;
        }

        for (int i = bestStart; i <= bestEnd; i++) {
            ans.add(arr[i]);
        }

        return ans;
    }
}