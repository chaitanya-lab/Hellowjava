package CollectionPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LengthOfString {
	
	
	public static void main(String args[]) {
		
		String str="abcocfaf";
		
		LengthOfLongestSubString(str);
	}
	public static void LengthOfLongestSubString(String s) {
		
		char arr[]=s.toCharArray();
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		int LengthLongestSubString=0;
		String LongestSubstring=null;
		for(int i=0;i<s.length();i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], i);
			}
			else {
				i=map.get(arr[i]);
				map.clear();
			}
			if(map.size()>LengthLongestSubString) {
			 LengthLongestSubString=map.size();
		//	 LongestSubstring=map.keySet().toString();
			 LongestSubstring = s.substring(i - LengthLongestSubString + 1, i + 1);
					
			}
		}
              System.out.println(LengthLongestSubString +""+ LongestSubstring);
	}

}
