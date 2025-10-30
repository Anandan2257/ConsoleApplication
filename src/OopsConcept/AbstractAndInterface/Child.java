package OopsConcept.AbstractAndInterface;

class Child extends Father implements Mother {

    // Implement abstract method from Father
    void discipline() {
        System.out.println("Child learns discipline from Father.");
    }

    // Implement abstract method from Mother interface
    public void care() {
        System.out.println("Child receives care from Mother.");
    }

    // Additional method of Child
    void play() {
        System.out.println("Child loves to play and learn new things.");
    }
}
