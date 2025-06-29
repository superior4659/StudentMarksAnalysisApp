import Data.StudentData;
import Entities.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentMarksAnalysisApp {

    public static void main(String [] args){
        StudentData studentData = new StudentData();

        List<Student> studentList = studentData.getStudents();
        differentGrades(studentList);


    }

    //1. Print all student names
    private static void printStudentNames(List<Student> studentList){
        studentList.stream()
                .map(student -> student.getName())
                .forEach(System.out::println);
    }


    //2. Students with marks > 70
    private static void filterByMarks(List<Student> studentList){
        studentList.stream()
                .filter(student -> student.getMarks() > 90 )
                .forEach(System.out::println);
    }

    //3 List of Students with grade A
    private static void filterByGrade(List<Student> studentList){
       List<Student> gradeAStudents = studentList.stream()
                .filter(student -> student.getGrade().equals("A"))
                .collect(Collectors.toList());

       //gradeAStudents.forEach(student -> System.out.println(student));
        gradeAStudents.forEach(System.out::println);
    }

    //4. Total no of Students
    private static void noOfStudents(List<Student> studentList){
        long total = studentList.stream()
                .count();

        System.out.println(total);
    }

    //5. Convert all to Names of Students to Uppercase
    private static void convertNamesToUppercase(List<Student> studentList){
        List<String> stdList = studentList.stream()
                .map(student ->  student.getName().toUpperCase())
                .collect(Collectors.toList());

        stdList.forEach(System.out::println);
    }

    //6. Distinct Grades
    private static void differentGrades(List<Student> studentList){
        studentList.stream()
                .map(student -> student.getGrade())
                .distinct()
                .forEach(System.out::println);

    }

    //7. Students sort by Marks
    private static void sortByMarks(List<Student> studentList){

        //This prints only marks bcoz we are transforming  by using map
        //        studentList.stream()
        //                .map(Student::getMarks)
        //                .sorted()
        //                .forEach(System.out::println);

        studentList.stream()
                .sorted(Comparator.comparingDouble(Student::getMarks).reversed())
                .forEach(System.out::println);
    }

    //8. Top 3 Students by Marks
    private  static void topStudents(List<Student> studentList){
        List<Student> stdList = studentList.stream()
                .sorted(Comparator.comparingDouble(Student::getMarks).reversed())
                .limit(3)
                .collect(Collectors.toList());

        stdList.forEach(System.out::println);

    }

    //9. Skip top 2 Studetns by marks
    private static void skipTopStudents(List<Student> studentList){
        studentList.stream()
                .sorted(Comparator.comparingDouble(Student::getMarks).reversed())
                .skip(2)
                .forEach(System.out::println);
    }

    //10 Any Student with Marks > 90
    private static void anyStudentByMarks(List<Student> studentList){
      boolean anyAbove90 =  studentList.stream()
                .anyMatch(student -> student.getMarks() > 90);
    }

    //11. Are all Students are having marks > 50
    //consumers like filter , anyMatch , allMatch  and noneMatch
    private static void allStudentsMarksCheck(List<Student> studentList){
        boolean allAbove50 = studentList.stream()
                .allMatch(student -> student.getMarks() > 50);
    }

    //12. Find first Student with Grade A
    private static void findByGrade(List<Student> studentList){
       Optional<Student>  std =  studentList.stream()
                .filter(student -> student.getGrade().equals("A"))
                .findFirst();

       std.ifPresent(System.out::println);



    }
}
