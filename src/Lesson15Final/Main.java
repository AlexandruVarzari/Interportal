package Lesson15Final;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "Leon");
        map.put(3, "Ada");
        System.out.println(map.get(2));
    }
}
