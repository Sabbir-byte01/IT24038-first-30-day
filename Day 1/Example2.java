class Student {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Sabbir";
        s1.age = 23;

        s1.displayInfo();
    }
}