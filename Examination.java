package com.college;
import java.util.Arrays;
public class Examination {
    public String name;
    public int roll;
    public String[] subjects;
    public int[] marks;
    public String examName;
    
    public Examination() {}
    
    public Examination(String name, int roll, String[] subjects, int[] marks, String examName) {
        this.name = name;
        this.roll = roll;
        this.subjects = subjects;
        this.marks = marks;
        this.examName = examName;
    }
    public void getdata() {
        System.out.println("Enter the name:"+name);
        System.out.println("Enter the roll number:"+roll);
        System.out.println("Enter the subjects:"+Arrays.toString(subjects));
        System.out.println("Enter the marks:"+Arrays.toString(marks));
        System.out.println("Enter the type of exam:"+examName);
    }
    public void showdata() {
        System.out.println("Name:"+name);
        System.out.println("Roll number:"+roll);
        System.out.println("Subjects:"+Arrays.toString(subjects));
        System.out.println("Marks:"+Arrays.toString(marks));
        System.out.println("Type of exam:"+examName);
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getRoll() { return roll; }
    public void setRoll(int roll) { this.roll = roll; }
    public String[] getSubjects() { return subjects; }
    public void setSubjects(String[] subjects) { this.subjects = subjects; }
    public int[] getMarks() { return marks; }
    public void setMarks(int[] marks) { this.marks = marks; }
    public String getExamName() { return examName; }
    public void setExamName(String examName) { this.examName = examName; }
}
