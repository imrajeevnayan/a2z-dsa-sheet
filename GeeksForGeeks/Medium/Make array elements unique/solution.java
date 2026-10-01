class Solution {
    public int minIncrements(int[] arr) {

        // Array ko sort kar do
        Arrays.sort(arr);

        int operations = 0;

        // Pehla element as it is rahega
        for (int i = 1; i < arr.length; i++) {

            // Agar current element previous element se
            // chhota ya equal hai, to usko increment karna padega
            if (arr[i] <= arr[i - 1]) {

                // Current element ko unique banane ke liye
                // minimum value = previous element + 1
                int required = arr[i - 1] + 1;

                // Kitne increments chahiye
                operations += required - arr[i];

                // Current element ko required value par update karo
                arr[i] = required;
            }
        }

        return operations;
    }
}
