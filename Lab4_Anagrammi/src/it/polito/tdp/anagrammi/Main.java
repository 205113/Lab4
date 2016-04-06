package it.polito.tdp.anagrammi;
	
import it.polito.tdp.modelli.AnagrammaModel;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader= new FXMLLoader(getClass().getResource("SegreteriaStudenti.fxml"));
			BorderPane root=(BorderPane)loader.load();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			AnagrammiController c= loader.getController();
			AnagrammaModel m= new AnagrammaModel();
			c.setModel(m);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
