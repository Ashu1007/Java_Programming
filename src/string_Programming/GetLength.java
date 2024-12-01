package string_Programming;

public class GetLength {
	public static void main(String[] args) {
		String s="Ashutosh"; 
		getStringLength(s);
		
//		for(char c:s.toCharArray()) {
//			count++;
//		}
//		System.out.println("Length of given String is: "+count);
	}
	public static void getStringLength(String s) {
		char[] ch=s.toCharArray();
		System.out.println("Length of given String is: "+ch.length);
	}
	
	

}
