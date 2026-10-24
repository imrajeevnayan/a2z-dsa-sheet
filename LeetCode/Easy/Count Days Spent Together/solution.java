import java.time.LocalDate;

class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        // Convert to Day of Year (1-365)
        int aStart = LocalDate.parse("2023-" + arriveAlice).getDayOfYear();
        int aEnd = LocalDate.parse("2023-" + leaveAlice).getDayOfYear();
        int bStart = LocalDate.parse("2023-" + arriveBob).getDayOfYear();
        int bEnd = LocalDate.parse("2023-" + leaveBob).getDayOfYear();

        // Intersection formula: max(starts) to min(ends)
        int start = Math.max(aStart, bStart);
        int end = Math.min(aEnd, bEnd);

        return Math.max(0, end - start + 1);
    }
}