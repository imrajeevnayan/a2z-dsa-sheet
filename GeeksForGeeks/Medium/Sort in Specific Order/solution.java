import java.util.*;

class Solution {
    public void sortIt(int[] arr) {

        Integer[] temp = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        Arrays.sort(temp, (a, b) -> {

            boolean aOdd = (a & 1) == 1;
            boolean bOdd = (b & 1) == 1;

            if (aOdd && bOdd) {
                return b - a;      // odd: descending
            }

            if (!aOdd && !bOdd) {
                return a - b;      // even: ascending
            }

            return aOdd ? -1 : 1;  // odd before even
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}