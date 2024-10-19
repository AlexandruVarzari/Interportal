package Lesson6Homework;

public class Orders {
    int ID;
    String customerName;
    double amount;

    public Orders(int ID, String customerName, double amount){
        this.ID = ID;
        this.customerName = customerName;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
