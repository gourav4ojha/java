//package oops;   // remove if not using package
//
//class Animal {
//    void sound() {
//        System.out.println("Animal makes sound");
//    }
//}
//
//class Dog extends Animal {
//    @Override
//    void sound() {
//        System.out.println("Dog barks");
//    }
//}
//
//class Cat extends Animal {
//    @Override
//    void sound() {
//        System.out.println("Cat meows");
//    }
//}
//
//public class polymorphism {
//
//    public static void main(String[] args) {
//
//        Animal a;
//
//        a = new Dog();
//        a.sound();
//
//        a = new Cat();
//        a.sound();
//    }
//}
package oops;   // remove this line if you are NOT using packages

class Calculator {

    // add two integers
    int add(int a, int b) {
        return a + b;
    }

    // add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class polymorphism {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(2, 3));        // 5
        System.out.println(c.add(2, 3, 4));     // 9
        System.out.println(c.add(2.5, 3.5));    // 6.0
    }
}
