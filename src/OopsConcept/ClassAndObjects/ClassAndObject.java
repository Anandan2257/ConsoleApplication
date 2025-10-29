package OopsConcept.ClassAndObjects;

public class ClassAndObject {
    //Class contains Data And Logic

    //Data
    //When creating object it occupy memory
    int a;
    boolean b;
    float f;

    ClassAndObject(){

    }
    ClassAndObject(int a, boolean b,float f){
        //Constructor
        this.a = a;
        this.b = b;
        this.f = f;
    }

    //Members or Logic
    void display(){
        System.out.println(a + " " + b + " " + f);
    }
}
