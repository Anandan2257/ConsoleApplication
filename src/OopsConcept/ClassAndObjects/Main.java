package OopsConcept.ClassAndObjects;

public class Main {
    public static void main(String... args){

        //Real World Entity
        ClassAndObject co = new ClassAndObject(12,true,10.0f);
        ClassAndObject co1 = new ClassAndObject();
        System.out.print("Parameterized Constructor: ");
        co.display();
        System.out.println("Normal Constructor: ");
        System.out.println("When creating object at a time to assign a default value: ");
        co1.display();
    }
}
