package OopsConcept.Interface;

class Child implements Father,Mother{
    public void discipline() {
        System.out.println("Child learns discipline from Father.");
    }

    public void care() {
        System.out.println("Child receives care from Mother.");
    }

    // Since both Father and Mother have 'work()' method,
    // only one implementation is needed.
    public void work() {
        System.out.println("Child learns to work hard from both parents.");
    }
}
