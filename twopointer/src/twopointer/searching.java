package twopointer;

public class searching {
	public static void main(String[] args) {
		int[] arr = {11,22,32,43,45,63,77,35,67};
		int key = 45;
		int l = 0;
		int end = arr.length - 1;
		while (l <= end) {
			if(arr[l] == key || arr[end] == key) {
				System.out.println("Element found");
				break;
			}
			else {
				l++;
				end--;
			}
		}
		System.out.println("completed");
	}
}
