package Data;

import Entities.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentData {

    //instead of DAO and DB ..directly we have data class
    public static List<Student> getStudents(){

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", "A", 85));
        students.add(new Student(2, "Bob", "B", 78));
        students.add(new Student(3, "Charlie", "A", 92));
        students.add(new Student(4, "David", "C", 65));
        students.add(new Student(5, "Eva", "B", 74));
        students.add(new Student(6, "Frank", "A", 88));

        return students;
    }
}
