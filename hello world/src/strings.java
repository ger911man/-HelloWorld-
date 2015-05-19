import java.util.StringTokenizer;


public class strings {
	public static void main(String[] args){
		String str="Hello world";
		String str2="Hello world";
		if(str.equals(str2)){
			System.out.println(str+" eql 2 "+str2);
		}else{
			System.out.println(str+" not eql 2 "+str2);
		}
		
		//parse the String
		//StringTokenizer st = new StringTokenizer(str, ":");
		//StringTokenizer st = new StringTokenizer(str);
		
		
		System.out.println(str);
		String s = "asfsadfsadfa";
		for (int i=0;i<s.length();i++)
        {
           System.out.println(s.charAt(i));
        }
	}
}
