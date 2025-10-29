package StudentManagement.model;

public class Student {
    private final int id;
    private final String name;
    private final String dep;
    private final int age;

    public Student(int id, String name, String dep, int age){
        this.id = id;
        this.name = name;
        this.dep = dep;
        this.age = age;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDep(){
        return dep;
    }
    public int getAge(){
        return age;
    }

    public String toString(){
        return "Id: " + id + " Name: " + name + " Department: " + dep + " Age: " + age;
    }
}
