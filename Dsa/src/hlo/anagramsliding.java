package hlo;

import java.util.Arrays;

class anagramsliding {
	public static void main(String[] args) {
		String s = "cbaebabacd";
		String p = "abc";
//		char[] arr1 = p.toCharArray();
//		Arrays.sort(arr1);
		int n = s.length();
		int n1 = p.length();
		
		int k = n1;
		int count = 0;
		for(int i =0;i<=n-k;i++) {
			String m = s.substring(i,i+k);
			System.out.println(m);
			if(isana(m,p) == true) {
//				System.out.println(m);
				count++;
			}
			n1++;
		}
		System.out.println(count);
	}
	public static boolean isana(String s,String p) {
		char[] arr1 = p.toCharArray();
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr1);
		return Arrays.equals(arr, arr1);
	}
}

