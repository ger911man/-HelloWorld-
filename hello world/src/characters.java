public class characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1, ch2;
		byte i;
		ch1=71;
		for (i=0;i<=10;i++){
			
			System.out.println("ch1=" + ch1);
			ch1++;
			ch1+=i;
		}
		ch2='W';
		System.out.println("******************ch2=*****************" + ch2);
		for (ch1=60;ch1<=90;ch1++){
			System.out.println("ch1=" + ch1);	
		}
		
		
		char c8='\141';
		char c10=88;
		char c16='\u0061';
		char nextLine='\n';
		/*
		 * \'
		 * \"
		 * \\
		 * \n -next
		 * \t -tab
		 * \r -caret return
		 * \f -poda4a stranici
		 * \b -zaboy
		 */
		
		
		System.out.println("****************************");
		System.out.print("\tc8=" + c8);
		System.out.print(nextLine);
		System.out.print("\tc10=" + c10);
		System.out.print(nextLine);
		System.out.print("\tc16=" + c16);
		System.out.print(nextLine);
		
	}

}
