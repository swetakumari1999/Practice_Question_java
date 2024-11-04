package com.Spring_Rest_API.entities;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class Course
{
   private int id;
   private String course_name;
   private String auther;

    public Course(int id, String course_name, String auther) {
        this.id = id;
        this.course_name = course_name;
        this.auther = auther;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", course_name='" + course_name + '\'' +
                ", auther='" + auther + '\'' +
                '}';
    }
}
