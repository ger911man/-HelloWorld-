
public class static_demo {
	private String fn;
	private String ln;
	private static int nPeople = 0;
	
	public static_demo(String fn, String ln){
		this.fn=fn;
		this.ln=ln;
		nPeople++;
		System.out.printf("fn:%s\tln:%s\ttotal=:%d\n",fn,ln,nPeople);
	}
	
	public void printall(){
		System.out.printf("fn:%s\tln:%s\ttotal=:%d\n",fn,ln,nPeople);
	}
	
	public String getName(){
		return fn;
	}
	
	public static int getNPeople(){
		return nPeople;
	}
}
