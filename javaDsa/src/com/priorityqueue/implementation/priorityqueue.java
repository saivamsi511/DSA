package com.priorityqueue.implementation;

public class priorityqueue {
public static void main(String[] args) {
	priority_queue_using_linkedlist p = new priority_queue_using_linkedlist();
	p.insert(10, 0);
	p.insert(20, 1);
	p.insert(40, 0);
	p.insert(30, 2);
	p.delete();
	p.getfirst();
	p.getlast();
	p.print();
}
}
class node {
	int data;
	int priority;
	node next;
	
	node(int data, int priority) {
		this.data = data;
		this.priority = priority;
		this.next = null;
	}
}

class priority_queue_using_linkedlist {
	node head;
	
	priority_queue_using_linkedlist() {
		this.head = null;
	}
	
	void insert(int data, int priority) {
		node n = new node(data, priority);
		if(head == null || priority < head.priority) {
			n.next = head;
			head = n;
		}
		else {
			node curr = head;
			while (curr.next != null && curr.next.priority <= priority) {
				curr = curr.next;
			}
			n.next = curr.next;
			curr.next = n;
		}
	}
	
	void delete() {
		if (head == null) {
			System.out.println("Queue is empty.");
			return;
		}
		head = head.next;
	}
	
	void getfirst() {
		if (head == null) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.println(head.data);
	}
	
	void getlast() {
		if (head == null) {
			System.out.println("Queue is empty.");
			return;
		}
		node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		System.out.println(curr.data);
	}
	
	void print() {
		node curr = head;
		while(curr != null) {
			System.out.print(curr.data +  " ");
			curr = curr.next;
		}
		System.out.println();
	}
}