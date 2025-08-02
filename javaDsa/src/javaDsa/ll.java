package javaDsa;

public class ll {
public static void main(String[] args) {
	Linked l = new Linked();
	l.insertatstarting(100);
	l.insertatending(20);
	l.insertatindex(30, 1);
	l.insertatending(50);
	l.deleteatstarting();
	l.deleteatending();
	l.deleteatind(1);
	l.insertatending(20);
	l.get(1);
	l.traverse();
}
}

class Node {
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}


class Linked {
	Node head;
	
	public Linked() {
		head = null;
	}
	
	void insertatstarting(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	
	void insertatending(int data) {
		Node n = new Node(data);
		if(head == null) {
			insertatstarting(data);
			return;
		}
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = n;
	}
	
	void insertatindex(int data,int ind) {
		Node n = new Node(data);
		if(head == null) {
			insertatstarting(data);
			return;
		}
		int count = 0;
		Node curr = head;
		while(curr.next != null && count < ind - 1) {
			curr = curr.next;
			count++;
		}
		if(curr.next == null) {
			System.out.println("Index out of range");
			return;
		}
		n.next = curr.next;
		curr.next = n;
		}
	
	void deleteatstarting() {
		head = head.next;
	}
	
	void deleteatending() {
		Node curr = head;
		while(curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
	}
	
	void deleteatind(int ind) {
		if (ind == 0) {
			deleteatstarting();
			return;
		}
		Node curr = head;
		int count = 0;
		while(curr.next != null && count < ind-1) {
			curr = curr.next;
			count++;
		}
		curr.next = curr.next.next;
	}
	
	void traverse() {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data + " - > ");
			curr = curr.next;
		}
		System.out.println("null");
	}
	
	void get(int ind) {
		if(ind == 0) {
			System.out.println(head.data);
			return;
		}
		int count = 0;
		Node curr = head;
		while(curr.next != null && count < ind) {
			curr = curr.next;
			count++;
		}
		System.out.println(curr.data);
		return;
	}
}