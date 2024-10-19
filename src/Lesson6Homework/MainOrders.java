package Lesson6Homework;

import java.util.ArrayList;

public class MainOrders {
    public static void main(String[] args) {
        ArrayList<Orders> orders = new ArrayList<>();
        orders.add(new Orders(123923, "Antonio Montana", 23));
        orders.add(new Orders(321785, "James Bond", 1230));
        orders.add(new Orders(441020, "Antonio Montana", 50));

        for(Orders order : orders){
            if(order.getAmount() > 1000){
                System.out.println("The order bigger than 1000 is: " + order.getCustomerName()
                        + " with the total amount of " + order.getAmount());
            }
        }

        double sum = 0;

        for(Orders orderSum : orders){
          sum += orderSum.getAmount();
        }
        System.out.println("Amount for all orders is: " + sum);
    }
}
