package com.example.bellapizza;

import com.example.bellapizza.BD.ClienteDAO;
import com.example.bellapizza.BD.ConexionBD;
import com.example.bellapizza.entities.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class RegistroController {
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtUsuario;
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtContrasena;
    @FXML
    private TextField txtConfirmar;
    @FXML
    private Label labelStatus;

    public void registrar(ActionEvent actionEvent) throws SQLException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("ERROR");
        boolean esIgual = false;

        if(!txtConfirmar.getText().equalsIgnoreCase(txtConfirmar.getText())){
            esIgual = true;
            alert.setContentText("Los campos -Contraseña- y -Confirmar contraseña- deben coincidir. Vuelva a intentarlo.");
            alert.showAndWait();
            return;
        }
        while(!esIgual) {
            Cliente c = new Cliente(txtNombre.getText(), txtUsuario.getText(), txtCorreo.getText(), txtConfirmar.getText());
            if(ClienteDAO.actualizarCliente(c)){
                labelStatus.setText("¡Cliente registrado con éxito!");
            }else{
                alert.setContentText("Error al registrar el cliente. Inténtelo de nuevo.");
                alert.showAndWait();
                return;
            }
        }


    }

    public void atras(ActionEvent actionEvent) {
    }
}
