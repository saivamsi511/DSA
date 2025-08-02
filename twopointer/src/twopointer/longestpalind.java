package twopointer;

public class longestpalind {
 public static void main(String[] args) {
	String s = "abcbd";
	String max = "";
	if (ispalin(s) == true) {
		System.out.println(s);
		System.exit(0);
	}
	for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<s.length();j++) {
			String substr = s.substring(i,j);
			System.out.println(substr);
			if(ispalin(substr) == true) {
//				System.out.println(substr);
				if(substr.length() > max.length()) {
					max = substr;
				}
			}
		}
	}
	System.out.println(max);
}
 public static boolean ispalin(String substr) {
//	String copy = s;
	String rev = "";
	for(int i = substr.length()-1;i>=0;i--) {
		rev =rev + substr.charAt(i);
	}
//	System.out.print(rev + " ");
	if(rev.equals(substr))
	return true;
	else
	return false;
	 
 }
}
