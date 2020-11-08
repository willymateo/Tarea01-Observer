package aspectos;

import java.util.ArrayList;
import java.util.HashMap;
import gui.MainScreen;
import observers.Observer;

public aspect ObserversManager {
	
	private HashMap<String, ArrayList<Observer>> MainScreen.observers = new HashMap<>();
	
	public static void subscribe(MainScreen mainScreen, String key, Observer observer) {
		mainScreen.observers.get(key).add(observer);
	}
	
	public static void remove(MainScreen mainScreen, String key, Observer observer) {
		mainScreen.observers.get(key).remove(observer);
	}
	
	public static void reportToObservers(MainScreen mainScreen, String color, Observer observer) {
	 	observer.proceed(color, mainScreen);
	}
	
	pointcut clicButtons() : call(void setOnMouseClicked(..)) && within(MainScreen);
	
	after(): clicButtons(){
	}
	
}
