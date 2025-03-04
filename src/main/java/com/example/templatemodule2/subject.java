package com.example.templatemodule2;

import java.util.ArrayList;

public class subject {
    String subjName;
    private String subjCode;
    private ArrayList<course> subjCourses;

    public subject(String subjName, String subjCode) {
        this.subjName = subjName;
        this.subjCode = subjCode;
        this.subjCourses = new ArrayList<>();
    }

    // Add a course to the subject
    public void addCourse(course course) {
        subjCourses.add(course);
    }

    // Override toString to print the subject and its courses
    @Override
    public String toString() {
        String toPrint = "Subject: "+subjName+" - "+ subjCode+"\nCourses:\n";
        for (course course : subjCourses) {
            toPrint += course + "\n";
        }
        return toPrint;
    }
}
