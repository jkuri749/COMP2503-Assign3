package view;
import java.util.Scanner;

import model.PriorityQueue;


public class AppMenu {
	PriorityQueue<String> p;
	Scanner input;
	
	public PriorityQueue<String> userInput() {
		int n = 0;
		p = new PriorityQueue<String>();
		System.out.print("How many names do you want to list: ");
		n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("List the names: ");
			String s = input.nextLine();
			p.enqueue(s);
		}
		
		return p;
	}
}
