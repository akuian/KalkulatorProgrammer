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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Hafiyyan Faza XIR5
 */
public class FXMLDocumentController implements Initializable {
    
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
    private void Penjumlahan(ActionEvent event) {
        int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        int hasilpenjumlahan = bil1+bil2;
        
        hasiloperasi.setText(String.valueOf(hasilpenjumlahan));
    }

    @FXML
    private void Pengurangan(ActionEvent event) {
         int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        int hasilpenjumlahan = bil1-bil2;
        
        hasiloperasi.setText(String.valueOf(hasilpenjumlahan));
    }

    @FXML
    private void Perkalian(ActionEvent event) {
        int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        int hasilpenjumlahan = bil1*bil2;
        
        hasiloperasi.setText(String.valueOf(hasilpenjumlahan));

    }

    @FXML
    private void Pembagian(ActionEvent event) {
        int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        int hasilpenjumlahan = bil1/bil2;
        
        hasiloperasi.setText(String.valueOf(hasilpenjumlahan));

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
