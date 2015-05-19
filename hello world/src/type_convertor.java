/*
    byte:  -128..127          1-byte   8-bit
    short: -32,768..32,767    2-byte  16-bit 
    int:   -231..231-1        4-byte  32-bit
    long:  -263..263-1        8-byte  64-bit 
    float:                    4-byte  32-bit
    double:                   8-byte  64-bit
    boolean: 0..1             1-byte   8-bit
    char:                     2-byte   16-bit Unicode character.
*/



public class type_convertor {

	public static void main(String[] args) {
		int i=1111, xi;
		byte b=66, xb;
		char c='a', xc; 
		float f=3, xf;
		double d=333.14159, xd;
		String str = "123"; 
		xb=(byte) i;
		xi=b;
				
		System.out.println("xb=" + xb + "    xi=" + xi );
		
		xb=(byte)d;
		System.out.println("xb= "+xb);

		xb=(byte) (50*2.5);
		System.out.println("xb= "+xb);
		
		xd=(i/c)+(f*d)+(b/2);
		System.out.println("xd= "+xd);
		System.out.println("int = %d"+ Integer.valueOf(str));
		

	}

}
