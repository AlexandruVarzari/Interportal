package Lesson6;

import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        arr.add(16);
        System.out.println(arr.get(1));
        arr.set(0, 5);
        arr.remove(1);
        int sum = 0;
        for(int i=0; i < arr.size(); i++) {
            sum+=arr.get(i);
        }
        System.out.println(sum);
    }
}
