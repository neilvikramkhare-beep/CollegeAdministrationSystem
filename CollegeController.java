package com.college;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/")
    public String home() {
        return "<html>" +
               "<head><title>College ERP</title>" +
               "<style>" +
               "body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #f0f4f8; margin: 0; padding: 40px; color: #333; }" +
               ".container { max-width: 900px; margin: auto; background: white; padding: 40px; border-radius: 12px; box-shadow: 0 10px 25px rgba(0,0,0,0.05); }" +
               "h1 { color: #2c3e50; text-align: center; margin-bottom: 30px; font-size: 2.5em; }" +
               ".nav { display: flex; justify-content: center; gap: 20px; margin-bottom: 40px; }" +
               ".nav a { text-decoration: none; padding: 12px 25px; background: #3498db; color: white; border-radius: 8px; font-weight: bold; transition: 0.3s; }" +
               ".nav a:hover { background: #2980b9; }" +
               ".card { background: #f8fafc; padding: 25px; border-radius: 8px; border-left: 5px solid #3498db; line-height: 1.6; }" +
               "</style>" +
               "</head>" +
               "<body>" +
               "<div class='container'>" +
               "<h1>College Administration ERP</h1>" +
               "<div class='nav'>" +
               "<a href='/students'>View Students</a>" +
               "<a href='/courses'>View Courses</a>" +
               "</div>" +
               "<div class='card'>" +
               "<h2>Welcome to the Web Portal</h2>" +
               "<p>This system has been upgraded from a desktop GUI to a fully Java-based web application using Spring Boot.</p>" +
               "</div>" +
               "</div>" +
               "</body></html>";
    }

    @GetMapping("/students")
    public String studentsPage() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head><title>Students</title><style>body { font-family: Arial; padding: 40px; } table { width: 100%; border-collapse: collapse; } th, td { border: 1px solid #ddd; padding: 12px; text-align: left; } th { background-color: #3498db; color: white; }</style></head><body>");
        sb.append("<h2>Enrolled Students</h2>");
        sb.append("<table><tr><th>Name</th><th>Age</th><th>Enrolled Courses</th></tr>");
        for (Student s : students) {
            sb.append("<tr><td>").append(s.getName()).append("</td><td>").append(s.getAge()).append("</td><td>").append(s.getEnrolledCourses()).append("</td></tr>");
        }
        sb.append("</table>");
        sb.append("<br><a href='/' style='text-decoration: none; padding: 10px 20px; background: #333; color: white; border-radius: 5px;'>Back to Dashboard</a>");
        sb.append("</body></html>");
        return sb.toString();
    }

    @GetMapping("/courses")
    public String coursesPage() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head><title>Courses</title><style>body { font-family: Arial; padding: 40px; } table { width: 100%; border-collapse: collapse; } th, td { border: 1px solid #ddd; padding: 12px; text-align: left; } th { background-color: #e67e22; color: white; }</style></head><body>");
        sb.append("<h2>Active Courses</h2>");
        sb.append("<table><tr><th>Course Name</th><th>Code</th><th>Credits</th></tr>");
        for (Course c : courses) {
            sb.append("<tr><td>").append(c.getCourseName()).append("</td><td>").append(c.getCourseCode()).append("</td><td>").append(c.getCredits()).append("</td></tr>");
        }
        sb.append("</table>");
        sb.append("<br><a href='/' style='text-decoration: none; padding: 10px 20px; background: #333; color: white; border-radius: 5px;'>Back to Dashboard</a>");
        sb.append("</body></html>");
        return sb.toString();
    }
}
