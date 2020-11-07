package gui;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class MainScreen {
	private BorderPane root;
	private Button btn_Color1, btn_Color2, btn_Color3;
	
	public MainScreen() {
		root = new BorderPane();
		createView();
	}
	
	public BorderPane getRoot() {
		return root;
	}
	
	private void createView() {
		//Titulo
		HBox hB_Titulo = new HBox(new Label("Aplicación implementada con el patrón Observer y AOP"));
		
		//Botones
		btn_Color1 = new Button("Verde");
		btn_Color2 = new Button("Aqua");
		btn_Color3 = new Button("Naranja");
		VBox vB_botones = new VBox(btn_Color1, btn_Color2, btn_Color3);
		
		//Estilos
		hB_Titulo.setAlignment(Pos.CENTER);
		vB_botones.setSpacing(10);
		vB_botones.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(10));
		
		//Asignación
		root.setTop(hB_Titulo);
		root.setCenter(vB_botones);
	}
	
}
