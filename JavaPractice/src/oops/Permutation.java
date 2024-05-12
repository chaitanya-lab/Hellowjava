package oops;
public class Permutation {
	public static void main(String args[]) {
		String s="abc";
		permutations(s,"");
		}
	private static void permutations(String str, String string) {	
		if(str.length()==0) {
			System.out.println(string);
			}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String req=str.substring(0,i)+str.substring(i+1);
			permutations(req,string+ch);
		}
	}
}
