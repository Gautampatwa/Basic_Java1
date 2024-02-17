package Cursors;

import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class YearMonthExample {
    public static void main(String[] args) {
        // Creating a YearMonth instance
        YearMonth currentYearMonth = YearMonth.now();
        System.out.println("Current Year-Month: " + currentYearMonth);

        // Creating a specific YearMonth
        YearMonth specificYearMonth = YearMonth.of(2023, 11); // Year: 2023, Month: November
        System.out.println("Specific Year-Month: " + specificYearMonth);

        // Accessing year and month separately
        int year = specificYearMonth.getYear();
        int month = specificYearMonth.getMonthValue();
        System.out.println("Year: " + year + ", Month: " + month);

        // Adding and subtracting months
        YearMonth nextMonth = specificYearMonth.plusMonths(1);
        System.out.println("Next Month: " + nextMonth);
        YearMonth specificYearMont = YearMonth.of(2024, 1);

        // Formatting the YearMonth as "yyyyM" (concatenating year and month)
        String formattedYearMonth = specificYearMont.getYear() + "M" + String.format("%02d", specificYearMont.getMonthValue());

        System.out.println("Formatted Year-Month: " + formattedYearMonth);
        LocalDateTime localDateTime=LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String parsedDateTime =localDateTime.format(formatter);

        System.out.println("Parsed Date-Time: " + parsedDateTime);

    }
}
