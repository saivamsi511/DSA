package hlo;

public class stackusinglinkedlist {
public static void main(String[] args) {
	Linkedstack ls = new Linkedstack();
	ls.push(10);
	ls.push(20);
	ls.push(30);
	ls.push(40);
	ls.peek();
	ls.pop();
	ls.print();
}
}
class Nodest {
	int data;
	Nodest next;
	
	public Nodest(int data) {
		this.data = data;
		this.next = null;
	}
}

class Linkedstack {
	Nodest head;
	
	public Linkedstack() {
		head = null;
	}
	
	void push(int data) {
		Nodest n = new Nodest(data);
		if(head == null) {
			n.next = null;
			head = n;
		}
		Nodest curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = n;
		n.next = null;
	}
	
	void pop() {
		if(head == null) {
			System.out.println("stack is empty");
		}
		Nodest curr = head;
		while(curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
	}
	
	void print() {
		if(head == null) {
			System.out.println("stack is empty");
		}
		Nodest curr = head;
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	boolean isempty() {
		return (head == null);
	}
	
	void peek() {
		if(head == null) {
			System.out.println("stack is empty");
		}
		Nodest curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		System.out.println(curr.data);
	}
	
	
}