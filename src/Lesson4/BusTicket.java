package Lesson4;

public class BusTicket {
    public static void main(String[] args) {
        int nr[] = {1,3,4,5,6,8};
        int sum1 = nr[0] + nr[1] + nr[2];
        int sum2 = nr[3] + nr[4] + nr[5];

        if (sum1 == sum2) {
            System.out.println("Lucky ticket");
        }else{
            System.out.println("Not lucky ticket");
        }

    }
}
