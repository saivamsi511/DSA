package hlo;

public class LinkedList {
	public static void main(String[] args) {
		Linked ll = new Linked();
		ll.insertatbegining(10);
		ll.insertatending(100);
		ll.insertatbegining(50);
		ll.deleteatbeg();
		ll.deleteatend();
		ll.insertatbegining(20);
		ll.insertatending(30);
		ll.search(30);
		ll.size();
		ll.getele(1);
		ll.deleteatind(1);
		ll.insertatind(23, 1);
		ll.traverse();
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
	
	void insertatbegining(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	void insertatending(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}
	
	void insertatind(int data,int ind) {
		Node n = new Node(data);
		if (ind == 0) {
			n.next = head;
			head = n;
			return;
		}
		int count = 0;
		Node curr = head;
		while(curr.next != null && count < ind - 1) {
			curr = curr.next;
			count++;
		}
		if(curr == null) {
			System.out.println("Index out of bound");
		}
		n.next = curr.next;
		curr.next = n;
		
	}
	
	void traverse() {
		if(head == null) {
			System.out.println("Linked List is empty");
			return;
		}
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		System.out.print("null");
	}
	
	void deleteatbeg() {
		 head = head.next;
	}
	
	void deleteatend() {
		if(head == null) {
			System.out.println("List is empty");
		}
		
		if(head.next == null) {
			head = null;
		}
		
		Node curr = head;
		while (curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
	}
	
	void deleteatind(int ind) {
		if(head == null) return;
		if (ind == 0) {
			head = head.next;
			return;
		}
		int count = 0;
		Node curr = head;
		while(curr.next != null && count < ind-1) {
			curr = curr.next;
			count++;
		}
		
		if(curr == null || curr.next ==  null) {
			System.out.println("Index out of range");
			return;
		}
		curr.next = curr.next.next;
	}
	
	void search(int key) {
		if(head == null) {
			System.out.println("Linked list is empty");
		}
		Node curr = head;
		
		while(curr != null) {
			if(curr.data == key) {
				System.out.println("found");
				return;
			}
			curr = curr.next;
		}
		System.out.println("not found");
	}
	
	void size() {
		Node curr = head;
		int count = 0;
		while(curr != null) {
			count++;
			curr = curr.next;
		}
		System.out.println(count);
	}
	
	void getele(int ind) {
		Node curr = head;
		int count = -1;
		while(curr != null) {
			count++;
			if(count == ind) {
				System.out.println(curr.data);
				return;
			}
			curr = curr.next;
		}
	}
	
	
}

