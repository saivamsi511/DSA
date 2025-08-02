package hlo;

public class queue {
public static void main(String[] args) {
	queueimp q = new queueimp(10);
	q.insert(10);
	q.insert(20);
	q.insert(30);
	q.insert(40);
	q.insert(50);
	q.delete();
	System.out.println(q.isempty());
	System.out.println(q.isfull());
	q.peek();
	q.print();
}
}

class queueimp {
	int size;
	int[] arr;
	int front;
	int rear;
	
	public queueimp(int size) {
		this.size= size;
		arr = new int[size];
		front = -1;
		rear = 0;
	}
	
	void insert(int data) {
		if(isfull()) {
			System.out.println("queue is full....");
			return;
		}
		if(isempty()) {
			front = front + 1;
			arr[front] = data;
			rear = front;
			return;
		}
		rear++;
		arr[rear] = data;
	}
	
	void delete() {
		if(isempty()) {
			System.out.println("queue is empty....");
			return;
		}
		arr[front] = 0;
		front++;
		if(front == rear) {
			front = -1;
			rear = 0;
		}
	}
	
	boolean isempty() {
		return (front == -1);
	}
	
	boolean isfull() {
		return (rear == size - 1);
	}
	
	void peek() {
		if(isempty()) {
			System.out.println("queue is empty....");
			return;
		}
		System.out.println("First element is :" + arr[front]);
		return;
	}
	
	void print() {
		if(isempty()) {
			System.out.println("queue is empty....");
			return;
		}
		for(int i=front;i<=rear;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}