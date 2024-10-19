package Lesson4;

public class ArraySumAverage {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int avg, sum = 0;
        int len = arr.length;
        for(int i: arr){
        sum = sum + i;
        }
        avg = sum / len;
        System.out.println("average: " + avg);
        System.out.println("sum: " + sum);
    }
}
