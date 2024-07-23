package com.votacion.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class VotosController {

    @FXML
    private TextField idTextField;

    @FXML
    private Button ingresarButton;

    @FXML
    void ingresarAction(ActionEvent event) {
        String id = idTextField.getText();
        if (id != null && !id.isEmpty()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/votacio/vista/jornadas.fxml"));
                Parent root = loader.load();

                Stage stage = (Stage) ingresarButton.getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.setTitle("Jornadas");
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Por favor, ingrese un ID.");
        }
    }
}
