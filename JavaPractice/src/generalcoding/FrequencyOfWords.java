package generalcoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfWords {

	public static void main(String args[]) {

		String s = "hello";
		 Map<Character, Integer> d= new HashMap<Character, Integer>();

     for (int i = 0; i < s.length(); i++) {
         if (d.containsKey(s.charAt(i))) {
             d.put(s.charAt(i), d.get(s.charAt(i)) + 1);
         }
         else {
             d.put(s.charAt(i), 1);
         }
     }
     for(Map.Entry<Character,Integer> map: d.entrySet()) {
    	 
    	 System.out.println(map.getKey()+"  "+map.getValue());
     }
		
		
	}

}
