package StudentManagement.service;

import StudentManagement.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService{
    private static StudentService s = null;
    private static List<Student> storedStudents;
    private StudentService(){
           storedStudents = new ArrayList<>();
    }

    public static StudentService getInstance(){
        if(s == null){
            s = new StudentService();
        }
        return s;
    }

    @Override
    public void addStudents(Student s) {
        storedStudents.add(s);
        System.out.println("Student added successfully!");
    }

    @Override
    public void viewAll() {
        if(storedStudents.isEmpty()){
            System.out.println(" No students found");
        }
        System.out.println("\n--- Student List ---");
        for(Student s : storedStudents){
            System.out.println(s);
        }
        System.out.println();
        
    }

    @Override
    public void searchId(int id) {
        for(Student s : storedStudents){
            if(s.getId() == id){
                System.out.println("Found: " + s );
                     return;
                 }
             }
        System.out.println("Student not found!");
    }

    @Override
    public void deleteId(int id) {
        for(Student s : storedStudents){
            if(s.getId() == id) {
                storedStudents.remove(s);
                System.out.println("Deleted successfully!");
                return;
            }
        }
         System.out.println("ID not found!");
    }
}
