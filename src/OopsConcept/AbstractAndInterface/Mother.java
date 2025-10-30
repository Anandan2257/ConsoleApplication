package OopsConcept.AbstractAndInterface;

interface Mother {
    void care();                   // abstract method (by default)
    default void cook() {          // default method
        System.out.println("Mother cooks delicious food.");
    }
    static void love() {           // static method
        System.out.println("Mother's love is unconditional.");
    }
}