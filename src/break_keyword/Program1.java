package break_keyword;

public class Program1 {

	public static void main(String[] args) {
		int i=1;
		while(true) {
			if(i>10)
				break;
			System.out.println(i);
			i++;
		}
	}

}
