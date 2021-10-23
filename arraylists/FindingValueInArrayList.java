package week2.arraylists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingValueInArrayList {
    public static void main(String[] args) {

            Random random = new Random();
            ArrayList<Integer> arrayInt = new ArrayList();
            int len;
            int count=0;

            for(int i = 0; i <= 10 - 1; i++) {
                int value = random.nextInt((50 - 1) + 1) + 1;
                arrayInt.add(value);
            }
            len = arrayInt.size();
            System.out.print("Array:");
            System.out.println("ArrayList: "+ arrayInt);
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nValue to find:");
            String userKeyIn = scanner.nextLine();
            int userKey=Integer.parseInt(userKeyIn);
            for (int i = 0; i <= len - 1; i++) {
            if (arrayInt.get(i).equals(userKey)) {
                System.out.printf("\n%d is in the ArrayList.", userKey);
            } else {
                count += 1;
            }
            }
    }
}



