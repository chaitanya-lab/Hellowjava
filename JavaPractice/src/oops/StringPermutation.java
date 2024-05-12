package oops;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {


	    public static void main(String[] args) {
	        String input = "abc";
	        List<String> permutations = generatePermutations(input);
	        permutations.forEach(System.out::println);
	    }

	    public static List<String> generatePermutations(String input) {
	        List<String> result = new ArrayList<>();
	        backtrack("", input, result);  
	        return result;
	    }

	    private static void backtrack(String current, String remaining, List<String> result) {
	        if (remaining.isEmpty()) {
	            result.add(current);
	        } else {
	            for (int i = 0; i < remaining.length(); i++) {
	                char ch = remaining.charAt(i);
	                String newCurrent = current + ch;
                    String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
	                backtrack(newCurrent, newRemaining, result);
	            }
	        }
	    }
	}


 