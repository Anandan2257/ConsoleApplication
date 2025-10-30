package OopsConcept.AbstractAndInterface;

abstract class Father {
    abstract void discipline();     // abstract method
    void guide() {                  // normal method
        System.out.println("Father guides the child in life.");
    }
}
