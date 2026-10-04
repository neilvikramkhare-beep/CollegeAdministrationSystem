package com.college;

public class College {
    public String name;
    public String location;
    public int establishedYear;
    
    public College() {}
    
    public College(String name, String location, int establishedYear) {
        this.name = name;
        this.location = location;
        this.establishedYear = establishedYear;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public int getEstablishedYear() { return establishedYear; }
    public void setEstablishedYear(int establishedYear) { this.establishedYear = establishedYear; }

    public void addStudent(String student) {
        System.out.println("Student " + student + " added to the college.");
    }
    public void addCourse(String course) {
        System.out.println("Course " + course + " added to the college.");
    }
    public void addFaculty(String faculty) {
        System.out.println("Faculty " + faculty + " added to the college.");
    }
    public void addDepartment(String department) {
        System.out.println("Department " + department + " added to the college.");
    }
    public void getdata()
    {
        System.out.println("College Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Established Year: " + establishedYear);
    }
    public void showdata()
    {
        System.out.println("Name:"+ name);
        System.out.println("Location:"+ location);
        System.out.println("Established Year:"+ establishedYear);
    }
}
