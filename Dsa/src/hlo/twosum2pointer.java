package hlo;

public class twosum2pointer {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,1,3,5,24};
		int tar = 29;
		int j = 1;
		for(int i =0;i<arr.length;i++) {
			while (j < arr.length-1) {
				if(arr[i] + arr[j] == tar) {
					System.out.println(arr[i] + " " + arr[j]);
				}
				j++;
			}
			j = 0;
		}
	}
}
