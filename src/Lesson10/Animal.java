package Lesson10;

public class Animal {
   String name;
   int age;
   String breed;

    public Animal(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public void displayContent(){
        System.out.println("Dog's name: " + name + ", age: " + age + ", breed: " + breed);
    }
}
