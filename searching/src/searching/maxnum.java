package searching;
import java.util.Scanner;
public class maxnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int maxi = 0;
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if (arr[i] > maxi) {
				maxi = arr[i];
			}
		}
		System.out.println(maxi);
	}
}
