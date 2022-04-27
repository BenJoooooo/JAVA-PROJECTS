// Java program to implement a queue using an array
class Queue {
	
	private static int front, rear, capacity;
	private static int queue[];
	
	Queue(int c) {
		front = rear = 0;
		capacity = c;
		queue = new int[capacity];
	}
	
	// Function to insert an elements
	// at the rear of the queue
	
	static void queueEnqueue(int data) {
		// Check queue is full or not
		if (capacity == rear) {
			System.out.printf("\nQueue us full\n");
			return;
		}
		
		// Insert element at the rear
		else {
			System.out.println(data + "Inserted to Queue: ");
			queue[rear] = data;
			rear++;
		}
		return;
	}
	
	// Function to delete an elements
	// from the front of the queue
	
	static void queueDequeue() {
		// If queue is empty
		if (front == rear) {
			System.out.printf("\nQueue is empty\n");
			return;
		}
		
		// Shift all the elements from index 2 till rear
		// to the right by one
		else {
			for (int i = 0; i < rear - 1; i++) {
				queue[i] = queue [i+1];
			}
			
			// Store 0 at rear indicating there's no element
			System.out.println(queue[front] + " removed");
			if (rear < capacity)
				queue[rear] = 0;
			
			// decrement rear
			rear--;
		}
		return;
	}
	
	// Print queue elements
	static void queueDisplay() {
		int i;
		if (front == rear) {
			System.out.printf("\nQueue is Empty\n");
			return;
		}
		
		// Traverse front to rear and print elements
		for (i = front; i < rear; i++) {
			System.out.printf("%d <--", queue[i]);
		}
		return;
	}
	
	// Print front of queue
	static void queueFront() {
		if (front == rear) {
			System.out.printf("\nQueue is Empty\n");
			return;
		}
		System.out.printf("\nFront Element is: %d", queue[front]);
		return;
	}
}

public class StaticQueueinjava {

	public static void main(String[] args) {
		// Create a queue of capacity 4
		Queue q = new Queue (4);
		
		// Print Queue elements
		q.queueDisplay();
		
		// Inserting elements in the queue
		q.queueEnqueue(20);
		q.queueEnqueue(30);
		q.queueEnqueue(40);
		q.queueEnqueue(50);
		
		// Print Queue elements
		q.queueDisplay();
		
		// Insert element in the queue
		q.queueEnqueue(60);
		
		// Print Queue elements
		q.queueDisplay();
		q.queueDequeue();
		q.queueDequeue();
		System.out.printf("\n\nafter two node deletion\n\n");
		
		// Print Queue elements
		q.queueDisplay();
		
		//print front of the queue
		q.queueFront();
	}
}
