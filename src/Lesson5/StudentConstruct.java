package Lesson5;

public class StudentConstruct {
    String name;
    String lastName;
    int age;
    double pointAvg;

    public String category(){
        if(pointAvg >= 8){
            return "Budget";
        }else if(pointAvg >= 5.0){
            return "Contract";
        }else{
            return "Expelled";
        }
    }

    public static void main(String[] args) {
        StudentConstruct student1 = new StudentConstruct();
        student1.name = "Leon";
        student1.lastName = "Kennedy";
        student1.age = 18;
        student1.pointAvg = 9.4;

        StudentConstruct student2 = new StudentConstruct();
        student2.name = "Ada";
        student2.lastName = "Wong";
        student2.age = 22;
        student2.pointAvg = 9.6;

        StudentConstruct student3 = new StudentConstruct();
        student3.name = "Jason";
        student3.lastName = "Voorhees";
        student3.age = 16;
        student3.pointAvg = 4.5;

        StudentConstruct student4 = new StudentConstruct();
        student4.name = "Michael";
        student4.lastName = "Myers";
        student4.age = 17;
        student4.pointAvg = 2.4;

        StudentConstruct[] arrStudents = {student1, student2, student3, student4};
        double sum = 0;
        for(StudentConstruct students : arrStudents){
            sum += students.pointAvg;
            System.out.println(students.name +" "+ students.lastName + " " + students.pointAvg + " " + students.category());
        }
        double avg = sum / arrStudents.length;
        System.out.println("average of all students is: "+ avg);

        double min = arrStudents[0].pointAvg;
        double max = arrStudents[0].pointAvg;

        for(StudentConstruct students : arrStudents){
            max = Math.max(max, students.pointAvg);
            min = Math.min(min, students.pointAvg);
        }
        System.out.println("the lowest average is: "+ min);
        System.out.println("the highest average is: "+ max);
    }
}
