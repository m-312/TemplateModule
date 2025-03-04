package com.example.templatemodule2;

import java.util.ArrayList;

public class subjectManagement {
    subject subj1 = new subject("Mathematics","MATH001");
    subject subj2 = new subject("English", "ENG101");
    subject subj3 = new subject("Computer Science","CS201");
    subject subj4 = new subject("Chemistry", "CHEM200");
    subject subj5 = new subject("Biology", "BIO300");
    subject subj6 = new subject("Engineering", "ENGG402");
    subject subj7 = new subject("History","HIST101");
    subject subj8 = new subject("Music", "MUSIC102");
    subject subj9 = new subject("Psychology","PSYCHO100");

    ArrayList<subject> subjectList;

    public subjectManagement(){
        this.subjectList = new ArrayList<>();
    }
    /*
    public void SubjectManagement(){
        subjectList.add(subj1);
        subjectList.add(subj2);
        subjectList.add(subj3);
        subjectList.add(subj4);
        subjectList.add(subj5);
        subjectList.add(subj6);
        subjectList.add(subj7);
        subjectList.add(subj8);
        subjectList.add(subj9);
    }
    */


    public void addSubject(subject subject){
        subjectList.add(subject);
    }

    public void removeSubject(subject subject){
        subjectList.remove(subject);
    }
}
