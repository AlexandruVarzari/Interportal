package Lesson4;

public class MinMax {
    public static void main(String[] args) {
        int arr[] = {1,2,34,36,40,50,88};
        int min = arr[0];
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
        max = Math.max(max, arr[i]);
        min = Math.min(min, arr[i]);
        }
        System.out.println(min);
        System.out.println(max);
    }
}
