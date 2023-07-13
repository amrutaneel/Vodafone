package com;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	ll.add(10);
	ll.add(20);
	ll.add(30);
	ll.add(40);
	System.out.println(ll);
	ll.add(1, 100);
	System.out.println(ll);
	ll.addFirst(11);
	ll.addLast(22);
	System.out.println(ll);
		System.out.println(" using index "+ll.get(1));
	System.out.println("First element "+ll.getFirst());
	System.out.println("last element "+ll.getLast());
	System.out.println(ll);
	ll.removeFirst();
	ll.removeLast();
	System.out.println(ll);
	}

}
