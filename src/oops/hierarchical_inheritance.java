package oops;   // remove this line if you are NOT using package

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// First child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Second child class
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class hierarchical_inheritance {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
