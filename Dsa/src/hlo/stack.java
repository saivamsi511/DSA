package hlo;

public class stack {
public static void main(String[] args) {
	stackimplementation si = new stackimplementation(10);
	System.out.println(si.isempty());
	System.out.println(si.isfull());
	si.push(100);
	si.push(200);
	si.push(300);
	si.push(400);
	si.pop();
	si.peek();
	si.print();
	si.size();
	
}
}

class stackimplementation {
	private int size;
	private int[] arr;
	private int top;
	
	public stackimplementation(int size) {
		this.size = size;
		arr = new int[size];
		top = -1;
	}


	void push(int data) {
		if(top <= size - 1)  {
			top++;
			arr[top] = data;
			return;
		}
		else {
			System.out.println("Stack is full");
		}
	}
	
	void pop() {
		if (top == -1) {
	        System.out.println("Stack is empty");
	        return;
	    }
		System.out.println(arr[top]);
		arr[top] = 0;
		top = top - 1;
	}
	
	void peek() {
		if (top == -1) {
	        System.out.println("Stack is empty");
	        return;
	    }

		System.out.println(arr[top]);
		return;
	}
	
	void size() {
		System.out.println(top + 1);
	}
	
	boolean isempty() {
		return (top == - 1);
	}
	
	boolean isfull() {
		return (top == size - 1);
	}
	
	void print() {
		if (top == -1) {
	        System.out.println("Stack is empty");
	        return;
	    }

		for(int i=0;i<=top;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}