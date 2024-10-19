package Lesson5;

public class Methods {
    public static void main(String[] args) {
    display();
    Methods obj = new Methods();
    obj.nums(5, 10);
    }
     void nums(int a, int b){
        System.out.println(a + b);
    }
    static void display(){
        System.out.println("Hello World");
    }
}
