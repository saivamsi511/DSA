package hlo;

public class prefixsumbriute {
public static void main(String[] args) {
	int arr[] = {2,5,9,1,3};
	int arr1[] =  new int[arr.length];
	
	for(int i=0;i<arr.length;i++) {
		int sum = 0;
		for(int j=0;j<i+1;j++) {
			sum += arr[j];
//			System.out.print(arr[j] + " ");
		}
		arr1[i] = sum;
//		System.out.println(sum);
	}
	
	for(int x:arr1) {
		System.out.print(x + " ");
	}
}
}
