package model;

public class PriorityQueue<T> implements QueueInterface<T>{
	private int size;
	private QNode<T> front;
	private QNode<T> rear;
	@Override
	public void enqueue(T t) {
		
//		QNode<T> newNode = new QNode<T>(t);  
//		   
//	    //if list is empty, head and tail points to newNode  
//	    if(isEmpty()) {  
//	    	front = rear = newNode;  
//	            //start's previous will be null  
//	    	front.setPrev(null);  
//	            //end's next will be null  
//	    	rear.setNext(null);  
//	    }  
//	    else {  
//	            //add newNode to the end of list. end->next set to newNode  
//	        rear.setNext(newNode);  
//	            //newNode->previous set to end  
//	        newNode.setPrev(rear);  
//	            //newNode becomes end 
//	        rear = newNode;  
//	            //end's next point to null  
//	        rear.setNext(null);  
//	    }  
	}
	@Override
	public T dequeue() {
		return null;
	}
	@Override
	public T peek() {
		return null;
	}
	@Override
	public int getSize() {
		return 0;
	}
	@Override
	public boolean isEmpty() {
		return false;
	}
	@Override
	public void printQueue() {
		
	}
}
