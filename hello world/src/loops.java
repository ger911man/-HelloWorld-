
public class loops {
	public static void main(String[] args) throws java.io.IOException{
		
		//prime=prostoe(delitsa tolko na 1 i na sebya)
		boolean prime;
		for (int isPrime=1;isPrime<100;isPrime++){
			prime=true;
			for(int i=2;i<isPrime;i++){
				if((isPrime%i)==0){
					prime=false;
					break;
				}
			}
			if(prime){
				System.out.print(isPrime+" ");
			}
			
		}
		System.out.println();
		System.out.println("**********************************************************************************");
		
		for(int i=1,j=7;i<j;i++,j--){
			System.out.println("i="+i+" j="+j);
		}
		System.out.println("**********************************************************************************");
		
		int i=0,j=0;
		while(i<=3){
			i++;
			System.out.println(i);
		}
		System.out.println("**********************************************************************************");
		
		//i=0;
		do{
			System.out.println(i);
		}while(i++<=3);
		System.out.println("**********************************************************************************");
		
		i=50;
		j=75;
		while(++i<--j); 
		System.out.println("i="+i+" j="+j);
		System.out.println("**********************************************************************************");

		char choice;
		do{ 
			System.out.println("Chose number!");
			System.out.println("	1. if");
			System.out.println("	2. switch");
			System.out.println("	3. while");
			System.out.println("	4. do-while");
			System.out.println("	5. for");
			choice = '1';//choice=(char) System.in.read();
		}while(choice<'1'||choice>'5');
		
		switch(choice){
			case '1':
				System.out.print("if(){\n"
					+ "	opr;\n"
					+ "	opr;\n"
					+ "}\n"
					+ "else if(){\n"
					+ "	opr;\n"
					+ "	opr;\n"
					+ "}\n"
					+ "else{\n"
					+ "	opr;\n"
					+ "	opr;\n"
					+ "}");
				break;
			case '2':
				System.out.print("switch(variable){\n"
						+ "	case 1:\n"
						+ "		opr;\n"
						+ "		opr;\n"
						+ "		break;\n"
						+ "	case 2:\n"
						+ "	case 3:\n"
						+ "	case 4:\n"
						+ "		opr;\n"
						+ "		break;\n"
						+ "	default:\n"
						+ "		opr;\n"
						+ "}");
			case '3':
				System.out.print("while(){\n"
						+ "	opr;\n"
						+ "	opr;\n"
						+ "}\n");
			case '4':
				System.out.print("do{\n"
						+ "	opr;\n"
						+ "	opr;\n"
						+ "}while();\n");
			case '5':
				System.out.print("for(int i=1;i<10;i++){\n"
						+ "	opr;\n"
						+ "	opr;\n"
						+ "}\n");					
			default:
		}
		
		System.out.println("***************************************************************************************************");
		int numrs[] = {0, 1, 2, 3, 400, 5, 6, 7, 8, 9,};
		int sum_numrs = 0;
		for(int numr: numrs){
			if(numr>=100) break;
			numr*=2;  //massiv ne izmenitsa esli izmenit' "numr"
			sum_numrs+=numr;
		}
		System.out.println("sum=" + sum_numrs);
		System.out.println("***************************************************************************************************");
		
		String[] names = {"Gera", "Nesa", "Che", "Abez"};
		for(String nam:names){
			System.out.println(nam);
		}
		System.out.println("***************************************************************************************************");
		
		int x2array[][] = new int[6][12];
		for(j=0;j<2;j++){
			for(i=0;i<6;i++){
				x2array[j][i]=1;
			}				
		}
		i=0;
		j=0;
		for(int y[]:x2array){
			for(int x:y){
				x2array[j][i++]=(int)(Math.random()*10);
				//k=(int)(Math.random()*10);
			}
			j++;
			i=0;
		}
		
		for(int y[]:x2array){
			for(int x:y){
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
		
	}
	
	
	
	
}
