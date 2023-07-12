package application.scenes;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class ChangePasswordPage implements PageInt {

	@Override
	public Pane createWindow() {
		
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(20, 20, 20, 20));
		root.setStyle(BG_COLOR);
		
		Label lbl = new Label("Change Password Page");
		root.setCenter(lbl);
		
		return root;
	}

}
