package BT5;

import java.util.ArrayList;

public class BT4withArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                number.add(i);
            }
        }
        System.out.println(number);
    }
}



