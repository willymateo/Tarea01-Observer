package aspectos;

import java.util.ArrayList;
import java.util.List;
import gui.MainScreen;
import javafx.scene.control.Button;
import observers.Observer;

public aspect ObserversManager {
	
	private List<Observer> MainScreen.observers = new ArrayList<>();
	
	public static void subscribe(MainScreen mainScreen, Observer observer) {
		mainScreen.observers.add(observer);
	}
	
	public static void remove(MainScreen mainScreen, Observer observer) {
		mainScreen.observers.remove(observer);
	}
	
	public static void reportToObservers(MainScreen mainScreen, Observer observer) {
	 	
	}
	
	
	pointcut changes() : call(void setOnMouseClicked(..)) && target(Button) && within(MainScreen);
		
	
	after(): changes(){
		
	}
	
	
}
