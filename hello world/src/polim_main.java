
public class polim_main {

	public static void main(String[] args) {

		polim_superclass superarray[] = new polim_superclass[2];
		superarray[0] = new polim_sc1(); 
		superarray[1] = new polim_sc2();
		
		
		
		for (int i=0;i<2;i++){
			superarray[i].superPrint();
		}
		
		polim_ssc ssc = new polim_ssc();
		polim_superclass superc = new polim_sc1();
		ssc.giveMeSomeObj(superc);
		ssc.giveMeSomeObj(superarray[0]);
		ssc.giveMeSomeObj(superarray[1]);
		
		superarray[0].superPrintAbstract();
		superarray[1].superPrintAbstract();
		
	}

}
