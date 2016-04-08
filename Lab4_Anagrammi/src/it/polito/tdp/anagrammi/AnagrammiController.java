package it.polito.tdp.anagrammi;

import java.awt.Color;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.modelli.AnagrammaModel;
import it.polito.tdp.modelli.Parola;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
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
    private TextFlow testo;
    
    @FXML
    private TextArea risultato;

    @FXML
    private Button reset;

    @FXML
    void Anagramma(ActionEvent event) {
    	String testo="";
    	List<String> parole = model.permuta(parola.getText());
    	List<Parola> valide= model.esistenti(parole);
    	for(int i=0;i<valide.size();i++){
    		testo+=valide.get(i).toString()+"\n";
    	}
    	risultato.setText(testo);
    	//Text test= new Text(testo);
    	//test.setFill(Color.red);
    }

    
    @FXML
    void cancella(ActionEvent event) {
    	parola.clear();
    	risultato.clear();
    }

    	
    	public void setModel(AnagrammaModel a){
    		this.model=a;
    	}
    @FXML
    void initialize() {
        assert parola != null : "fx:id=\"parola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert calcola != null : "fx:id=\"calcola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert testo != null : "fx:id=\"testo\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert risultato != null : "fx:id=\"risultato\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert reset != null : "fx:id=\"reset\" was not injected: check your FXML file 'Anagrammi.fxml'.";

    }
}
