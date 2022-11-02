package controller;

import model.PriorityQueue;
import view.AppMenu;

public class QueueManager {
	PriorityQueue<String> pq;
//	LinkedQueue<String> lq;
	AppMenu appmen;
	
	/**
	 * Constructor that handles, instantiates, and calls all the methods and classes
	 */
	public QueueManager() {
		 pq = new PriorityQueue<String>();
		 appmen = new AppMenu();
		 launchApplication();
	}
	
	/**
	 * launches the program and controls for the different options
	 */
	private void launchApplication() {
		pq = appmen.userInput();
		
	}
}
