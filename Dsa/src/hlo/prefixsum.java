package hlo;

public class prefixsum {
public static void main(String[] args) {
	int arr[] = {2,5,9,1,3};
	int arr1[] =  new int[arr.length];
	
	int sum = 0;
	for(int i=0;i<arr.length;i++) {
		sum += arr[i];
		arr1[i] = sum;
	}
	
	for(int x:arr1) {
		System.out.print(x + " ");
	}
}
}
