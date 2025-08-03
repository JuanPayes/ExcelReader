module com.example.testito {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testito to javafx.fxml;
    exports com.example.testito;
}