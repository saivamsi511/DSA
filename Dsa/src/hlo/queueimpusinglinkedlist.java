package hlo;

public class queueimpusinglinkedlist {
public static void main(String[] args) {
	Linkedqueue lq =new Linkedqueue();
	lq.push(10);
	lq.push(20);
	lq.push(30);
	lq.push(40);
	lq.push(50);
	lq.peek();
	lq.pop();
	lq.print();
}
}
class Nodequ {
	int data;
	Nodequ next;
	
	public Nodequ(int data) {
		this.data = data;
		this.next = null;
	}
}

class Linkedqueue {
	Nodequ head;
	
	public Linkedqueue() {
		head = null;
	}
	
	void push(int data) {
		Nodequ n = new Nodequ(data);
		if(head == null) {
			n.next = null;
			head = n;
			return;
		}
		n.next = head;
		head = n;
	}
	
	void pop() {
		if(head == null) {
			System.out.println("stack is empty");
		}
		head = head.next;
	}
	
	void print() {
		if(head == null) {
			System.out.println("stack is empty");
		}
		Nodequ curr = head;
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
		System.out.println(head.data);
	}
	
	
}