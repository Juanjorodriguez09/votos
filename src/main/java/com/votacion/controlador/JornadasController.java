package com.votacion.controlador;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class JornadasController {

    @FXML
    private void handleMananaButton(ActionEvent event) {
        cargarVentana("/com/votacion/vista/JornadaManana.fxml", event);
    }

    @FXML
    private void handleTardeButton(ActionEvent event) {
        cargarVentana("/com/votacion/vista/JornadaTarde.fxml", event);
    }

    private void cargarVentana(String fxmlPath, ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Jornada");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


