package sorting;
import java.util.Scanner;
public class selectionsort {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int n = 5;
	int[] arr = {5,4,3,2,1};
	boolean swap = false;
	for(int i = 0;i<n-1;i++) {
		int mini = i;
		for(int j = i+1;j<n;j++) {
			if (arr[j] < arr[mini]) {
				mini = j;
			}
		}
		int temp = arr[mini];
		arr[mini] = arr[i];
		arr[i] = temp;
	}
	for(int num : arr) {
		System.out.print(num + " ");
	}
}
}
