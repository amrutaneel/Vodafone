package com;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
	Queue q1 = new LinkedList();	// type LinkedlistQueue 
	Queue q2 = new PriorityQueue();  // type priority queue 
	q1.add(3); q1.add(1);q1.add(4);q1.add(5); q1.add(4); q1.add(1); // FIFO
	q2.add(3); q2.add(1);q2.add(4);q2.add(5); q2.add(4); q2.add(1);//FIFO using priority 
	System.out.println(q1);		// maintain the order 
	System.out.println(q2);		// unorder but first element with lower priority ready to come out 
	System.out.println(q1.poll());  // first element from queue remove 
	System.out.println(q2.poll());  // first element with lower priority remove 
	System.out.println(q1);  // maintain the order 
	System.out.println(q2); // unorder with first element with lower priority ready to come out 
	System.out.println(q1.poll());  // first element from queue remove 
	System.out.println(q2.poll());  // first element with lower priority remove 
	System.out.println(q1);  // maintain the order 
	System.out.println(q2); // unorder with first element with lower priority ready to come out 
	}

}
