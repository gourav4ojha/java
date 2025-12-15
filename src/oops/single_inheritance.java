
package oops;   // remove this line if not using package

//Parent class
class Animal {
 void eat() {
     System.out.println("Animal eats food");
 }
}

//Child class
class Dog extends Animal {
 void bark() {
     System.out.println("Dog barks");
 }
}

public class single_inheritance {

 public static void main(String[] args) {

     Dog d = new Dog();

     d.eat();   // inherited method
     d.bark();  // child method
 }
}
