package patterns;

public class FirstPattern {

	
	public static void main(String args[]) {
		char ch;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				 ch = (char) ('A' + j);
				System.out.print(ch);
			}
			
			System.out.println(" ");
		}
	}
}
