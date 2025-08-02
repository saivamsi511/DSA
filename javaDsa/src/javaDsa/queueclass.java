package javaDsa;

public class queueclass {
	public static void main(String[] args) {
		queueimp qu = new queueimp(5);
		qu.insert(10);
		qu.insert(20);
		qu.insert(30);
		qu.insert(40);
		qu.insert(50);
//		qu.insert(60);
		qu.display();
//		qu.delete();
		qu.delete();
//		qu.insert(60);
		System.out.println("================");
		qu.display();
	}
}
class queueimp {
	int size;
	int[] arr;
	int start = 0;
	int end;
	
	public queueimp(int size) {
		this.size = size;
		arr = new int[size];
	}
	
	public void insert(int ele) {
		if(end == arr.length-1) {
			System.out.println("Queue is full");
		}
		else {
			arr[start] = ele;
			start++;
		}
	}
	
	public void delete() {
		end = arr.length - 1;
		if(start == 0) {
			System.out.println("Queue is Empty");
		}
		else {
			for(int i = 0;i<arr.length-1;i++) {
				arr[i] = arr[i+1];
			}
			arr[end] = 0;
			end--;
			start--;
		}
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}