package observerFiles;
import java.io.File;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import gui.MainScreen;

public class EventManager {
	
	Map<String, List<EventListener>> listeners = new HashMap<>();
	
	public EventManager(String... keys) {
		for (String key : keys) {
			listeners.put(key, new ArrayList<>());
		}
	}
	  
	public void subscribe(String eventType, EventListener listener) {
	        List<EventListener> users = listeners.get(eventType);
	        users.add(listener);
	    }

	public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

	public void notify(String eventType, File file, MainScreen mainScreen) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            //listener.update(eventType, file);
        }
	}
}
