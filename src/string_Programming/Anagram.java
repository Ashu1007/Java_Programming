package string_Programming;

public class Anagram {
	public static void main(String[] args) {
		String s="silen"; String t="listen";
		boolean res = isAnagram(s,t);
		System.out.println(res);
	}
	
	public static boolean isAnagram(String s,String t) {
		int[] freq1=getFreqArray(s);
		int[] freq2=getFreqArray(t);
		for(int i=0;i<freq1.length;i++) {
			if(freq1[i]!=freq2[i]) {
				return false;
			}
		}
		return true;
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
