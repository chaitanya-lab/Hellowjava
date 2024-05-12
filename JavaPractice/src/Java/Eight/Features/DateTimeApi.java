package Java.Eight.Features;

import java.time.ZoneId;

public class DateTimeApi {
	
	// 1. ZoneId 
	
	public static void main(String args[]) {
	ZoneId zoneID=ZoneId.systemDefault();
	
   System.out.println(zoneID);
	}
}
