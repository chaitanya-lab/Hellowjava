package Java.Eight.Features;

import java.util.Arrays;
import java.util.List;

public class MapFunction {

	
	public static void main(String args[]) {
		
		List<Integer> list=Arrays.asList(12,3,1,5,7);
		
		int Sum=list.parallelStream().mapToInt(n-> n*n).sum();
		
		System.err.println(Sum);
	}
	
	
}
