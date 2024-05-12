package oops;

public class StringPractice {

	
	public static void main(String args[]) {
		String s="ABCDEFGH";
		
		System.out.println(s.substring(3)+s.substring(0, 3));
		
		StringBuffer s1=new StringBuffer("java");
		s1.append(s);
		System.out.println(s1);
	}
}
