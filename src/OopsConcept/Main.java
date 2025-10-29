package OopsConcept;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1) Class and Object");
            System.out.println("2) Inheritance");
            System.out.println("3) Encapsulation");
            System.out.println("4) Interface");
            System.out.println("5) Abstraction");
            System.out.println("6) Polymorphism");
            System.out.println("7) Exit");

            System.out.print("Enter a Choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1->OopsConcept.ClassAndObjects.Main.main();
                case 7->System.exit(0);
                default -> System.out.println("Enter correct choice");
            }
        }

    }
}
