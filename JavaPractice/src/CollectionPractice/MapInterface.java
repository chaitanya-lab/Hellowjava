package CollectionPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface {
	
	public static void main(String args[]) {
		
		Map<Character, String> map=new HashMap<>();
		
		map.put('a', "apple");
		map.put('b', "ball");
		map.put('c', null);
		map.put('c', "cat");
		map.put('c', "cat");
		
		LearnMap(map);
		
	
		
	}
   private static void LearnMap(Map<Character, String> map) {
	   Map<Character, String> m=new HashMap<>();
	    
	 m.putAll(map);
	
	Set<Character> key=map.keySet();
	for(Character k:key) {
		System.out.println(k +""+map.get(k));
	}
	for(Entry<Character,String> entry: m.entrySet()) {
		System.out.println(entry.getKey()+"  For "+entry.getValue());
	}
	map.forEach((keys,value)-> System.out.println(keys));
	   
   }

}
