package generalcoding;

public class MaximumOccurence {
	
	public static void main(String args[]) {
		
		String str="hello word!";
		findMaximumOccurenceOfCharacter(str);
	}

	private static void findMaximumOccurenceOfCharacter(String str) {
	
		final int ACII_value=256;
		
		int charCount[]=new int[ACII_value];
		
		for(char c: str.toCharArray()) {
			int count=charCount[c]++;
			System.out.println(c+"  "+(count+1));
		}
		
		int maxCount=0;
		char maxOccurenccess = ' '; 
		
		for(int i=0;i< ACII_value;i++) {
			if(charCount[i]>maxCount) {
				maxCount=charCount[i];
				maxOccurenccess= (char)i;
			}
		}
		System.out.println("The chactar is "+maxOccurenccess +" and occurencess"+maxCount);
	}

}
