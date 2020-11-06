package gui;


import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


public class MainScreen {
	private BorderPane root;
	
	public MainScreen() {
		root = new BorderPane();
		root.setTop(new Label("Aplicación implementada con el patrón Observer y AOP"));
	}
	
	public BorderPane getRoot() {
		return root;
	}
}
