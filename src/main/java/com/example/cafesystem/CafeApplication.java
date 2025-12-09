package com.example.cafesystem;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class CafeApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CafeApplication.class.getResource("Panel.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 300);
        stage.setTitle("System Panel");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void showCustomerMain(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader_new = new FXMLLoader(CafeApplication.class.getResource("CustomerMain.fxml"));
        //Disregard the previous stage when clicking Menu Catalog, reuse most previous window.
        Stage stage_new = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene_new = new Scene(fxmlLoader_new.load(), 503 , 344);
        stage_new.setTitle("Customer Main");
        stage_new.setScene(scene_new);
        stage_new.show();
    }

    @FXML
    public void BaristaInterface(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader_new = new FXMLLoader(CafeApplication.class.getResource("baristaInterface.fxml"));
        //Disregard the previous stage when clicking Menu Catalog, reuse most previous window.
        Stage stage_new = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene_new = new Scene(fxmlLoader_new.load(), 503, 344);
        stage_new.setTitle("Customer Main");
        stage_new.setScene(scene_new);
        stage_new.show();
    }
}
