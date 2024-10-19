package Lesson8;

public class ExceptionsTwo {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        try {
            int result = a / b;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("can't divide by zero");
        }
    }
}
