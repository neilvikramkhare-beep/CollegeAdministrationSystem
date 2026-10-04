package com.college;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
public class CollegeController {
    
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();
    private List<Admission> admissions = new ArrayList<>();
    private List<Attendance> attendances = new ArrayList<>();
    private List<Examination> examinations = new ArrayList<>();
    private List<Reviews> reviews = new ArrayList<>();
    private List<Syllabus> syllabuses = new ArrayList<>();
    private List<Timetable> timetables = new ArrayList<>();
    private List<College> colleges = new ArrayList<>();

    public CollegeController() {
        students.add(new Student("Alice Johnson", 19, "Data Structures"));
        courses.add(new Course("Data Structures", "CS-204", 4));
        faculties.add(new Faculty("Dr. Smith", 45, "CS", "Professor", 1));
        colleges.add(new College("Northbridge College", "London", 1987));
    }

    @GetMapping(value = "/", produces = org.springframework.http.MediaType.TEXT_HTML_VALUE)
    public String home() {
        try {
            return new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get("index.html")));
        } catch (java.io.IOException e) {
            return "<html><body><h1>Error</h1><p>" + e.getMessage() + "</p></body></html>";
        }
    }

    @GetMapping("/api/colleges")
    public List<College> getColleges() { return colleges; }
    @PostMapping("/api/colleges")
    public College addCollege(@RequestBody College college) {
        college.showdata();
        colleges.add(college); return college; 
    }
    
    @PostMapping("/api/colleges/operation")
    public String runCollegeOperation(@RequestBody Map<String, String> payload) {
        String operation = payload.get("operation");
        String value = payload.get("value");
        if (colleges.isEmpty()) return "No college available";
        College c = colleges.get(0);
        if ("addDepartment".equals(operation)) c.addDepartment(value);
        else if ("addFaculty".equals(operation)) c.addFaculty(value);
        else if ("addStudent".equals(operation)) c.addStudent(value);
        else if ("addCourse".equals(operation)) c.addCourse(value);
        return "Operation executed: " + operation;
    }

    @GetMapping("/api/students")
    public List<Student> getStudents() { return students; }
    @PostMapping("/api/students")
    public Student addStudent(@RequestBody Student student) { students.add(student); return student; }

    @GetMapping("/api/courses")
    public List<Course> getCourses() { return courses; }
    @PostMapping("/api/courses")
    public Course addCourse(@RequestBody Course course) { courses.add(course); return course; }

    @GetMapping("/api/faculties")
    public List<Faculty> getFaculties() { return faculties; }
    @PostMapping("/api/faculties")
    public Faculty addFaculty(@RequestBody Faculty faculty) { faculties.add(faculty); return faculty; }

    @GetMapping("/api/admissions")
    public List<Admission> getAdmissions() { return admissions; }
    @PostMapping("/api/admissions")
    public Admission addAdmission(@RequestBody Admission admission) {
        admission.getdata(admission.getName(), admission.getAge(), admission.getRollNo(), admission.getSemester());
        admissions.add(admission); return admission; 
    }

    @GetMapping("/api/attendances")
    public List<Attendance> getAttendances() { return attendances; }
    @PostMapping("/api/attendances")
    public Attendance addAttendance(@RequestBody Attendance attendance) { 
        attendance.showdata();
        attendances.add(attendance); return attendance; 
    }

    @GetMapping("/api/examinations")
    public List<Examination> getExaminations() { return examinations; }
    @PostMapping("/api/examinations")
    public Examination addExamination(@RequestBody Examination examination) { 
        examination.showdata();
        examinations.add(examination); return examination; 
    }

    @GetMapping("/api/reviews")
    public List<Reviews> getReviews() { return reviews; }
    @PostMapping("/api/reviews")
    public Reviews addReview(@RequestBody Reviews review) { 
        review.getdata();
        reviews.add(review); return review; 
    }

    @GetMapping("/api/syllabuses")
    public List<Syllabus> getSyllabuses() { return syllabuses; }
    @PostMapping("/api/syllabuses")
    public Syllabus addSyllabus(@RequestBody Syllabus syllabus) { 
        syllabus.showdata();
        syllabuses.add(syllabus); return syllabus; 
    }

    @GetMapping("/api/timetables")
    public List<Timetable> getTimetables() { return timetables; }
    @PostMapping("/api/timetables")
    public Timetable addTimetable(@RequestBody Timetable timetable) { 
        timetable.showdata();
        timetables.add(timetable); return timetable; 
    }
}
