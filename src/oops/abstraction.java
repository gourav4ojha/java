package oops;

abstract class Vehicle {

    abstract void start();

    void fuel() {
        System.out.println("Vehicle needs fuel");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

public class abstraction {
    public static void main(String[] args) {

        Vehicle v = new Car();   // ✅ allowed
        v.start();
        v.fuel();
    }
}
