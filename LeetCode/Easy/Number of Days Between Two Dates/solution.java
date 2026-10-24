import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        // Strings ko LocalDate objects mein convert karo
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        
        // Dono dates ke beech ka difference nikalo
        // ChronoUnit.DAYS humein exact days ka difference deta hai
        long days = Math.abs(ChronoUnit.DAYS.between(d1, d2));
        
        return (int) days;
    }
}