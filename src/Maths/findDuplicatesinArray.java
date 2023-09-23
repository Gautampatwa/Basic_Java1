package Maths;

import java.util.Scanner;

class findDuplicatesinnumsay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int duplicate = findDuplicate(arr);
        System.out.println(duplicate);
    }

    private static int findDuplicate(int[] nums) {
        int cand = nums[0];
        int c = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == cand) {
                c++;
            } else {
                c--;
                if (c == 0) {
                    cand = nums[i];
                    c = 1;
                }
            }
        }
        return cand;
    }
}
