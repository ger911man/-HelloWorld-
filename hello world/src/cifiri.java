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

// see "type_convertor.java"

public class cifiri {

	public static void main(String[] args) {
		byte a=0b11;
		short b=071;
		int c=10;
		long d=0xF1;
		System.out.println(" a="+a +" b="+ b + " c="+ c + " d="+ d);
	}

}
