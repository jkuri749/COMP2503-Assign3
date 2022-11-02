package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import model.PriorityQueue;

public class PriorityQueueTest<T> {
	
	PriorityQueue<T> queue;
	
	@Test
	@DisplayName("is instantiated with new PriorityQueue")
	void isInstantiatedWithNew() {
		new PriorityQueue<>();
	}
	
	@BeforeEach
	void createNewQueue() {
		queue = new PriorityQueue<T>();
	}
	
	@Test
	@DisplayName("is empty")
	void isEmpty() {
		assertTrue(queue.isEmpty());
	}
}
