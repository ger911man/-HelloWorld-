
public class static_main {
	public static void main(String args[]){
		static_demo m1 = new static_demo("gera","german");
		static_demo m2 = new static_demo("nesa","filla");
		static_demo m3 = new static_demo("olg","bmass");

		m1.printall();
		m2.printall();
		m3.printall();
		
		
		System.out.println(m2.getName());
		System.out.println(m2.getNPeople());
		//*********************************************
		System.out.println(static_demo.getNPeople());
		
		
		
	}
	
	
}
