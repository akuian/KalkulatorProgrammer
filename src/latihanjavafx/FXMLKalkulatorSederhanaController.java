/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjavafx;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Hafiyyan Faza XIR5
 */
public class FXMLKalkulatorSederhanaController implements Initializable {

     @FXML
    private JFXButton butttonTambah;
     
    @FXML
    private JFXButton buttonKurang;

    @FXML
    private JFXButton buttonKali;

    @FXML
    private JFXButton buttonBagi;

    @FXML
    private TextField bilangan1;

    @FXML
    private TextField bilangan2;

    @FXML
    private JFXTextField hasiloperasi;

    @FXML
    void Pembagian(ActionEvent event) {
        
    }

    @FXML
    void Pengurangan(ActionEvent event) {

    }

    @FXML
    void Penjumlahan(ActionEvent event) {

    }

    @FXML
    void Perkalian(ActionEvent event) {

    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
