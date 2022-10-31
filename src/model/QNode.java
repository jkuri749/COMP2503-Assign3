package model;


public class QNode<T> implements Comparable<QNode<T>> {
	
	private T data;
	private QNode<T> next;
	
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

	@Override
	public int compareTo(QNode<T> o) {
		int result = 0;
		
//		if (o.getData() > getData()) {
//			result = -1;
//		}
//		else if (this.empNo > o.getEmpNo()) {
//			result = 1;
//		}
//		else {
//			return 0;
//		}
		return result;
	}

}
