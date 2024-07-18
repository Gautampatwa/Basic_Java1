package StringExample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Java8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime);
        DateTimeFormatter dateTime1=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String zone= String.valueOf(dateTime1.getZone());
        System.out.println(zone);
        String formattedDateTime= dateTime.format(dateTime1);
        System.out.println(formattedDateTime.toLowerCase());

    }
}
