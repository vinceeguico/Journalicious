package application;
	
import application.scenes.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private static final String TITLE = "Journalicious";
	
	
	private SceneController controller;
	
	
	public Main() {
		 this.controller = new SceneController();
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Scene scene = this.controller.getCurrentScene();
			
			primaryStage.setScene(scene);
			primaryStage.setTitle(TITLE);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
