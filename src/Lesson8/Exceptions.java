package Lesson8;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 3, 6, 7};
            System.out.println(arr[2]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index");
        }finally {
            System.out.println("this block");
        }
    }
}
