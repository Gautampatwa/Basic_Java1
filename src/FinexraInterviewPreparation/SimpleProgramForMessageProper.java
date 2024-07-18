package FinexraInterviewPreparation;
import java.util.HashSet;

public class SimpleProgramForMessageProper {

    public static void main(String[] args) {
        HashSet<String> messages = new HashSet<>();

        int a = 10;
        int b = 5;

        if (a / b == 2) {
            messages.add("ArithmeticException");
//             throw new ArithmeticException(); // You might want to throw this if necessary.
        }
        if ((a * b) == 50) {
            messages.add("IllegalArgumentException");
//             throw new IllegalArgumentException(); // You might want to throw this if necessary.
        }

        // Check if both conditions are true and if so, print the messages
        if (!messages.isEmpty()) {
            for (String message : messages) {
                System.out.println("Message: " + message);
            }
        } else {
            System.out.println("No exceptions occurred.");
        }

        SimpleProgramForMessageProper.m1();
    }

    public static void m1() {
        System.out.println("User needs to fix the data and upload again");
    }
}
