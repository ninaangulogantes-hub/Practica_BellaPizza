module com.example.bellapizza {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.bellapizza to javafx.fxml;
    exports com.example.bellapizza;
}