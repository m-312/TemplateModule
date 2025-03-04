package com.example.templatemodule2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class dataClasssController {
    public TextField CourseNameText;
    public TextField CourseCodeText;
    public TextField CourseCapacityText;
    public Button courseDataSubmit;
    public Button courBackButton;
    String name, code;
    String capacity;

    @FXML
    protected void onCourseSubmitButton() {
        name = CourseNameText.getText();
        code = CourseCodeText.getText();
        capacity = CourseCapacityText.getText();
        CourseManagement courseManager = new CourseManagement();
        course course = new course(code,name,capacity);
        courseManager.addCourse(course);
        CourseNameText.setText("");
        CourseCodeText.setText("");
        CourseCapacityText.setText("");


    }

    @FXML
    protected void onCourBackButton() {

    }
}
