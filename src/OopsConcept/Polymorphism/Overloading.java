package OopsConcept.Polymorphism;

public class Overloading {
    int add(int a,int b) {
        return a + b;
    }

    // Method 2 - add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3 - add two doubles
    double add(double a, double b) {
        return a + b;
    }
}
