package observers;

import gui.MainScreen;

public class ColorObserver implements Observer{

	@Override
	public void proceed(String color, MainScreen mainscreen) {
		mainscreen.getRoot().setStyle("-fx-background-color:" +color);
	}
	
}
