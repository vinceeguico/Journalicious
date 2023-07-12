package application.scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public interface PageInt {
	// sizing constants
	static final int WINDOW_WIDTH = 400;
	static final int WINDOW_HEIGHT = 400;
	
	// styling constants
	static final String BG_COLOR = "-fx-background-color: cyan;";
	static final int PAGE_MARGIN = 15;
	static final int BUTTON_WIDTH = 20;
	static final int BUTTON_HEIGHT = 10;
	
	
	// abstract methods
	public Pane createWindow();

	
	// default methods
	public default Scene getScene() {
		Pane root = createWindow();
		Scene currentScene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);
		
		return currentScene;
	}
	

	
	public default Button createButton(String name, int width, int height) {
		Button btn = new Button(name);
		btn.setPrefWidth(width);
		btn.setPrefHeight(height);
		
		return btn;
	}
	
	public default Button createButton(String name) {
		Button btn = createButton(name, BUTTON_WIDTH, BUTTON_HEIGHT);
		return btn;
	}
	
}
