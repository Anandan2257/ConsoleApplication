package OopsConcept.Polymorphism;

public class Main {
    public static void main(String ...args){
        Overloading overloading = new Overloading();

        System.out.println("Overloading Example: ");
        System.out.println("Sum of 2 int: "+overloading.add(10,20));
        System.out.println("Sum of 3 int: "+overloading.add(10,20,30));
        System.out.println("Sum of 2 double: "+overloading.add(5.5,3.2));

        System.out.println("Overriding Example: ");
        Overriding a;  // reference of parent

        a = new Dog();  // Dog object
        a.sound();      // Calls Dog's version

        a = new Cat();  // Cat object
        a.sound();      // Calls Cat's version
    }
}
