package Entities;

public class Student {

    private int rollnumber;
    private String name;
    private String grade;
    private double marks;


    public Student(int rollnumber , String name , String grade, double marks){
        this.rollnumber = rollnumber;
        this.name = name;
        this.grade = grade;
        this.marks = marks;
    }


    public int getRollnumber(){
        return rollnumber;
    }

    public String getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    //to String method

    @Override
    public String toString(){
        return "rollNumber: " + rollnumber + " name: " + name + " Grade: " + grade + " Marks " + marks ;
    }

}
