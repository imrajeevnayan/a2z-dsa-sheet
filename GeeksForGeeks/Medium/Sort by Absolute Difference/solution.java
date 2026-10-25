
class Solution {
    public void rearrange(int[] arr, int x) {

        // Integer array banao kyunki Arrays.sort comparator
        // primitive int[] par kaam nahi karta
        Integer[] temp = new Integer[arr.length];

        // int[] -> Integer[] copy
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        // Absolute difference ke basis par sort karo
        Arrays.sort(temp, (a, b) ->
            Math.abs(a - x) - Math.abs(b - x)
        );

        // Sorted values wapas original array me daal do
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}