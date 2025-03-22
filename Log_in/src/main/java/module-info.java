module com.example.log_in {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.log_in to javafx.fxml;
    exports com.example.log_in;
}