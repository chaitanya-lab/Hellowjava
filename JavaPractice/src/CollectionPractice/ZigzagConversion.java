package CollectionPractice;

public class ZigzagConversion {
	
	public static void main(String args[]) 
	
	
	{
		String s="PAYPALISHIRING";
		int numRows=4;
		
		System.out.println(convert(s,numRows));
	}
	
		 public static String  convert(String s, int numRows) {

				        if (numRows == 1 || s.length() <= numRows) {
				            return s;
				        }
				        
				        StringBuilder[] rows = new StringBuilder[numRows];
				        
				        for (int i = 0; i < numRows; i++) {
				            rows[i] = new StringBuilder();
				        }
				        
				        int index = 0;
				        int direction = -1;
				        
				        for (char c : s.toCharArray()) {
				            rows[index].append(c);
				            if (index == 0 || index == numRows - 1) {
				                direction = -direction;
				                System.out.println(direction);
				            }
				            index += direction;
				        }
				        
				        StringBuilder result = new StringBuilder();
				        for (StringBuilder row : rows) {
				            result.append(row);
				        }
				        
				  
				        return result.toString();
				    

	}

}
