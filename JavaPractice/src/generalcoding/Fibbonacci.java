package generalcoding;

public class Fibbonacci {

	public static void main(String[] args) {
		
		int n=10;
		
		int a=0;
		int b=1;
		int c=0;
		for(int i=0;i<=n;i++) {
			
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+",");
		}
		
	}

}
