package week2.arrays;

import java.util.Random;

public class CopyingArrays {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayInt = new int[10]; // Create an array of ten integers
        int len = arrayInt.length;
        int[] arrayInt2 = new int[len];

         // Fill the array with ten random numbers (1-100)
        for(int i = 0; i <= len - 1; i++) {
            int value = random.nextInt((100 - 1) + 1) + 1;
            arrayInt[i] = value;
        }

        System.arraycopy(arrayInt, 0, arrayInt2, 0, len); //copy array
        arrayInt[len - 1] = -7; //Change the last value in the first array to a -7
        System.out.print("Array 1:");
        for(int j = 0; j <= len - 1; j++){
            System.out.printf(" %d", arrayInt[j]);
        }
        System.out.print("\nArray 2:");
        for(int k = 0; k <= len - 1; k++){
            System.out.printf(" %d", arrayInt2[k]);
        }

    }
}
