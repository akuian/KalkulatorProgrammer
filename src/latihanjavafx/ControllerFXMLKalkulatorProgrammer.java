/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Hafiyyan Faza XIR5
 */
public class ControllerFXMLKalkulatorProgrammer implements Initializable {
    private String angka = "";
     int jumlah,angka1,angka2;
     int pilih;
     int konbel1,konbel2,konbel3;
     String tobinary,tohex,tooct;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button button0;
    @FXML
    private Button buttonplus;
    @FXML
    private TextField decfill;
    @FXML
    private Button buttonmin;
    @FXML
    private Button buttonbagi;
    @FXML
    private Button buttonkali;
    @FXML
    private Button buttonreset;
    @FXML
    private Button buttonsamadengan;
    @FXML
    private TextField binfill;
    @FXML
    private TextField octfill;
    @FXML
    private TextField hexfill;
    @FXML
    private Button buttonpersen;
    @FXML
    private Button buttonmodulus;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void satu(ActionEvent event) {
         angka += "1";
         decfill.setText(angka);
         konbel1=Integer.parseInt(decfill.getText());
         tobinary = Integer.toBinaryString(konbel1);
         tooct = Integer.toOctalString(konbel1);
         tohex = Integer.toHexString(konbel1);
         binfill.setText(tobinary);
         octfill.setText(tooct);
         hexfill.setText(tohex);
    }

    @FXML
    private void dua(ActionEvent event) {
         angka += "2";
         decfill.setText(angka);
         konbel1=Integer.parseInt(decfill.getText());
          tobinary = Integer.toBinaryString(konbel1);
         tooct = Integer.toOctalString(konbel1);
         tohex = Integer.toHexString(konbel1);
         binfill.setText(tobinary);
         octfill.setText(tooct);
         hexfill.setText(tohex);
    }

    @FXML
    private void tiga(ActionEvent event) {
          angka += "3";
         decfill.setText(angka);
         konbel1=Integer.parseInt(decfill.getText());
          tobinary = Integer.toBinaryString(konbel1);
         tooct = Integer.toOctalString(konbel1);
         tohex = Integer.toHexString(konbel1);
         binfill.setText(tobinary);
         octfill.setText(tooct);
         hexfill.setText(tohex);
    }

    @FXML
    private void empat(ActionEvent event) {
          angka += "4";
         decfill.setText(angka);
         konbel1=Integer.parseInt(decfill.getText());
          tobinary = Integer.toBinaryString(konbel1);
         tooct = Integer.toOctalString(konbel1);
         tohex = Integer.toHexString(konbel1);
         binfill.setText(tobinary);
         octfill.setText(tooct);
         hexfill.setText(tohex);
    }

    @FXML
    private void lima(ActionEvent event) {
          angka += "5";
         decfill.setText(angka);
         konbel1=Integer.parseInt(decfill.getText());
          tobinary = Integer.toBinaryString(konbel1);
         tooct = Integer.toOctalString(konbel1);
         tohex = Integer.toHexString(konbel1);
         binfill.setText(tobinary);
         octfill.setText(tooct);
         hexfill.setText(tohex);
    }

    @FXML
    private void enam(ActionEvent event) {
        angka += "6";
         decfill.setText(angka);
         konbel1=Integer.parseInt(decfill.getText());
          tobinary = Integer.toBinaryString(konbel1);
         tooct = Integer.toOctalString(konbel1);
         tohex = Integer.toHexString(konbel1);
         binfill.setText(tobinary);
         octfill.setText(tooct);
         hexfill.setText(tohex);
    }

    @FXML
    private void tujuh(ActionEvent event) {
        angka += "7";
         decfill.setText(angka);
         konbel1=Integer.parseInt(decfill.getText());
          tobinary = Integer.toBinaryString(konbel1);
         tooct = Integer.toOctalString(konbel1);
         tohex = Integer.toHexString(konbel1);
         binfill.setText(tobinary);
         octfill.setText(tooct);
         hexfill.setText(tohex);
    }

