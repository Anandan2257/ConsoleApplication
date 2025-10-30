package OopsConcept.Polymorphism;

abstract class Overriding {
    abstract void sound();
}

// Parent class
class Animal extends Overriding{
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another child class
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}