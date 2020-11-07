package aspectos;

import gui.MainScreen;

public aspect ColorAspect {
	
	
	
	pointcut color(MainScreen mainScreen): call(public void notify(MainScreen)) && args(mainScreen);
	
	
}
