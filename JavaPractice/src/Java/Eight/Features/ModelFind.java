package Java.Eight.Features;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ModelFind {

	  public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	public static void main(String agrs[]) {

	
	//private static void classyfySwitch(String s) {

		/*
		 * String[] model = s.split("-");
		 * 
		 * if (model[model.length - 1].contains("S") || model[model.length -
		 * 1].contains("X")) { System.out.println("classic"); }
		 * 
		 * else { for (int i = 1; i < model.length; i++) {
		 * 
		 * String numberOnly1 = model[i].replaceAll("[^0-9]", ""); int port =
		 * Integer.parseInt(numberOnly1); if (port < 24) { System.out.println(port);
		 * System.out.println("Type 1"); } else { System.out.println(port);
		 * System.out.println("Type 2"); } } }
		 */
		/*
		 * String[] model = s.split("-");
		 * 
		 * if (model[model.length - 1].contains("S") || model[model.length -
		 * 1].contains("X")) { System.out.println("classic"); } else {
		 * Arrays.stream(model, 1, model.length) .map(part -> part.replaceAll("[^0-9]",
		 * "")) .mapToInt(Integer::parseInt) .forEach(port -> {
		 * System.out.println(port); System.out.println(port < 24 ? "Type 1" :
		 * "Type 2"); }); }
		 */
		/* String[] model = s.split("-"); */

	/*	if (model[model.length - 1].matches(".*[0-9]S|.*[0-9]X")) {
		    System.out.println("classic");
		} else {
		    Arrays.stream(model, 1, model.length)
		            .map(part -> part.replaceAll("[^0-9]", ""))
		            .mapToInt(Integer::parseInt)
		            .forEach(port -> {
		                System.out.println(port);
		                if (port < 24) {
		                    System.out.println("Type 1");
		                } 
		                 else {
		                    System.out.println("Type 2");
		                }
		            });
		}*/
	

		  

		        int n = 10; 
		        System.out.println("First " + n + " prime numbers:");

		        int count = 0;
		        int number = 2;

		        while (count < n) {
		            if (isPrime(number)) {
		                System.out.println(number);
		                count++;
		            }
		            number++;
		        }
		    }
		

			/*
			 * boolean isPrime = num > 1 && IntStream.range(2, num).noneMatch(i -> num % i
			 * == 0);
			 * 
			 * if (isPrime) { System.out.println("The number is prime: " + num); } else {
			 * System.out.println("The number is not prime: " + num); }
			 */
				

	}


