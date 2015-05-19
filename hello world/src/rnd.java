import java.util.Random;

public class rnd {
	public static void main(String args[]){
		Random rnd = new Random();
		int number;
		
		for (int i=0; i<=10; i++){
			number=rnd.nextInt(5);
			System.out.println(number);
		}
		
	}
	
}
