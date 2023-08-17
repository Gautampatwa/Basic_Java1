package FinexraInterviewPreparation;

public class whileLoop {
    public static void main(String[] args) {
//
//        int i=1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >=i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
