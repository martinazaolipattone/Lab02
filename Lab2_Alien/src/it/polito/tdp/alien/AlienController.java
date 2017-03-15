package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
   
 
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    AlienDictionary ad = new AlienDictionary();
    
    @FXML
    void doTranslate(ActionEvent event) {
    	
    	String s = txtWord.getText().toLowerCase();
    	
    		if(s.contains(" ")){
			String parole[] = s.split(" ");
			
			ad.addWord(parole[0], parole[1]);
			
			txtResult.appendText(parole[0]+" "+parole[1]+"\n");
		}
		else{
			String trad = ad.translateWord(s);
			if(trad != null)
				txtResult.appendText(trad);
			else
				txtResult.appendText("La parola non è presente nel dizionario\n");
		}
    	    	
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();
    	
    }
    
}
