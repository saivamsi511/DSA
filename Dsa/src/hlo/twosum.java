package hlo;

public class twosum {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,1,3,5,24};
	int tar = 29;
	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {
			if(arr[i] + arr[j] == tar) {
				System.out.println(arr[i]+ " " + arr[j]);
			}
		}
	}
	}
}

