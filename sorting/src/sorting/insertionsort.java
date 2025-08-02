package sorting;
import java.util.Scanner;
public class insertionsort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 1; i<arr.length;i++) {
//			System.out.println(arr[i]);
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j - 1;
			}
			arr[j+1] = key;
		}
		for(int num: arr) {
			System.out.print(num + " ");
		}
	}
}
