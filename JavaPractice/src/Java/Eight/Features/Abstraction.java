package Java.Eight.Features;

abstract class AbstractShape {
    abstract void draw(); // Abstract method without implementation
 
}

abstract class PartiallyImplementedShape extends AbstractShape {
    void shape() {
	 
    	System.out.println("this is partial....");
 }
}

abstract class ConcreteShape extends PartiallyImplementedShape {
    // This class still remains abstract as it doesn't implement 'draw()'
}

class FinalShape extends ConcreteShape {
    void draw() {
        // Implementation of the 'draw()' method specific to FinalShape
        System.out.println("Drawing FinalShape");
    }
}

public class Abstraction {
	
	public static void main(String args[]) {
		
		PartiallyImplementedShape sh=new FinalShape();
		sh.draw();
		sh.shape();
	}

	

}
