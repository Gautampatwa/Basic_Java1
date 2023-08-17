package StringExample;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter choice to find:");
        int n = scanner.nextInt();

        switch (n) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
            default:
                System.out.println("55");
                break;
        }

    }
}
