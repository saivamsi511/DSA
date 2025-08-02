package hlo;
import java.util.Arrays;
public class twopointerpotimum {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,9};
	int tar = 5;
	Arrays.sort(arr);
	int i = 0;
	int j = arr.length - 1;
	while(i <= j) {
		if(arr[i] + arr[j] > tar) {
			j--;
		}else if(arr[i] + arr[j] < tar) {
			i++;
		}
		else {
			System.out.println(arr[i] + " "+ arr[j]);
			i++;
			j--;
		}
	}
}
}
