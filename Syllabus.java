package com.college;
import java.util.Arrays;
public class Syllabus {
    public String[] subjects;
    
    public Syllabus() {}
    
    public Syllabus(String[] subjects) {
        this.subjects = subjects;
    }
    public void getdata() {
        System.out.println("Enter the subjects:"+Arrays.toString(subjects));
    }
    public void showdata() {
        System.out.println("Subjects:"+Arrays.toString(subjects));
    }
    public String[] getSubjects() { return subjects; }
    public void setSubjects(String[] subjects) { this.subjects = subjects; }
}
