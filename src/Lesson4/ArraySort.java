package Lesson4;
import java.util.Arrays;
public class ArraySort {
    public static void main(String[] args) {
        int arr[] = {23, 10, 1, 3, 12, 7, 9, 22};
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
