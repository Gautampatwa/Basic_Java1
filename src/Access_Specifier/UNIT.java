package Access_Specifier;
// Java program to demonstrate
// sleep() method of TimeUnit Class

import Arrays.Employees;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.*;

class UNIT {
    public static void main(String args[]) throws IOException {
        // Get time to sleep
        long timeToSleep =9;

        // Create a TimeUnit object
        TimeUnit time = TimeUnit.SECONDS;
        File file=new File("ssss.txt");
        System.out.println(file.exists());
        file.mkdir();
        System.out.println(file.exists());
        try {

            System.out.println("Going to sleep for "
                    + timeToSleep
                    + " seconds");
            LocalDate myObj = LocalDate.now(); // Create a date object
            System.out.println(myObj);
            time.sleep(timeToSleep);
            LocalDateTime localDateTime=LocalDateTime.now();
            System.out.println(localDateTime);
            Employees employees=new Employees();
            employees.setAddress("Delhi");
            System.out.println(employees.getAddress());

            System.out.println("Slept for "
                    + timeToSleep
                    + " seconds");
        }

        catch (InterruptedException e) {
            System.out.println("Interrupted "
                    + "while Sleeping");
        }
    }
}