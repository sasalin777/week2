package week2.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayInt = new ArrayList();
        for(int i = 0; i <= 10 - 1; i++) {
            int value = random.nextInt((100 - 1) + 1) + 1;
            arrayInt.add(value);
        }
        ArrayList<Integer> arrayInt2 = new ArrayList<>(arrayInt);

        int len=arrayInt.size();
        System.out.println("ArrayList: "+ arrayInt);
        for(int k = 0; k <= len - 1; k++) {
            if (arrayInt.get(0) <= arrayInt.get(k)) {
                Collections.swap(arrayInt, 0, k);
            }
        }System.out.printf("\nThe largest value is %d", arrayInt.get(0));
        for(int k = 0; k <= len - 1; k++) {
            if (arrayInt.get(0).equals(arrayInt2.get(k))) {
                System.out.printf(", which is in slot %d", k);
            }
        }


    }
}
