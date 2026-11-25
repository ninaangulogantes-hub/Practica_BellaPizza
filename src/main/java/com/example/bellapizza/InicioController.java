package com.example.bellapizza;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class InicioController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Bella Pizza");
    }

    public void registrarse(ActionEvent actionEvent) {


    }
}
