package hlo;

public class circularLinkedlist {
public static void main(String[] args) {
	circularlinked cl = new circularlinked();
	cl.addfirst(100);
	cl.addfirst(200);
	cl.addlast(10);
	cl.addlast(20);
//	cl.deleteatstart();
	cl.deleteatend();
	cl.search(200);
	cl.get(1);
	cl.addatind(300, 3);
	cl.deleteatind(3);
	cl.print();
}
}
class Nodecircular {
	int data;
	Nodecircular next;
	
	Nodecircular(int data) {
		this.data = data;
		this.next = null;
	}
}

class circularlinked {
	Nodecircular head;
	Nodecircular tail;
	
	circularlinked() {
		this.head = null;
		this.tail = null;
	}
	
	void addfirst(int data) {
		Nodecircular n = new Nodecircular(data);
		if(head == null) {
			head = n;
			tail = n;
			n.next = head;
		}
		else {
			n.next = head;
			head = n;
			tail.next = head;
		}
	}
	
	void addlast(int data) {
		Nodecircular n = new Nodecircular(data);
		if(head == null) {
			addfirst(data);
			return;
		}
		tail.next = n;
		n.next = head;
		tail = n;
	}
	
	void addatind(int data,int ind) {
		Nodecircular n = new Nodecircular(data);
		int count = 0;
		Nodecircular curr = head;
		if(ind == 0) {
			addfirst(data);
			return;
		}
		do {
			if(count == ind - 1) {
				break;
			}
			curr = curr.next;
			count++;
		}while(curr.next != head);
		
		n.next = curr.next;
		curr.next = n;
	}
	
	void deleteatstart() {
		if(head == null) {
			System.out.println("Empty linked list...");
		}
		head = head.next;
		tail.next = head;
	}
	
	void deleteatend() {
		if(head == null) {
			System.out.println("Empty linked list...");
		}
		Nodecircular curr = head;
		while(curr.next.next != head) {
			curr = curr.next;
		}
		curr.next = head;
		tail = curr;
//		System.out.println(curr.data);
	}
	
	void deleteatind(int ind) {
		int count = 0;
		Nodecircular curr = head;
		if(ind == 0) {
			deleteatstart();
			return;
		}
		do {
			if(count == ind - 1) {
				break;
			}
			curr = curr.next;
			count++;
		} while(curr.next != head);
		
		curr.next = curr.next.next;
	}
	
	void search(int data) {
		Nodecircular curr = head;
		while(curr.next != head) {
			if(curr.data == data) {
				System.out.println("found");
				return;
			}
			curr = curr.next;
		}
		System.out.println("Not found");
	}
	
	void get(int ind) {
		Nodecircular curr = head;
		if(ind == 0) {
			System.out.println(head.data);
			return;
		}
		int count = 0;
		do{
			if(count == ind) {
				System.out.println(curr.data);
				return;
			}
			curr = curr.next;
			count++;
		} while(curr.next != head);
		System.out.println(curr.data);
	}
	
	
	void print() {
		Nodecircular curr = head; // try without head use tail and implement
		do{
			System.out.print(curr.data + " ");
			curr = curr.next;
		}while(curr != head);
		System.out.println();
	}
}
