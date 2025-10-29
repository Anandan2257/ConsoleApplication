package StudentManagement.service;

import StudentManagement.model.Student;

public interface IStudentService {
    void addStudents(Student s);
    void viewAll();
    void searchId(int id);
    void deleteId(int id);
}
