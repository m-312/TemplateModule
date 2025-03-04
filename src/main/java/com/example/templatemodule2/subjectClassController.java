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


public class subjectClassController {
    public TextField subjectNameText;
    public TextField subjectCodeText;
    public Button subjectSubmitButton;
    public Button subjBackButton;

    String sname, scode;

    @FXML
    protected void onSubjectSubmitButton() {
        sname = subjectNameText.getText();
        scode = subjectCodeText.getText();

        subjectManagement manager = new subjectManagement();
        subject subject = new subject(sname, scode);
        manager.addSubject(subject);

        subjectNameText.setText("");
        subjectCodeText.setText("");
    }

    @FXML
    protected void onSubjBackButton() throws IOException {
        Stage currentStage = (Stage) subjectNameText.getScene().getWindow();
        FXMLLoader subjectPage = new FXMLLoader(main.class.getResource("Module.fxml"));
        Scene subjectPageScene = new Scene(subjectPage.load());
        currentStage.setTitle("subjectPageScene");
        currentStage.setScene(subjectPageScene);
        currentStage.show();
    }
}
