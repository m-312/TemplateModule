package com.example.templatemodule2;
import java.util.ArrayList;

public class CourseManagement {
    ArrayList<course> courseList;

    public CourseManagement(){
        this.courseList = new ArrayList<>();
    }
    public void addCourse(course course){
        courseList.add(course);
    }

    public void removeCourse(course course){
        courseList.remove(course);
    }
}
