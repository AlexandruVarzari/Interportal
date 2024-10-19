package Lesson6;

import java.util.ArrayList;

public class MainEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Tommy", 10500.50));
        employees.add(new Employee("Lilly", 15200.32));
        employees.add(new Employee("Amanda", 9500.10));
        employees.add(new Employee("Angela", 7620.15));

        for(Employee employee : employees){
            if(employee.getSalary() >= 10000 && employee.getSalary() < 11000){
                System.out.println("Medium salary: " + employee.getName() + " with the salary: " + employee.getSalary());
            }else if(employee.getSalary() >= 12000){
                System.out.println("High salary: " + employee.getName() + " with the salary: " + employee.getSalary());
            }else{
                System.out.println("Low salary: " + employee.getName() + " with the salary: " + employee.getSalary());
            }
            if(employee.getName().equals("Angela")){
               employee.setSalary(12300.23);
            }
            System.out.println(employee.name +" "+ employee.getSalary());
        }
    }
}
