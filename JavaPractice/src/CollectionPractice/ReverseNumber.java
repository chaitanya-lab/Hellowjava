package CollectionPractice;

public class ReverseNumber {
	
	
	public static void main(String args[]) {
		
		int x=Integer.MIN_VALUE;
		System.out.println(reverse(x));
		
	}

	
	    public static int reverse(int x) {
           
	    	long finalNum = 0;

 			if(x%10==0){
 			  x=x/10;
 			}
	        String s= Integer.toString(x);
	        StringBuffer str=new StringBuffer(s);
	        String st=str.reverse().toString();
	        if(st.contains("-")) {
	        	 st=st.replace("-", "");
	        	finalNum= -Long.parseLong(st);
	        }
	        finalNum=Long.parseLong(st);
	        
	            if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
	                return 0;
	            }
	            if(x<0){
	                return (int)(-1*finalNum);
	            }
	            return (int)finalNum;
	    
	    }
}
