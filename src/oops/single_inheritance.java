
package oops;   // remove this line if not using package

//Parent class
class Vehical {
 void eat() {
     System.out.println("Animal eats food");
 }
}

//Child class
class car extends Vehical {
 void bark() {
     System.out.println("Dog barks");
 }
}

public class single_inheritance {

 public static void main(String[] args) {

     car d = new car();

     d.eat();   // inherited method
     d.bark();  // child method
 }
}
