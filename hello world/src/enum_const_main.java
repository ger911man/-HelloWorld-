import java.util.EnumSet;


public class enum_const_main {
	public static void main(String args[]){
		for(enum_const comrad: enum_const.values()){
			System.out.println(comrad+"\t"+comrad.printAll());
		}
		System.out.println("");
		
		for(enum_const comrad: EnumSet.range(enum_const.begma, enum_const.jonson)){
			System.out.println(comrad+"\t"+comrad.printAll());
		}
	}	
}
