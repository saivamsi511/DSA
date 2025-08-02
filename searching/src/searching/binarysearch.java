package searching;
import java.util.Scanner;
public class binarysearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		int left = 0;
		int right = arr.length - 1;
		int mid =0;
		boolean found = true;
		while (left <= right){
			mid = (left  + right) / 2;
			if (key ==  arr[mid]) {
				System.out.println("Element is present at " + mid);
				found = false;
				break;
			}
			else if (key > arr[mid]) {
				left = mid + 1;
			}
			else if (key < arr[mid]) {
				right = mid - 1;
			}
		}
		if (found == true) {
			System.out.println("Not found");
		}
	}
}
