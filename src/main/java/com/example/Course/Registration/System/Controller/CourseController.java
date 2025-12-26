package com.example.Course.Registration.System.Controller;

import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.CourseRegistration;
import com.example.Course.Registration.System.Service.CourseService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class CourseController {
    @Autowired
    CourseService courseService;
    @GetMapping("/courses")
    public List<Course> availableCourses(){
        return courseService.availableCourses();
    }

    @PostMapping("/courses/add")
    public String addCourse(@RequestParam("courseId") String courseId,
                            @RequestParam("courseName") String courseName,
                            @RequestParam("durationInWeeks") int durationInWeeks,
                            @RequestParam("trainer") String trainer){
        return courseService.addCourse(courseId,courseName,durationInWeeks,trainer);
    }

    @GetMapping("/courses/enrolled")
    public List<CourseRegistration> enrolledStudents(){
        return courseService.enrolledStudents();
    }

    @PostMapping("courses/register")
    public  String registerCourse(@RequestParam("rollNo") String rollNo,
                                  @RequestParam("name") String name,
                                  @RequestParam("emailId") String emailId,
                                  @RequestParam("courseName") String courseName){
        return courseService.registerCourse(rollNo,name,emailId,courseName);
    }

}