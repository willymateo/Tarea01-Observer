package gui;


import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


public class MainScreen {
	private BorderPane root;
	
	public MainScreen() {
		root = new BorderPane();
		root.setTop(new Label("Aplicaci�n implementada con el patr�n Observer y AOP"));
	}
	
	public BorderPane getRoot() {
		return root;
	}
}
