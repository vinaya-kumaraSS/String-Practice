package A_String;

public class Convert_Case {
	public static void main(String[] args) {
		String str = "VINAY";
//		output : vinay
		System.out.println(convertCase(str));
	}
	static String convertCase(String str) {
		char[] c = str.toCharArray();
		for(int i=0; i< c.length; i++) {
			if(c[i] >= 65 && c[i] <= 90) {
				c[i] = (char)(c[i] + 32);
			}
		}
		return String.valueOf(c);
	}
}
