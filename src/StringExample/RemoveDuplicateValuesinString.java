package StringExample;

import java.util.Scanner;

public class RemoveDuplicateValuesinString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to find duplicate characters:");
        String input1 = scanner.nextLine();

        char arr[] = input1.toCharArray();
        int count = 0;
        for (int i = 0; i < input1.length(); i++) {
            for (int j = i + 1; j < input1.length(); j++) {
                if (arr[i] == arr[j] && arr[i] != ' ') {
                    count++;
                    arr[j]='1';
                }
            }
            if (count > 1 && arr[i] != '1')
                System.out.print(arr[i] + " ");
        }
    }
}
