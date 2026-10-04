package com.college;

public class Attendance {
    public int roll;
    public String name;
    public int year;
    public float attendance;
    
    public Attendance() {}
    
    public Attendance(int roll, String name, int year, float attendance) {
        this.roll = roll;
        this.name = name;
        this.year = year;
        this.attendance = attendance;
    }
    public void getdata() {
        System.out.println("Enter Roll Number: "+roll);
        System.out.println("Enter Name: "+name);
        System.out.println("Enter Year: "+year);
        System.out.println("Enter Attendance: "+attendance);
    }
    public void showdata() {
        System.out.println("Roll number: "+roll);
        System.out.println("Name: "+name);
        System.out.println("Year:"+year);
        System.out.println("Attendance: "+attendance);
    }
    
    public int getRoll() { return roll; }
    public void setRoll(int roll) { this.roll = roll; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public float getAttendance() { return attendance; }
    public void setAttendance(float attendance) { this.attendance = attendance; }
}
