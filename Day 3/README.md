Example 1:
class Student {

    private String name;
    private int age;

    public String university;
    protected String city;
    String country;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("University: " + university);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Sabbir");
        s1.setAge(23);

        s1.university = "MBSTU";
        s1.city = "Jashore";
        s1.country = "Bangladesh";

        s1.display();
    }
}

Example 2:

class Student {

    private String name;
    private int age;

    public String university;
    protected String city;
    String country;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("University: " + university);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Sabbir");
        s1.setAge(23);

        s1.university = "MBSTU";
        s1.city = "Jashore";
        s1.country = "Bangladesh";

        s1.display();
    }
}
