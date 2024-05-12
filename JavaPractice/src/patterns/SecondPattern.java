package patterns;

public class SecondPattern {
	
	public static void main(String args[]) {
		
		
		int count=0;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(j);
	            
			}
			
			System.out.println(" ");
		}
	

/* Out put	
	1 
	12 
	123 
	1234 
	12345 
	*/
	
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			
			System.out.print(i);
            
		}
		
		System.out.println(" ");
	}
	/*
	 1 
     22 
     333 
     4444 
     55555 
	 */
	int k=1;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(k);
			k++;
            
		}
		
		System.out.println(" ");
	}
	/*
	 1 
     23 
     456 
     78910 
     1112131415 
	 */
}
}
