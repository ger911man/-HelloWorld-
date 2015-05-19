public class final_demo {
	private int sum;
	private final int NUMBER;
	
	public final_demo(int x){
		NUMBER=x;
	}
	
	public void add(){
		sum+=NUMBER;
		
		
	}
	
	public String toString(){
		return String.format("sum:%d NUMBER:%d",sum, NUMBER);
	}
}
