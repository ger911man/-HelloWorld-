/*
Break - exit switch; exit loop(vihodit iz ODNOGO loop'a); tipa goto - no rabotaet tolko vo vlojennih blokah
Continue - propuskaet kod i perehodit k sleduus4ey iteracii loop'a
Return - vihod iz metoda (tut vihod iz MAINa)
*/
public class break_continue_return {
	public static void main(String[] args) {
	metka: for(int i=1;i<10;i++){
		for(int j=1;j<10;j++){
			for(int k=1;k<10;k++){
				if(i>5) break metka;
				System.out.print(i + "" + j + "" + k + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	System.out.println("************************************************************************");
	
	for(int i=1;i<100;i++){
		if(i%7==0) System.out.print(i+" ");
		else continue;		
	}
	System.out.println("\n************************************************************************");
	
	
	metka: for(int i=1;i<10;i++){
		for(int j=1;j<10;j++){
			for(int k=1;k<10;k++){
				if(j>5&&k>5){
					System.out.println();
					continue metka;
					
				}
				System.out.print(i + "" + j + "" + k + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	boolean exit=true;
	if(exit) return;
	System.out.println("not displayed");

	}
}
