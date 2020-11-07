package principal;

import gui.MainScreen;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import observerFiles.EventManager;

public class Principal extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		MainScreen mainScreen = new MainScreen();
		Scene primaryScene = new Scene(mainScreen.getRoot(), 1000, 600);
        primaryStage.setScene(primaryScene);
        primaryStage.setTitle("Observer Pattern App");
        primaryStage.show();
	}
	
	@Override
	public void init() throws Exception {
		EventManager eventManager = new EventManager("color", "consola");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
