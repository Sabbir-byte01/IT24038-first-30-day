abstract class Animal {

    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {

    // Implementing abstract method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
interface Vehicle {

    // Abstract methods
    void start();
    void stop();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car starts");
    }

    public void stop() {
        System.out.println("Car stops");
    }
}

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();

        c1.start();
        c1.stop();
    }
}
public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.eat();
        d1.sound();
    }
}