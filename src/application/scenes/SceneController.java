package application.scenes;

import javafx.scene.Scene;

public class SceneController {
	
	private PageInt currentPage;
	
	public SceneController() {
		// default to login page
		this.currentPage = new LoginPage();
	}
	
	public Scene getCurrentScene() {
		return this.currentPage.getScene();
	}
	
	public void setCurrentPage(PageInt newPage) {
		this.currentPage = newPage;
	}
	
}
