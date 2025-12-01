package com.example.cafesystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class CafeController {
    private Stage stage_new;
    @FXML
    private Label lblstatus;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    public void BaristaLogin(ActionEvent event) throws IOException {

        if(txtUsername.getText().equals("user") && txtPassword.getText().equals("pass")){
            lblstatus.setText("Login Success");
            FXMLLoader fxmlLoader_new = new FXMLLoader(CafeApplication.class.getResource("Main.fxml"));
            stage_new = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene_new = new Scene(fxmlLoader_new.load(), 300, 300);
            stage_new.setTitle("Hello!");
            stage_new.setScene(scene_new);
            stage_new.show();
        }else{
            lblstatus.setText("Login Failed");
        }
    }
    @FXML
    public void ManagerLogin(ActionEvent event) throws IOException {

        if(txtUsername.getText().equals("user") && txtPassword.getText().equals("pass")){
            lblstatus.setText("Login Success");
            FXMLLoader fxmlLoader_new = new FXMLLoader(CafeApplication.class.getResource("ManagerMain.fxml"));
            stage_new = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene_new = new Scene(fxmlLoader_new.load(), 300, 300);
            stage_new.setTitle("Hello!");
            stage_new.setScene(scene_new);
            stage_new.show();
        }else{
            lblstatus.setText("Login Failed");
        }
    }

    public void addMenuItems(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader_new = new FXMLLoader(CafeApplication.class.getResource("MenuCatalog.fxml"));
        stage_new = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene_new = new Scene(fxmlLoader_new.load(), 300, 300);
        stage_new.setTitle("Hello!");
        stage_new.setScene(scene_new);
        stage_new.show();
    }
}
