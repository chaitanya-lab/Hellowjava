package Java.Eight.Features;


 class MyThred extends Thread{
	
	 
	 public synchronized void run() {
		 
	     for (int i = 0; i < 5; i++) {
	            System.out.println("Thread 1: " + i);
	            try {
	                Thread.sleep(1000); // Introducing a delay of 1 second
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }
	        }
		 
	 }
}

public class Threading {
	
	
	public static void main(String arrg[]) {
		
	MyThred thread=new MyThred();
	thread.start();
	
	  for (int i = 0; i < 5; i++) {
          System.out.println("Main Thread: " + i);
          try {
              Thread.sleep(1000); // Introducing a delay of 1 second
          } catch (InterruptedException e) {
              System.out.println(e);
          }
		
	}
	}
}
