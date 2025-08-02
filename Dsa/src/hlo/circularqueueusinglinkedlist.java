package hlo;

//dynamic size O(1)
public class circularqueueusinglinkedlist {
public static void main(String[] args) {
	circularqueuelinked cqq = new circularqueuelinked();
	cqq.insert(10);
	cqq.insert(20);
	cqq.insert(30);
	cqq.insert(40);
	cqq.insert(50);
	cqq.insert(60);
	cqq.delete();
	cqq.insert(10);
	cqq.getfirst();
	cqq.getlast();
	cqq.getsize();
	cqq.print();
}
}
class nodecircular1 {
	int data;
	nodecircular1 next;
	
	nodecircular1(int data) {
		this.data = data;
		this.next = null;
	}
}

class circularqueuelinked {
	nodecircular1 head;
	nodecircular1 tail;
	
	circularqueuelinked() {
		this.head = null;
		this.tail = null;
	}
	
	void insert(int data) {
		nodecircular1 n = new nodecircular1(data);
		if(head == null) {
			head = n;
			n.next = null;
			tail = n;
			return;
		}
		tail.next = n;
		n.next = head;
		tail = n;
	}
	
	void delete() {
		if(head == null) {
			System.out.println("queue is empty....");
			return;
		}
		head = head.next;
		tail.next = head;
	}
	
	void getsize() {
		int count = 0;
		nodecircular1 curr = head;
		do {
			count++;
			curr = curr.next;
		}while(curr != tail.next);
		System.out.println(count);
	}
	
	void getfirst() {
		if(head == null) {
			System.out.println("queue is empty....");
			return;
		}
		System.out.println(head.data);
	}
	
	void getlast() {
		if(head == null) {
			System.out.println("queue is empty....");
			return;
		}
		System.out.println(tail.data);
	}
	
	void print() {
		nodecircular1 curr = head;
		do{
			System.out.print(curr.data + " ");
			curr = curr.next;
		}while(curr != tail.next);
		System.out.println();
	}
}
