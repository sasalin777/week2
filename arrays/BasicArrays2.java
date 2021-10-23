package week2.arrays;
import java.util.ArrayList;
import java.util.Random;
public class BasicArrays2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayInt = new int[10];
        int len = arrayInt.length;

        for(int i = 0; i <= len - 1; i++) {
            int value = random.nextInt((100 - 1) + 1) + 1;
            arrayInt[i] = value;
        }

        for (int j = 0; j <= len - 1; j++) {
              System.out.printf("Slot %d contains a %d\n", j , arrayInt[j]);
        }
    }
}




