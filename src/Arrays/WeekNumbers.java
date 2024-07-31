package Arrays;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class WeekNumbers {

    public static Set<Integer> getWeeksInRange(int year, LocalDate startDate, LocalDate endDate) {
        Set<Integer> weeks = new HashSet<>();
        LocalDate date = startDate;
        WeekFields weekFields = WeekFields.of(Locale.getDefault());

        while (!date.isAfter(endDate)) {
            if (date.getYear() == year) {
                int weekNumber = date.get(weekFields.weekOfWeekBasedYear());
                weeks.add(weekNumber);
            }
            date = date.plusDays(1);
        }

        return weeks;
    }

    public static void main(String[] args) {
        int year = 2023;
        LocalDate startDate = LocalDate.of(2023, 7, 10);
        LocalDate endDate = LocalDate.of(2023, 7, 25);

        Set<Integer> weeks = getWeeksInRange(year, startDate, endDate);
        System.out.println("Week numbers for the range " + startDate + " to " + endDate + ": " + weeks);
    }
}
