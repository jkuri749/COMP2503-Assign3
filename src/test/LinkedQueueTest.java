package test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import model.LinkedQueue;

public class LinkedQueueTest<T> {
	
	LinkedQueue<T> queue;
	
	@Test
	@DisplayName("is instantiated with new LinkedListQueue()")
	void isInstantiatedWithNew() {
		new LinkedQueue<T>();
	}
	
	@BeforeEach
	void createNewQueue() {
		queue = new LinkedQueue<T>();
	}
	
	@Test
	@DisplayName("is empty")
	void isEmpty() {
		assertTrue(queue.isEmpty());
	}
	
	@Test
	@DisplayName("throws NoSuchElementException when enqueued")
	void throwsExceptionWhenEnqueued() {
		assertThrows(NoSuchElementException.class, queue::enqueue);
	}
	
	@Test
	@DisplayName("throws NoSuchElementException when peeked")
	void throwsExceptionWhenPeeked() {
		assertThrows(NoSuchElementException.class, queue::peek);
	}
}