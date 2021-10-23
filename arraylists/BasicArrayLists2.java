package week2.arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayInt = new ArrayList();
        for(int i = 0; i <= 10 - 1; i++) {
            int value = random.nextInt((100 - 1) + 1) + 1;
            arrayInt.add(value);
        }
      System.out.println("ArrayList: "+ arrayInt);
    }
}
