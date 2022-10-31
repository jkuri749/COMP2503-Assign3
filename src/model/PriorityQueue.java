package model;

public class PriorityQueue<T> implements QueueInterface<T>{
	private int size;
	private QNode<T> front;
	private QNode<T> rear;
	
	private PriorityQueue() {
		size = 0;
		front = null;
		rear = null;
	}
	
	@Override
	public void enqueue(T t) {	
		QNode<T> newNode = new QNode<T>(t);  
		++size;
		if (isEmpty()) {
			front = newNode; 
			
			front.setNext(null);
		}
		if (front.compareTo(newNode) > 0) {
			front = new QNode<T>(t); 
			front = front.getNext();
		}
		else if ((int) t > (int)front.getNext().getData()) {
			
		}
		if ((int) t > (int)rear.getData()) {
			
		}
	}
	
	@Override
	public T dequeue() {
		if (isEmpty()) { 
			throw new RuntimeException(); 
		}
		T x = front.getData();
		front = front.getNext();
		size--;
		return x;
	}
	
	@Override
	public T peek() {
		if (isEmpty()) throw new RuntimeException();
		return front.getData();
	}
	
	@Override
	public int getSize() {
		return size;
	}
	@Override
	public boolean isEmpty() {
		return (size == 0);
	}
	
	@Override
	public void printQueue() {
		//Node current will point to head  
        QNode<T> last = null; 
        if(front == null) {  
            System.out.println("queue is empty");  
            return;  
        }  
        System.out.println("items: "); 
        
        while(front != null) {  
            //Print each node and then go to next.  
            System.out.println(front.getData() + " ");  
            last = front;
            front = front.getNext();
        }  
	}
}
