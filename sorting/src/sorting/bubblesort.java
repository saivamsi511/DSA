package sorting;
import java.util.Scanner;
public class bubblesort {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = 5;
	int[] arr = new int[n];
	for(int i1 = 0;i1<n;i1++) {
		arr[i1] = sc.nextInt();
	}
	boolean swap = false;
	for(int i = 0;i<n-1;i++) {
		for(int j = 0;j<n-i-1;j++) {
			if (arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				swap = true;
			}
		}
	}
	for(int num: arr) {
		System.out.print(num + " ");
	}
} 
}