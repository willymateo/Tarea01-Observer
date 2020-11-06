package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		MainScreen mainScreen = new MainScreen();
		Scene primaryScene = new Scene(mainScreen.getRoot(), 1000, 600);
        primaryStage.setScene(primaryScene);
        primaryStage.setTitle("Observer Pattern App");
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
