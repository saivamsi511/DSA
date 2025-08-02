package hlo;

public class circularqueuusingdoublylinkedlist {
public static void main(String[] args) {
	douLinkedcircularqueue dc = new douLinkedcircularqueue();
	dc.insert(10);
	dc.insert(20);
	dc.insert(30);
	dc.insert(40);
	dc.insert(50);
	dc.delete();
	dc.delete();
	dc.getfirst();
	dc.getlast();
	dc.print();
}
}

class Nodecirqueue {
	int data;
	Nodecirqueue next;
	Nodecirqueue prev;
	
	Nodecirqueue(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

class douLinkedcircularqueue {
	Nodecirqueue head;
	Nodecirqueue tail;
	
	douLinkedcircularqueue() {
		this.head = null;
		this.tail = null;
	}
	
	void insert(int data) {
		Nodecirqueue n = new Nodecirqueue(data);
		if(head == null) {
			head = n;
			n.next = head;
			tail = n;
			return;
		}
		tail.next = n;
		n.prev = tail;
		n.next = head;
		tail = n;
	}
	
	void delete() {
		if(head == null) {
			System.out.println("Queue is empty");
			return;
		}
		head = head.next;
		tail.next = head;
	}
	
	void getfirst() {
		if(head == null) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.println(head.data);
	}
	
	void getlast() {
		if(head == null) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.println(tail.data);
	}
	
	void print() {
		Nodecirqueue curr = head;
		do{
			System.out.print(curr.data + " ");
			curr = curr.next;
		} while(curr != head);
		System.out.println();
	}
}
