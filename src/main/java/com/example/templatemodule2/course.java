package com.example.templatemodule2;

public class course {
    private String courseCode;
    private String courseName;
    private subject courseSubject;
    private String capacity;



    public course(String courseCode, String courseName, String capacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.capacity = capacity;
    }


    @Override
    public String toString() {
        return courseName + " - " + courseCode + ":\n\tCapacity: " + capacity + "\n\tSubject: " + courseSubject.subjName;
    }
}
