import java.util.*;

class Solution {
    public List<Integer> smallestSubseg(int[] arr) {

        // Map mein element ki information store karenge
        // [frequency, firstIndex, lastIndex]
        HashMap<Integer, int[]> map = new HashMap<>();

        // Har element ki frequency, first aur last index find karo
        for (int i = 0; i < arr.length; i++) {

            int x = arr[i];

            if (!map.containsKey(x)) {

                // Pehli baar element mila
                // frequency = 1
                // first index = i
                // last index = i
                map.put(x, new int[]{1, i, i});

            } else {

                // Element already present hai
                int[] info = map.get(x);

                // Frequency increase karo
                info[0]++;

                // Last occurrence update karo
                info[2] = i;
            }
        }

        int maxFreq = 0;
        int bestStart = 0;
        int bestEnd = arr.length - 1;
        int bestLength = Integer.MAX_VALUE;

        // Har element ko check karo
        for (int x : map.keySet()) {

            int[] info = map.get(x);

            int freq = info[0];
            int first = info[1];
            int last = info[2];

            // Agar frequency maximum hai
            if (freq > maxFreq) {

                maxFreq = freq;

                bestStart = first;
                bestEnd = last;

                bestLength = last - first + 1;

            } else if (freq == maxFreq) {

                // Same maximum frequency hai
                // to smaller subarray choose karna hai
                int length = last - first + 1;

                if (length < bestLength) {

                    bestStart = first;
                    bestEnd = last;
                    bestLength = length;

                } else if (length == bestLength) {

                    // Same length hai to jo pehle aata hai
                    // usko choose karenge
                    if (first < bestStart) {
                        bestStart = first;
                        bestEnd = last;
                    }
                }
            }
        }

        // Answer list mein add karo
        List<Integer> ans = new ArrayList<>();

        for (int i = bestStart; i <= bestEnd; i++) {
            ans.add(arr[i]);
        }

        return ans;
    }
}
