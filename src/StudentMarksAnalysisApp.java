import Data.StudentData;
import Entities.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentMarksAnalysisApp {

    public static void main(String [] args){
        StudentData studentData = new StudentData();

        List<Student> studentList = studentData.getStudents();
        printAllStudents(studentList);

        System.out.println("\n Filtered Students \n");
        List<Student> filteredStudentList = filterByMarks(studentList);
        printAllStudents(filteredStudentList);


    }

    //1. Print all Students using Strem's terminal operation called "forEach"
    private static void printAllStudents(List<Student> studentList){
        studentList.stream()
                .forEach(student -> System.out.println(student));
    }

    //2. Filter Students with marks > 70
    private static List<Student> filterByMarks(List<Student> studentList){
        return studentList.stream().filter(student -> student.getMarks() > 70).collect(Collectors.toList());

    }
    


}
