package com.example.cafesystem;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;



public class CafeApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CafeApplication.class.getResource("Panel.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 300);
        stage.setTitle("System Access Panel");
        stage.setScene(scene);
        stage.show();
    }

    public void BarristaScene(ActionEvent event) throws IOException {
        Stage stage1 = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(CafeApplication.class.getResource("barista_login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 300);
        stage1.setTitle("Barista Login Panel");
        stage1.setScene(scene);
        stage1.show();
    }

    public void ManagerScene(ActionEvent event) throws IOException {
        Stage stage1 = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(CafeApplication.class.getResource("manager_login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 300);
        stage1.setTitle("Manager Login Panel");
        stage1.setScene(scene);
        stage1.show();
    }

    public void CustomerScene(ActionEvent event) throws IOException {
        Stage stage1 = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(CafeApplication.class.getResource("CustomerMain.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 300);
        stage1.setTitle("Customer Panel");
        stage1.setScene(scene);
        stage1.show();
    }
}
