package view;
import java.util.Scanner;

import model.LinkedQueue;
import model.PriorityQueue;


public class AppMenu {
	PriorityQueue<String> p;
	LinkedQueue<String> l;
	Scanner input;
	
	/**
	 * constructor initializes the Scanner
	 */
	public AppMenu() {
		input = new Scanner(System.in);
	}
	
	public int userInput() {

		System.out.print("How many names do you want to list: ");
		if (!input.hasNextInt()) {
			System.out.println();
		}
		int n = input.nextInt();
		return n;
	}
	
	/**
	 * loops through names and puts them in priority queue
	 * @param n
	 * @return l
	 */
	public LinkedQueue<String> promptL(int n) {
			
		l = new LinkedQueue<String>();	
		
		for (int i = 0; i < n; i++) {
			System.out.println("List the names: ");
			String s = input.next();
			l.enqueue(s);
		}
		
		return l;
	}
	
	/**
	 * loops through names and puts them in priority queue
	 * @param n
	 * @return p
	 */
	public PriorityQueue<String> promptNames(int n) {
		
		p = new PriorityQueue<String>();	
		
		for (int i = 0; i < n; i++) {
			System.out.println("List the names: ");
			String s = input.next();
			p.enqueue(s);
		}
		
		return p;
	}
}
