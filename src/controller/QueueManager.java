package controller;


import model.LinkedQueue;
import model.PriorityQueue;
import view.AppMenu;

public class QueueManager {
	PriorityQueue<String> pq;
	LinkedQueue<String> lq;
	AppMenu appmen;
	
	/**
	 * Constructor that handles, instantiates, and calls all the methods and classes
	 */
	public QueueManager() {
		 pq = new PriorityQueue<String>();
		 lq = new LinkedQueue<String>();
		 appmen = new AppMenu();
		 launchApplication();
	}
	
	/**
	 * launches the program and controls for the different methods
	 */
	private void launchApplication() {
		
		linkedQueue();
		priortyQueue();
		
		for(int i=0; i<2; i++) {
            String p;
            String l;
            p = pq.dequeue();
            l = lq.dequeue();
            System.out.println("Removed Priority List: " + p);
            System.out.println("Removed Reg List: " + l);
        }
	}

	private void linkedQueue() {
		int n;
		n = appmen.userInput();	
		lq = appmen.promptL(n);
		lq.printQueue();
	}

	private void priortyQueue() {
		int n;
		n = appmen.userInput();	
		pq = appmen.promptNames(n);
		pq.printQueue();
	}
}
