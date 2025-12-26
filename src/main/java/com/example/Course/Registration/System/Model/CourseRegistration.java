package com.example.Course.Registration.System.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Primary;

@Entity
public class CourseRegistration {
    public CourseRegistration(String rollNo, String name, String emailId, String courseName) {
        this.rollNo = rollNo;
        this.name = name;
        this.emailId = emailId;
        this.courseName = courseName;
    }

    @Id
    private String rollNo;
    private String name;
    private String emailId;
    private String courseName;
    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public CourseRegistration(){}


}
