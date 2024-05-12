package CollectionPractice;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class StringPractice {
	
	public static void main(String args[]) {
		
		
		/*
		 * String str = "leetcode"; int[] freq = new int[26]; for (int i = 0; i <
		 * str.length(); i++) { freq[str.charAt(i)-'a']++;
		 * 
		 * 
		 * } for (int i = 0; i < str.length(); i++) { if (freq[str.charAt(i) - 'a'] ==
		 * 1) { System.out.println("First non-repeating character: " + str.charAt(i));
		 * return; } }
		 * System.out.println("There are no non-repeating characters in the string.");
		 */
		String s="bcdffb";
		
		
		int Len=s.length();
     	char ch[]=s.toCharArray();
		Map<Character,Integer> map=new HashMap<>(); 
	
		for(int i=0;i<Len;i++) {
			if(map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1);
			}else {
				map.put(ch[i], 1);
			}
		}
	
		for(Map.Entry<Character, Integer> m:map.entrySet()) {
			if(m.getValue()==1) {
			System.out.println(m.getKey());
			break;
			}
		}
		
		}
	
	}


