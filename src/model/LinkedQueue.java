package model;

import java.util.NoSuchElementException;

public class LinkedQueue<T> implements QueueInterface<T> {
	
	private int size;
	private QNode<T> front;
	private QNode<T> rear;
	
	public LinkedQueue() {
		size = 0;
		front = null;
		rear = null;
	}

	@Override
	public void enqueue(T t) {
		
		QNode<T> newNode = new QNode<T> (t);
		
		if(isEmpty()){
			front = rear = newNode;
		}
		else rear = newNode;
		
		rear.setData(t);
		++size;
	}

	@Override
	public T dequeue() {
		if (isEmpty()) throw new NoSuchElementException(); {
		}
		T x = front.getData();
		front = front.getNext();
		size--;
		return x;
	}

	@Override
	public T peek() {
		if (isEmpty()) throw new NoSuchElementException(); {
		}
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
		if (isEmpty()) {
			System.out.println("queue is empty");
			return;
		}
		while (front != null) {
			System.out.println(front.getData() + " ");
            front = front.getNext();
		}
	}
}
