import java.util.Scanner;

public class keyboard {
	public static void main(String args[]){
		double number=0;
		boolean correctData=false;
		int itera=0;
		Scanner	kb = new Scanner(System.in);
		System.out.print("Enter any data(use keyboard)");
		System.out.println("You've entered line: "+kb.nextLine());
		
		
		do{
			itera++;
			try{
				System.out.print("Now enter a number("+itera+"): ");
				number += 1;
				number = kb.nextDouble();
				correctData=true;				
			}catch(Exception e){
				System.out.println("You've entered wrong data");
				kb.next();
			}
			
		}while(itera<10&&!correctData);	
		
			
		System.out.println("You've entered a number: "+number);
		
		
	
		
		
	}
	
}
