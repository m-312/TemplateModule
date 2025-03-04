package com.example.templatemodule2;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class unknownController {

    @FXML
    public Label userTypeLabel;

    public Button addCourseButton;
    public Button addSubjectButton;



    @FXML
    public void launchMod()
    {
        if (main.userType == 'a') {
            userTypeLabel.setText("ADMIN");
        }
        if (main.userType == 'u'){
            userTypeLabel.setText("USER");
        }
    }



    @FXML
    protected void onSubjectManagmentButton() throws IOException {
        Stage currentStage = (Stage) userTypeLabel.getScene().getWindow();
        main.switchScene(currentStage, "subjectManagment");
    }
    @FXML
    protected void onCourseManagmentButton() throws IOException {
        Stage currentStage = (Stage) userTypeLabel.getScene().getWindow();
        main.switchScene(currentStage, "courseManagment");
    }
    @FXML
    protected void onStudentManagmentButton() throws IOException {
        Stage currentStage = (Stage) userTypeLabel.getScene().getWindow();
        main.switchScene(currentStage, "studentManagment");
    }
    @FXML
    protected void onFacuiltyManagmentButton() throws IOException {
        Stage currentStage = (Stage) userTypeLabel.getScene().getWindow();
        main.switchScene(currentStage, "facuiltyManagment");
    }
    @FXML
    protected void onEventManagmentButton() throws IOException {
        Stage currentStage = (Stage) userTypeLabel.getScene().getWindow();
        main.switchScene(currentStage, "eventManagment");
    }

    @FXML
    protected void onAddCourseButton() throws IOException {
        Stage currentStage = (Stage) userTypeLabel.getScene().getWindow();
        FXMLLoader dataPage = new FXMLLoader(main.class.getResource("courseData.fxml"));
        Scene dataPageScene = new Scene(dataPage.load());
        currentStage.setTitle("dataPageScene");
        currentStage.setScene(dataPageScene);
        currentStage.show();
    }

    @FXML
    protected void onAddSubjectButton() throws IOException {
        Stage currentStage = (Stage) userTypeLabel.getScene().getWindow();
        FXMLLoader subjectPage = new FXMLLoader(main.class.getResource("subjectData.fxml"));
        Scene subjectPageScene = new Scene(subjectPage.load());
        currentStage.setTitle("subjectPageScene");
        currentStage.setScene(subjectPageScene);
        currentStage.show();
    }




}
