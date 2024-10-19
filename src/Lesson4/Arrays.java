package Lesson4;

public class Arrays {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i < arr.length; i++){
           if(arr[i] % 2 != 0){
               System.out.println(arr[i]);
           }
        }
        String banks[] = {"Maib", "Express", "Other"};
        for(int j = 0; j < banks.length; j++){
            System.out.println(banks[2]);
        }
    }

    public static void sort(int[] arr) {

    }
}
