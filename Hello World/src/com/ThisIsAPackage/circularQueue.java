package com.ThisIsAPackage;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class circularQueue {
	static int size, front = 0, rear = 0;
	private static int queue[];
	
	static Scanner in = new Scanner (System.in);
	static int options, value;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of a qeueue: ");
		size = in.nextInt();
		
		while (true) {
			System.out.println("\nMenu");
			System.out.println("1. Enqueue \n2. Dequeue \n3. Display \n4. Exit");
			System.out.println("Enter choices from 1-4");
			options = in.nextInt();
			
			if (options == 1) {
				Enqueue(value);
			}
			else if (options == 2) {
				Dequeue(value);
			}
			else if (options == 3) {
				Display();
			}
			else {
				System.out.println("Programmer Name: Ben Joshua B. SOlanor");
				System.out.println("Section: 2BSIS1");
				break;
			}
		}
	}
	public static void Enqueue (int value) {
		if (front == rear +1)
			System.out.println("Queue overflow");
	else {
		if (rear == size-1 && front !=0 )
			rear= -1;
		System.out.println("Enter a number: ");
		value = in.nextInt();
		System.out.println("Queue: " + value);
		System.out.println("Front: " + front + "\nRear: " + rear);
		}	
	}
	public static void Dequeue (int value) {
		Deque<String> deque = new LinkedList();
		deque.addFirst("20");
		deque.add("3");
		deque.add("13");
		deque.add("30");
		deque.add("12");
		deque.add("13");
		deque.add("15");
		if (front == -1) {
			System.out.printf("\nQueue underflow\n");
			return;
		}
		else {
			System.out.println("Queue: " + deque);
			System.out.println("After removing front " + deque.removeFirst());
			System.out.println("Front: " + "1" + "\t" + deque.getFirst()
			+ "\nRear: " + "2" + "\t\t" + deque.getLast());
			System.out.println(" ");
		}
	}
	public static void Display() {
		Deque <String> deque = new LinkedList();
		deque.addFirst("10");
		deque.add("2");
		deque.add("3");
		deque.add("13");
		deque.add("30");
		deque.add("12");
		System.out.println("Queue " + deque);
		System.out.println("Front" + front + "\nRear" + "5");
	}
}






























