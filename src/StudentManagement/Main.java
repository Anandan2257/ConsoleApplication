package StudentManagement;

import StudentManagement.model.Student;
import StudentManagement.service.IStudentService;
import StudentManagement.service.StudentService;
import StudentManagement.util.InputUtil;
public class Main {
    public static void main(String[] args){
        IStudentService service = StudentService.getInstance();
        while(true){
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by ID");
            System.out.println("4. Delete by ID");
            System.out.println("5. Exit");

            int choice = InputUtil.readInt("Enter your Choice: ");
            switch(choice){
                case 1 ->{
                    int id = InputUtil.readInt("Enter Your ID: ");
                    String name = InputUtil.readString("Enter Your Name: ");
                    String dep = InputUtil.readString("Enter Your Department: ");
                    int age = InputUtil.readInt("Enter Your Age: ");
                    service.addStudents(new Student(id,name,dep,age));
                }
                case 2->{
                    service.viewAll();
                }
                case 3->{
                    service.searchId(InputUtil.readInt("Enter ID to search: "));
                }
                case 4->{
                    service.deleteId(InputUtil.readInt("Enter ID to delete: "));
                }
                case 5->{
                    System.out.println("Thank you....");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
}
