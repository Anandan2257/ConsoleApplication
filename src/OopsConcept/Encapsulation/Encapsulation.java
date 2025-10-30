package OopsConcept.Encapsulation;

public class Encapsulation {
    private int age;
    private String name;

    public void setAge(int age) {
        if(age >= 18){
            this.age = age;
            System.out.println("Thanks You are Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }
    public int getAge() {
        return age;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
