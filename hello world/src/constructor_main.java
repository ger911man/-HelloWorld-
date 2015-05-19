
public class constructor_main {
	public static void main(String args[]){
		constructor_class cc = new constructor_class(3,3);
		//cc.set(9, 9, 9);
		cc.prnt();
		
		constructor_class cc2 = new constructor_class();
		cc2.prnt();
		
		constructor_class cc3 = new constructor_class(9,9,9);
		cc3.prnt();
	}
}
