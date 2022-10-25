package model;

public interface QueueInterface<T> {
	void enqueue(T t); 		//add an item t in the queue
	T dequeue (); 		//returns the front elements and removes it from the queue.
	T peek(); 		//that returns the element from the front without removing.
	int getSize(); 		//returns the size of the queue.
	boolean isEmpty(); 		//returns true if the queue is empty otherwise returns false.
	void printQueue(); 		//prints the content of the queue.
}
