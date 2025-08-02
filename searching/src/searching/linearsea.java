package searching;
import java.util.Scanner;
public class linearsea {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextLine();
		}
		boolean ans = true;
		String find = sc.nextLine();
		for(int j=0;j<arr.length;j++) {
			if (arr[j].equals(find)) {
				System.out.println(arr[j] + " Found at index " + j);
				ans = false;
			}
		}
		if (ans == true) {
			System.out.println("Not found");
		}
	}
}
