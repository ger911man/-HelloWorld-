/*
~ not
& and
| or
^ xor pobitovoe isklu4aus4ee ili
>> sdvig (ecli - to zapolniaet sleva 1)
>>> sdvig zapolniaet 0
<<
&=
|=
^=
>>=
>>>=
<<=

parnie     even
ne parnie  odd

 */

public class bit_operators {

	public static void main(String[] args) {
		int i=0,j,k=0;
		//double rnd;
		for(i=0; i<10; i++){
			k=(int)(Math.random()*10);
			if((k&1)==1){ //odd
				System.out.println(k+" is odd (не парное)");
			}else{
				System.out.println(k+" is even(парноео)");
			}
		}
		
		System.out.println("********************************");
		byte ch=64,res; //64=0100 0000
		i=ch<<2;
		res=(byte)(ch<<2); //256=1 0000 0000
		System.out.println("int i   = "+i);
		System.out.println("char res= "+res);
		
		System.out.println("********************************");
		k=1;
		for(i=0;i<32;i++){
			k=k<<1;
			System.out.println(k);
			
		}
		
		System.out.println("********************************");
		k=-2147483648;
		for(i=0;i<32;i++){
			k=k>>1;
			System.out.println(k);
			
		}
		
		System.out.println("********************************");
		k=-2147483648;
		for(i=0;i<32;i++){
			k=k>>>1;
			System.out.println(k);
			
		}
		
		System.out.println("********************************");
		int binary[] = {0b0_1111, 0b0_1000, 0b0_0011};
		String binStr[] ={ "1111",   "1000",   "0011"};
		
		int binRes;
		binRes=~binary[2];
		System.out.println("~ NOT("+binStr[2]+") "+binary[2]+"      binRes"+binRes);

		binRes=binary[2]&1;
		System.out.println(binStr[2]+" & 1 = "+binRes);
		binRes=binary[1]&1;
		System.out.println(binStr[1]+" & 1 = "+binRes);
		
		
		
		
		

	}
}
