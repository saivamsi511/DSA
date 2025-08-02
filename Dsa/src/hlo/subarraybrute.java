package hlo;

public class subarraybrute {
public static void main(String[] args) {
	int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
	int maxsum = 0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			int sum = 0;
			for(int k=i;k<j+1;k++) {
				sum += arr[k];
				System.out.print(arr[k] + " ");
			}
			if(sum > maxsum) {
				maxsum = sum;
			}
			System.out.println();
			sum = 0;
		}
//		System.out.println();
	}
	System.out.println(maxsum);
}
}
