package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.modelli.AnagrammaModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;

public class AnagrammiController {
	private AnagrammaModel model;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField parola;

    @FXML
    private Button calcola;

    @FXML
    private TextFlow risultato;

    @FXML
    private Button reset;

    @FXML
    void Anagramma(ActionEvent event) {

    }

    @FXML
    void cancella(ActionEvent event) {

    }

    	
    	public void setModel(AnagrammaModel a){
    		this.model=a;
    	}
    		
    	
    @FXML
    void initialize() {
        assert parola != null : "fx:id=\"parola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert calcola != null : "fx:id=\"calcola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert risultato != null : "fx:id=\"risultato\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert reset != null : "fx:id=\"reset\" was not injected: check your FXML file 'Anagrammi.fxml'.";

    }
}
