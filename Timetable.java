package com.college;

public class Timetable {
    public String courseName;
    public int courseId;
    public String facultyName;
    public String day;
    
    public Timetable() {}
    
    public Timetable(String cName, int cId, String fName, String d) {
        this.courseName = cName;
        this.courseId = cId;
        this.facultyName = fName;
        this.day = d;
    }
    public void getdata(String cName, int cId, String fName, String d) {
        this.courseName = cName;
        this.courseId = cId;
        this.facultyName = fName;
        this.day = d;
    }
    public void showdata() {
        System.out.println("Course Name:"+courseName);
        System.out.println("Course Id:"+courseId);
        System.out.println("Faculty Name:"+facultyName);
        System.out.println("Day:"+day);
    }
    
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    public int getCourseId() { return courseId; }
    public void setCourseId(int courseId) { this.courseId = courseId; }
    public String getFacultyName() { return facultyName; }
    public void setFacultyName(String facultyName) { this.facultyName = facultyName; }
    public String getDay() { return day; }
    public void setDay(String day) { this.day = day; }
}
