package continue_keyword;

//It is in infinite loop..
public class Program {
	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			System.out.println("ABABABABAB");
			if(i==5)
				continue;
			System.out.println(i);
			i++;
		}
	}

}
