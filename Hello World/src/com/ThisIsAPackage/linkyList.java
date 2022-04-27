package com.ThisIsAPackage;

//Java program for linked-list implementation of queue 

//A linked list (LL) node to store a queue entry 
class QNode { 
 int key; 
 QNode next; 

 // constructor to create a new linked list node 
 public QNode(int key) 
 { 
     this.key = key; 
     this.next = null; 
 } 
} 

//A class to represent a queue 
//The queue, front stores the front node of LL and rear stores the 
//last node of LL 
class Queue { 
 QNode front, rear; 

 public Queue() { 
     this.front = this.rear = null; 
 } 

 // Method to add an key to the queue. 
 void enqueue(int key) 
 { 

     // Create a new LL node 
     QNode temp = new QNode(key); 

     // If queue is empty, then new node is front and rear both 
     if (this.rear == null) { 
         this.front = this.rear = temp; 
         return; 
     } 

     // Add the new node at the end of queue and change rear 
     this.rear.next = temp; 
     this.rear = temp;
     System.out.println("Front = " + front.key);
     System.out.println("rear = " + rear.key);
 } 

 // Method to remove an key from queue. 
 void dequeue() 
 { 
     // If queue is empty, return NULL. 
     if (this.front == null) 
         return; 
  // Store previous front and move front one node ahead 
     QNode temp = this.front; 
     this.front = this.front.next; 
     
     if(this.front != null) {
    	 System.out.println("front = " + front.key);
    	 System.out.println("rear = " + rear.key);
     } 
     else {
    	 System.out.println("queue is now empty");
     }

     // If front becomes NULL, then change rear also as NULL 
     if (this.front == null) 
         this.rear = null; 
 } 
} 

//Driver class 
public class linkyList { 
 public static void main(String[] args) 
 { 
     Queue q = new Queue(); 
     System.out.println("enqueue");
     q.enqueue(10);
     System.out.println("enqueue");
     q.enqueue(20);
     System.out.println("\ndequeue");
     q.dequeue(); 
     System.out.println("\ndequeue");
     q.dequeue(); 
     System.out.println("enqueue");
     q.enqueue(30); 
     System.out.println("enqueue");
     q.enqueue(40); 
     System.out.println("enqueue");
     q.enqueue(50); 
     System.out.println("\ndequeue");
     q.dequeue(); 
     System.out.println("Queue Front : " + q.front.key); 
     System.out.println("Queue Rear : " + q.rear.key); 
 } 
}
