package Lesson10;

public class StudentBachelor extends Student{
    private String speciality;
    public StudentBachelor(String name, int id, String speciality) {
        super(name, id);
        this.speciality = speciality;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Speciality: " + speciality);
    }
}
