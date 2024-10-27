package loopHoles;

import java.io.FileNotFoundException;

/**
 *  ===================QUES ==================================
 *   If their is parent and child classes is there where child ovveride the parent methods. 
 *   Now parent didnt throw the Exception but child throw the exception . What will happen
 *   
 *   												SOLUTION
 *   ======================================================
 *   1) If it is a checked Exception  Compilation Issue will be there , and it will be informed to handle both at child and
 *       parent level.
 *       
 *    2) If it is a unchecked Exception . then There is No issue . Child Itself is sufficient to handle these situation.
 *    
 *   
 */
class Parent2
{
	public void first() {
		System.out.println("First From Parent");
	}
	public void second() {
		System.out.println("Second from Parent");
	}
}
class Child2 extends Parent2{
	
	public void first() {
		throw new NullPointerException("Some issue is there");
	}
	
  //This method will give exception
	
//	public void second() throws FileNotFoundException {    
//		throw new FileNotFoundException("Some issue is there");
//	}
}
public class Throws_Delegacy {

	public static void main(String[] args) 
	{
	 Parent2 p = new Child2();
	 p.first();

	}

}
