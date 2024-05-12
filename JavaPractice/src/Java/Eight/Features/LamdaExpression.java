package Java.Eight.Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface FunctionInterfaces{
	
	void inter(int x);
	
	default void normalFun() {
		System.out.println("Lamda Expression");
	}
}
public class LamdaExpression {

	public static void main(String[] args) {
		FunctionInterfaces interfac=(int x)->{System.out.println(x*2);};
		interfac.inter(5);
		interfac.normalFun();
		Consumer<Integer> c=(x)-> {System.out.println(x*3);};
		c.accept(5);
		 Consumer<List<Integer> > modify = list ->
	        {
	            for (int i = 0; i < list.size(); i++)
	                list.set(i, 2 * list.get(i));
	        };
	        
	        Consumer<List<Integer> > displayList= list-> list.stream().forEach(a->System.out.println(a+","));
	      
	        
	        List<Integer> list=Arrays.asList(1,4,7,6,8);
	        modify.accept(list);
	       displayList.accept(list);
	}

}
