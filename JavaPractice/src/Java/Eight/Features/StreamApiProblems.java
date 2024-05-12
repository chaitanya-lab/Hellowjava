package Java.Eight.Features;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiProblems {
	
//There uses of Stream in Java are mentioned below:
        //Stream API is a way to express and process collections of objects.
       //Enable us to perform operations like filtering, mapping,reducing and sorting.
	
	
	
  /* The first method is filter method
   This is predicate which returns boolean value  */
	
	public static void main(String args[]) {
	
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk"); 
		long count = strList.stream() .filter(x -> x.isEmpty()) .count(); 
		System.out.printf("List %s has %d empty strings %n", strList, count);

		
		long num = strList.stream() .filter(x -> x.length()> 3) .count();
		System.out.printf("List %s has %d strings of length more than 3 %n", strList, num);  

		
		// Create a List with String more than 2 characters
		
		List<String> Filtered=strList.stream() .filter(x -> x.length()> 2).
				collect(Collectors.toList());
		System.out.println("list with String more than 2 characters"+ Filtered );
		
		
		// Remove all empty Strings from List
		
		List<String> FilteredString=strList.stream().filter(x -> ! x.isEmpty()).
				collect(Collectors.toList());
		System.out.println("list without empty String"+ FilteredString );
		
		//Filter List of String startwith character a
		
		List<String> Startwith=strList.stream().filter(x -> x.startsWith("a")).
				collect(Collectors.toList());
		
		System.out.println("List of the string starts with a"+ Startwith);
		
	
}
}
