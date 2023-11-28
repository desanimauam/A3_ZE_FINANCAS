/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.com.uam.financeiro.Controllers;

import br.com.uam.financeiro.App;
import br.com.uam.financeiro.Usuario;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 */
public class MenuController implements Initializable {

    @FXML
    private Button btVoltar;
    @FXML
    private Label lbMenu;
    @FXML
    private Button btDepara;
    @FXML
    private Button btUsuarios;
    @FXML
    private Button btValores;
    @FXML
    private Button btVisualizar;
    
    
    private Usuario infoUsuario = new Usuario();
    @FXML
    private Button btGrafico;
   

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private void voltar_Click(ActionEvent event) {

        App.mudarCena("Login");
        //App.stage.close();
        //Platform.runLater( e  ->{ new App().start(new Stage()) });
        //.runLater(e -> {App appnovo = new App(); appnovo.start();});
        //Platform.runLater();
    }

    @FXML
    private void depara_Click(ActionEvent event) {
        App.mudarCena("Depara");
    }

    @FXML
    private void usuarios_Click(ActionEvent event) {
        App.mudarCena("Usuarios");
    }

    @FXML
    private void valores_Cliok(ActionEvent event) {
        App.mudarCena("ListaCompras");
    }

    @FXML
    private void visualizar_Click(ActionEvent event) {
        App.mudarCena("Visualizar");
    }

    @FXML
    private void grafico_Click(ActionEvent event) {
        App.mudarCena("Grafico");
    }
    
}
