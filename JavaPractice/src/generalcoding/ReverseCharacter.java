package generalcoding;

public class ReverseCharacter {
	
public static void main(String args[]) {
	String s="I like this code";
	reverseString(s);
}
private static void reverseString(String s) {
	String words[]=s.split(" ");
	StringBuffer str1Buffer=new StringBuffer();
	for(int i=0;i<words.length;i++) {
		StringBuffer str=new StringBuffer(words[i]).reverse();
		str1Buffer.append(str+" ");
	}
	System.out.println(str1Buffer);


	
	
}

}
