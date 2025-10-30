package OopsConcept.AbstractAndInterface;

public class Main {
    public static void main(String ...args) {
        // Polymorphism with abstract class reference
        Father f = new Child();
        f.discipline();
        f.guide();

        System.out.println();

        // Interface reference
        Mother m = new Child();
        m.care();
        m.cook();       // default method
        Mother.love();  // static method

        System.out.println();

        // Direct child object
        Child c = new Child();
        c.play();
    }
}
