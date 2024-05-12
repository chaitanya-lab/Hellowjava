package oops;

public class Exceptions {

	public static void main(String args[]) {
		
		String prt= null;
		
		try {
			
			if("gfg".equals(prt)) {
				System.out.println("Same");
			}
			else {
				System.out.println("not same");
			}
		}catch(NullPointerException e) {
			System.out.println("Null pointer exception occures");
		}
	}
}
