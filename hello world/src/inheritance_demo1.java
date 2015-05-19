
public class inheritance_demo1 extends inheritance_superclass{
	
	public inheritance_demo1(){
		counter++;
	}
	
	//override method from superclass
	public void printHello(){
		System.out.println("Hello from superclass-fooooooooo");
	}
	
	public void printAll(){
		System.out.println("Hello from demo1! counter="+counter);
	}

}
