
public class class_no_main {
	private String hi = "Hihihihihih";
	
	//constructor make variables!
	public class_no_main(String str){
		hi=str;
	}
	
	
	public void printHello(String msg){
		System.out.println(msg);
		System.out.println(hi);
		hi="Gigigigig";
	}
	public int strLength(String str){
		return str.length();
	}
}
