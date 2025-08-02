package hlo;

//fixed size O(1)
public class circularqueueusingarray {
public static void main(String[] args) {
	circularqueue cq = new circularqueue(5);
	cq.insert(10);
	cq.insert(20);
	cq.insert(30);
	cq.insert(40);
	cq.insert(50);
	cq.delete();
	cq.insert(60);
	cq.getfirst();
	cq.getrear();
	cq.print();
}
}
class circularqueue {
	int size;
	int[] arr;
	int currsize;
	int front,rear;
	
	circularqueue(int size) {
		this.size = size;
		arr = new int[size];
		currsize = 0;
		front = 0;
		rear = -1;
	}
	
	void insert(int data) {
		if(currsize  == size) {
			System.out.println("queue is full....");
			return;
		}
		rear = (rear + 1) % size;
		arr[rear] = data;
		currsize++;
	}
	
	void delete() {
		if(currsize == 0) {
			System.out.println("queue is empty....");
			return;
		}
		arr[front] = 0;
		front = (front + 1 ) % size;
		currsize--;
	}
	
	void getfirst() {
		if(currsize == 0) {
			System.out.println("queue is empty....");
			return;
		}
		System.out.println(arr[front]);
	}
	
	void getrear() {
		if(currsize == 0) {
			System.out.println("queue is empty....");
			return;
		}
		System.out.println(arr[rear]);
	}
	
	void print() {
		if(currsize == 0) {
			System.out.println("queue is empty....");
			return;
		}
		
		for(int i=0;i<size;i++) {
			System.out.print(arr[(front + i) % size] + " ");
		}
		System.out.println();
	}
}
