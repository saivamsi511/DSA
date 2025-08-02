package com.priorityqueue.implementation;

public class priorityqueuedouble {
public static void main(String[] args) {
	doublelinkedqueue d = new doublelinkedqueue();
	d.insert(10, 0);
	d.insert(20, 1);
	d.insert(30, 0);
	d.insert(40, 1);
	d.delete();
	d.getfirst();
	d.getlast();
	d.print();
}
}
class noded {
	int data;
	int priority;
	noded prev;
	noded next;
	
	noded(int data, int priority) {
		this.data = data;
		this.priority = priority;
		this.prev = null;
		this.next = null;
	}
}

class doublelinkedqueue {
	noded head;
	noded tail;
	
	doublelinkedqueue() {
		this.head = null;
		this.tail = null;
	}
	
	void insert(int data, int priority) {
		noded n = new noded(data,priority);
		if (head == null) {
            head = tail = n;
        } else if (priority < head.priority) {
            n.next = head;
            head.prev = n;
            head = n;
        } 
		else {
			noded curr = head;
			while(curr.next != null && curr.next.priority <= priority) {
				curr = curr.next;
			}
			n.next = curr.next;
			n.prev = curr;
			if (curr.next != null) {
                curr.next.prev = n;
            } else {
                tail = n; 
            }

            curr.next = n;
		}
	}
	
	void print() {
		if(head == null) {
			System.out.println("Queue is empty..");
			return;
		}
		noded curr = head;
		while(curr != null) {
			System.out.print(curr.data +" ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	void getfirst() {
		if(head == null) {
			System.out.println("Queue is empty..");
			return;
		}
		System.out.println(head.data);
	}
	
	
	void getlast() {
		if(head == null) {
			System.out.println("Queue is empty..");
			return;
		}
		System.out.println(tail.data);
	}
	
	void delete() {
		if(head == null) {
			System.out.println("Queue is empty..");
			return;
		}
		head.next.prev = null;
		head = head.next;
	}
}