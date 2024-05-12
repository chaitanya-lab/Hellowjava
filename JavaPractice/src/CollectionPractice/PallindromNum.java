package CollectionPractice;

public class PallindromNum {
	
	
	public static void main(String args[]) {
		
		System.out.println(isPalindrome(121));
		
	
}
	public static boolean isPalindrome(int x) {

        int temp=x,sum=0,rem=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            rem=x%10;
            sum=sum*10+rem;
            System.out.println(sum);
            x=x/10;
        }
        if(temp==sum){
            return true;
        }
        else{
            return false;
        }

}
}
