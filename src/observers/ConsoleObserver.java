package observers;

import gui.MainScreen;

public class ConsoleObserver implements Observer{
	
	@Override
	public void proceed(String color, MainScreen mainscreen) {
		System.out.println("Color de fondo: " +color);
	}
	
}
