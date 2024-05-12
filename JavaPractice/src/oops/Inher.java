package oops;
	
class Animal {  
	
	
	

		public void eat()  {System.out.println("eating...");}  
		
}
		class Dog extends Animal{ 

		public Dog(int a,int b) {
			System.out.println("Child class"+a+b);
		}
		

		public void eat()  {System.out.println("barking...");}  
		
		}  

public class Inher {
		public static void main(String args[]){  
		Animal d=new Dog(5,6);  
		d.eat();
		}

}
