class Solution {
    public int maxConsecBits(int[] arr) {
        if (arr.length == 0) return 0;

        int maxStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < arr.length; i++) {
            // Agar current element pichle wale ke same hai
            if (arr[i] == arr[i - 1]) {
                currentStreak++;
            } else {
                // Streak break ho gayi, reset kardo
                currentStreak = 1;
            }

            // Har step pe max update karo
            if (currentStreak > maxStreak) {
                maxStreak = currentStreak;
            }
        }

        return maxStreak;
    }
}