package week2.arrays;

import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayInt = new int[10];
        int len = arrayInt.length;
        int count=0;

        for(int i = 0; i <= len - 1; i++) {
            int value = random.nextInt((50 - 1) + 1) + 1;
            arrayInt[i] = value;
        }
        System.out.print("Array:");
        for(int j = 0; j <= len - 1; j++){
            System.out.printf(" %d", arrayInt[j]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nValue to find:");
        String userKeyIn = scanner.nextLine();
        int userKey=Integer.parseInt(userKeyIn);
        for (int i = 0; i <= len - 1; i++) {
            if (arrayInt[i] == userKey) {
                System.out.printf("\n%d is in slot %d.", arrayInt[i], i);
            } else {
                count += 1;
            }
        }
        if (count == len) { System.out.printf("\n%d is not in the array.", userKey);}
    }
}
