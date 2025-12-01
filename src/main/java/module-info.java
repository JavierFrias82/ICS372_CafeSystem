module com.example.cafesystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;


    opens com.example.cafesystem to javafx.fxml;
    exports com.example.cafesystem;
}