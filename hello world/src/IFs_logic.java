/*
 a && (b+c)    !=    a & (b+c)     //  

 if-then-else
"bool" ? "if true" : "else"
*/


public class IFs_logic {
	public static void main(String[] args){
		double a,b,c;
		a=0;
		b=6;
		c=0;
		if( a!=0 && (c=b/a)>=5 ){  // & not the same as && 		if( a!=0 & (c=b/a)>=5 ){
			System.out.println("c="+c+" is grater than 5");
		}else{
			System.out.println("-=divide by 0 error=-, c="+c);
		}
		System.out.println("********************************************");
		
		int x,y,z;
		x=0;
		y=6;
		z=0;
		z= x!=0 ? y/x : 0;
		System.out.println("-=divide by 0=-  z="+z);
		x=3;
		z= x!=0 ? y/x : 0;
		System.out.println("z="+y+"/"+x+"="+z);
		
		System.out.println("********************************************");
		
		int month=5;
		if (month==12||month==1||month==2){
			System.out.println("Winter");
		}
		else if (month==3||month==4||month==5){
			System.out.println("Spring");
		}
		else if (month==6||month==7||month==8){
			System.out.println("Summer");
		}
		else if (month==9||month==10||month==11){
			System.out.println("Autumn");
		}
		else{
			System.out.println(month+" - is not a month!");
		}
		
		System.out.println("********************************************");
		
		int i;
		for(i=1;i<100;i++){
			switch(i){
				case 2:
					System.out.println("i=2");
					break;
				case 7:
					System.out.println("i=7");
					break;
				case 9:
					System.out.println("i=9");
					break;
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
					System.out.println("I="+i+"  is 13..17");
					break;
				default:
					// nothing
			}
		}
		
		System.out.println("********************************************");
		
		String str = "Fof";
		
		switch(str){
			case "FOF":
			case "Fof":
			case "F0f":
			case "fof":
				System.out.println(str+" u mizerable.");
				break;
			default:
				System.out.println(str+" - what is it?");
		}
				
	}
}
