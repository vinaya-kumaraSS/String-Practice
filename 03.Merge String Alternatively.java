package A_String;
public class Merge_Alternatively {
	public static void main(String[] args) {
		String str1 = "vinay";
		String str2 = "ss";
		StringBuffer BF = new StringBuffer();
		for(int i=0; i < str1.length() || i < str2.length(); i++) {
			if(i < str1.length()) {
				BF.append(str1.charAt(i));
			}
			if(i < str2.length()) {
				BF.append(str2.charAt(i));
			}
		}
		System.out.println(BF);
	}
}

//vinay 
//kumar
//vkiunmaayr
