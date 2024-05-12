package CollectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListFirst {

	
	public static void main(String args[]) {
		
		
		List<Integer> str=new ArrayList<Integer>(1);
		List<Integer> str1=Arrays.asList(45,19,23,12,10,12);
		System.out.println(str.size());
		str.addAll(str1);
		System.out.println(str.size());
		/*
		 * str.add(45); //To add the element in arraylist str.add(1,19); str.add(1,23);
		 * str.add(3,12);
		 */
		/*
		 * boolean b=str.contains(20); System.out.println(b);
		 * 
		 * boolean c= str.containsAll(str1); System.out.println(c);
		 * System.out.println(str.equals(str1)); System.out.println(str);
		 * str.forEach(e-> System.out.println(e));
		
		 */
		Iterator it =str.iterator();
		
		Iterator its=str1.listIterator();
		
		
		while(it.hasNext()) {
			System.out.print(it.next()+",");
		
		}
		
	}
}
