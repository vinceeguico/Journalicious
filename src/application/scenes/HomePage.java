package application.scenes;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class HomePage implements PageInt {
	
	public BorderPane createWindow() {
		
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(20, 20, 20, 20));
		root.setStyle(BG_COLOR);
		
		Label lbl = new Label("Home Page");
		root.setCenter(lbl);
		
		return root;
	}
	
	
}
