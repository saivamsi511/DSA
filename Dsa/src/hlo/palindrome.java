package hlo;

public class palindrome {
	public static void main(String[] args) {
		String s = "madkam";
		int j =0;
		int k = s.length()-1;
		int mid = s.length() / 2;
		boolean a = false;
		while(j <= mid || k <= mid) {
			if(s.charAt(j) != s.charAt(k)) {
				System.out.println("no bro");
				a = true;
				break;
			}
			j++;
			k--;
		}
		if(a == false) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("no");
		}
	}
}
