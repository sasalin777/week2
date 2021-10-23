package week2.arrays;

import java.util.Random;

public class FindingTheLargestValue {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayInt = new int[10];
        int len = arrayInt.length;

        for(int i = 0; i <= len - 1; i++) {
            int value = random.nextInt((100 - 1) + 1) + 1;
            arrayInt[i] = value;
        }
        System.out.print("Array:");
        for(int j = 0; j <= len - 1; j++) {
            System.out.printf(" %d", arrayInt[j]);
        }
        for(int k = 0; k <= len - 1; k++) {
            if (arrayInt[0] <= arrayInt[k]) {
                int temp = arrayInt[k];
                arrayInt[k] = arrayInt[0];
                arrayInt[0] = temp;
            }
        }System.out.printf("\n\nThe largest value is %d", arrayInt[0]);
    }
}
