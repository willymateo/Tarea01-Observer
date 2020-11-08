package principal;

import gui.MainScreen;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application{
	public static MainScreen mainScreen;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene primaryScene = new Scene(mainScreen.getRoot(), 1000, 600);
        primaryStage.setScene(primaryScene);
        primaryStage.setTitle("Observer Pattern App");
        primaryStage.show();
	}
	
	@Override
	public void init() throws Exception {
		mainScreen = new MainScreen(); 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
