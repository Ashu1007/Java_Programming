package string_Programming;

public class Panagram {
	public static void main(String[] args) {
		String s="qwertyuiopoplkjhlgiyofejgfveugwqhdewkjjejgfvmxkjcpquiuwfgdbvdjhgfdsazxcvbnm";
		int[] freq=getFreqArray(s);
		for(int i=0;i<freq.length;i++) {
			if(freq[i]==0) {
				System.out.println("Given String is not Panagram");
				return;
			}
		}
		System.out.println("Yes,It is the Panagram");
		
	}
	public static int[] getFreqArray(String s) {
		int[] freq=new int[26];
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>=65 && c<=90) {
				freq[c-65]++;
			}
			else if(c>=97 && c<=122) {
				freq[c-97]++;
			}
		}
		return freq;
	}

}
