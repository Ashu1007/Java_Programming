package string_Programming;

public class CountCharInString {
	public static void main(String[] args) {
		String s="1Ashutosh213";
		getCount(s);
	}

	public static void getCount(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='0' && c<='9') {
				count++;
			}
		}
		System.out.println("The number numeric character is: "+count);
	}
}
