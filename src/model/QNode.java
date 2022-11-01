package model;


public class QNode<T> implements Comparable<QNode<T>> {
	
	private T data;
	private QNode<T> next;
	private QNode<T> prev;
	
	public QNode() {
		data=null;
	}
	
	public QNode(T data) {
		this.data=data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T value) {
		data=value;
	}
	
	public void setNext(QNode<T> other) {
		next=other;
	}
	
	public QNode<T> getNext(){
		return next;
	}

	/**
	 * @return the prev
	 */
	public QNode<T> getPrev() {
		return prev;
	}

	/**
	 * @param prev the prev to set
	 */
	public void setPrev(QNode<T> prev) {
		this.prev = prev;
	}
	
	@Override
	public int compareTo(QNode<T> o) {
		int result = 0;
		
		result = this.data.toString().compareTo(o.getData().toString());
		
		return result;
	}

}
