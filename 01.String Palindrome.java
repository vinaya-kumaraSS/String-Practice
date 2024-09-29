package A_String;

public class Palindrome {
	public static void main(String[] args) {
		String str ="racecar"
				+ "";
		int n = str.length();
		boolean flag = true;
		for(int i=0; i<n; i++) {
			if(str.charAt(i) != str.charAt(n-i-1)) {
				flag = false;
				break;
			}
		}
		System.out.println(flag == true?"palindrome":"Not palindrome");
	}
}
