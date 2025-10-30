package OopsConcept.Encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String ...args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Name: ");
        String name = sc.nextLine();
        System.out.print("Enter a age: ");
        int age = sc.nextInt();
        Encapsulation e = new Encapsulation();
        e.setAge(age);
        e.setName(name);
    }
}
