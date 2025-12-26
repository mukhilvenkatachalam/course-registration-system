package com.example.Course.Registration.System.Service;

import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.CourseRegistration;
import com.example.Course.Registration.System.Repository.CourseRegistrationRepo;
import com.example.Course.Registration.System.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;
    @Autowired
    CourseRegistrationRepo courseRegistrationRepo;
    public List<Course> availableCourses() {
        return courseRepo.findAll();
    }


    public String addCourse(String courseId, String courseName, int durationInWeeks, String trainer) {
        Course course = new Course(courseId,courseName,durationInWeeks,trainer);
        courseRepo.save(course);
        return "Successfully added!";
    }

    public List<CourseRegistration> enrolledStudents() {
        return courseRegistrationRepo.findAll();
    }


    public String registerCourse(String rollNo, String name, String emailId, String courseName) {
        CourseRegistration courseRegistration = new CourseRegistration(rollNo,name,emailId,courseName);
        courseRegistrationRepo.save(courseRegistration);
        return "registered Successfully!";
    }
}
