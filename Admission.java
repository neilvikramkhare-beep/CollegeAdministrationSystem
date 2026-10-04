package com.college;

public class Admission {
    public String name;
    public int age;
    public int rollNo;
    public int semester;

    public Admission() {}

    public Admission(String name, int age, int rollNo, int semester) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.semester = semester;
    }

    public void getdata(String name, int age, int rollNo, int semester) {
        System.out.println("Admission created for " + name + ", roll: " + rollNo);
    }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public int getRollNo() { return rollNo; }
    public void setRollNo(int rollNo) { this.rollNo = rollNo; }
    public int getSemester() { return semester; }
    public void setSemester(int semester) { this.semester = semester; }
}
