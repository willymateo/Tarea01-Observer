package aspectos;

import gui.MainScreen;
import javafx.scene.paint.Color;
import principal.Principal;

public aspect ColorAspect {

	pointcut colorEvent(String color) : call(void proceed(String)) && args(color) && within(MainScreen);
	
	after(String color) : colorEvent(color){
		if (color.equals("green")) {
			Principal.mainScreen.getTitulo().setTextFill(Color.GREEN);
		}else if (color.equals("aqua")) {
			Principal.mainScreen.getTitulo().setTextFill(Color.AQUA);
		}else if (color.equals("orange")) {
			Principal.mainScreen.getTitulo().setTextFill(Color.ORANGE);
		}
		
		Principal.mainScreen.getRoot().setStyle("-fx-background-color:" +color);
		System.out.println("El color de fondo es: " +color);
	}
	
}
