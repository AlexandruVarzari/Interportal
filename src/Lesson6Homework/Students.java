package Lesson6Homework;

public class Students {
    String name;
    int subjects;

    public Students(String name, int subjects){
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public int getSubjects() {
        return subjects;
    }

    public void setSubjects(int subjects) {
        this.subjects = subjects;
    }

    public void setName(String name) {
        this.name = name;
    }
}
