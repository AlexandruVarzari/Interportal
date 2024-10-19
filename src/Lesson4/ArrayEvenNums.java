package Lesson4;

public class ArrayEvenNums {
    public static void main(String[] args) {
        int arrNums[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < arrNums.length; i++){
            if(arrNums[i] % 2 == 0){
                System.out.println(arrNums[i]);
            }
        }
    }
}
