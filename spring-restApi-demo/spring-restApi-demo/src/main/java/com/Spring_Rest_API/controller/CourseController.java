package com.Spring_Rest_API.controller;

import com.Spring_Rest_API.entities.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController
{
    @RequestMapping("/courses")
  public List<Course> retierveAllCourses()
  {
      return Arrays.asList(new Course(1,"Java course","youtube"),
              new Course(2,"C++","Udemy"));
  }

}
