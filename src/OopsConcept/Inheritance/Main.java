package OopsConcept.Inheritance;

public class Main {
    public  static  void main(String ...args){
        Inheritance i = new B();//upcasting
        //i.display(); cannot access child class methods;
        i.inherited();
        B b = (B)i; //Down casting
        b.display();

        Inheritance i1 = new Inheritance();
        //B b = (B)i1;  Runtime Error: ClassCastException
    }
}
