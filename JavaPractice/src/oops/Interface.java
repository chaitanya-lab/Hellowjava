package oops;

interface MyInterface{
	
	 void doSomething();
}
interface inter extends MyInterface{
	 void doNothing() ;
	 
}
public class Interface implements inter{

	public static void main(String args[]) {
		
	 inter s=new Interface();
	 s.doSomething();
	}

	@Override
	public void doSomething() {
		System.out.println("Doing.....");
		
	}

	@Override
	public void doNothing() {
		// TODO Auto-generated method stub
		
	}
}