    @FXML
    private void delapan(ActionEvent event) {
         angka += "8";
         decfill.setText(angka);
         konbel1=Integer.parseInt(decfill.getText());
          tobinary = Integer.toBinaryString(konbel1);
         tooct = Integer.toOctalString(konbel1);
         tohex = Integer.toHexString(konbel1);
         binfill.setText(tobinary);
         octfill.setText(tooct);
         hexfill.setText(tohex);
    }

    @FXML
    private void sembilan(ActionEvent event) {
        angka += "9";
         decfill.setText(angka);
         konbel1=Integer.parseInt(decfill.getText());
          tobinary = Integer.toBinaryString(konbel1);
         tooct = Integer.toOctalString(konbel1);
         tohex = Integer.toHexString(konbel1);
         binfill.setText(tobinary);
         octfill.setText(tooct);
         hexfill.setText(tohex);    
    }

    @FXML
    private void nol(ActionEvent event) {
        angka += "0";
        
        decfill.setText(angka);
        konbel1=Integer.parseInt(decfill.getText());
          tobinary = Integer.toBinaryString(konbel1);
         tooct = Integer.toOctalString(konbel1);
         tohex = Integer.toHexString(konbel1);
         binfill.setText(tobinary);
         octfill.setText(tooct);
         hexfill.setText(tohex);
    }

    @FXML
    private void plus(ActionEvent event) {
        angka1=Integer.parseInt(angka);
        decfill.setText("+");
        angka="";
        pilih=1;
    }

    @FXML
    private void min(ActionEvent event) {
        angka1=Integer.parseInt(angka);
        decfill.setText("-");
        angka="";
        pilih=2;
    }

    @FXML
    private void bagi(ActionEvent event) {
        angka1=Integer.parseInt(angka);
        decfill.setText(":");
        angka="";
        pilih=3;
    }

    @FXML
    private void kali(ActionEvent event) {
        angka1=Integer.parseInt(angka);
        decfill.setText("x");
        angka="";
        pilih=4;
    }
    @FXML
    private void persen(ActionEvent event){
        angka1=Integer.parseInt(angka);
        decfill.setText("%");
        jumlah = angka1 / 100;
            angka = Integer.toString(jumlah);
            decfill.setText(angka);
    }
    @FXML
     private void modulus(ActionEvent event) {
         angka1=Integer.parseInt(angka);
        decfill.setText("mod");
        angka="";
        pilih=5;
    }
    @FXML
    private void reset(ActionEvent event) {
        decfill.setText("");
        binfill.setText("");
        hexfill.setText("");
        octfill.setText("");
        angka1=0;
        angka2=0;
        jumlah=0;
        angka="";
    }

    @FXML
    private void samadengan(ActionEvent event) {
        konbel1=Integer.parseInt(decfill.getText());
          tobinary = Integer.toBinaryString(konbel1);
         tooct = Integer.toOctalString(konbel1);
         tohex = Integer.toHexString(konbel1);
         binfill.setText(tobinary);
         octfill.setText(tooct);
         hexfill.setText(tohex);
        switch(pilih){
        case 1:
            angka2 = Integer.parseInt(angka);
            jumlah = angka1 + angka2;
            angka = Integer.toString(jumlah);
            decfill.setText(angka);
            break;
        case 2:
            angka2 = Integer.parseInt(angka);
            jumlah = angka1 - angka2;
            angka = Integer.toString(jumlah);
            decfill.setText(angka);
            break;
        case 3:
            angka2 = Integer.parseInt(angka);
            jumlah = angka1 / angka2;
            angka = Integer.toString(jumlah);
            decfill.setText(angka);
            break;
        case 4:
            angka2 = Integer.parseInt(angka);
            jumlah = angka1 * angka2;
            angka = Integer.toString(jumlah);
            decfill.setText(angka);
        case 5:
            angka2 = Integer.parseInt(angka);
            jumlah = angka1 % angka2;
            angka = Integer.toString(jumlah);
            decfill.setText(angka);
            break;
            default:
            break;
            
    }
    
    }
    
}
