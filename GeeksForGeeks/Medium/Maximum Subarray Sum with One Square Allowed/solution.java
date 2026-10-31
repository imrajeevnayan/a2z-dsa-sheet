class Solution {
    public int maximumSubarray(int[] arr) {

        long noSquare = arr[0];
        long withSquare = 1L * arr[0] * arr[0];

        long ans = Math.max(noSquare, withSquare);

        for (int i = 1; i < arr.length; i++) {

            long x = arr[i];

            long newNoSquare = Math.max(x, noSquare + x);

            long newWithSquare = Math.max(
                    x * x,
                    Math.max(
                            noSquare + x * x,
                            withSquare + x
                    )
            );

            noSquare = newNoSquare;
            withSquare = newWithSquare;

            ans = Math.max(ans, Math.max(noSquare, withSquare));
        }

        return (int) ans;
    }
}