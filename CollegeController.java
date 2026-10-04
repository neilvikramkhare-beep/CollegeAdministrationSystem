package com.college;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class CollegeController {
    
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public CollegeController() {
        students.add(new Student("Alice Johnson", 19, "Data Structures"));
        students.add(new Student("Bob Smith", 20, "Mathematics, Physics"));
        courses.add(new Course("Data Structures", "CS-204", 4));
        courses.add(new Course("Mathematics", "MATH-101", 3));
    }

    @GetMapping(value = "/", produces = org.springframework.http.MediaType.TEXT_HTML_VALUE)
    public String home() {
        try {
            return new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get("index.html")));
        } catch (java.io.IOException e) {
            return "<html><body><h1>Error loading frontend</h1><p>" + e.getMessage() + "</p></body></html>";
        }
    }

    @GetMapping("/api/students")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("/api/students")
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

    @GetMapping("/api/courses")
    public List<Course> getCourses() {
        return courses;
    }

    @PostMapping("/api/courses")
    public Course addCourse(@RequestBody Course course) {
        courses.add(course);
        return course;
    }
}
