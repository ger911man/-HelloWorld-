
public class time {
	private static int hr=0,min=0,sec=0;
	
	public static void main(String args[]){
		printMil();
		setTime(12,30,11);
		printMil();
		setTime(14,30,11);
		printReg();
	}
	
	public static void setTime(int h,int m,int s){
		hr=(h>=0 && h<24? h : 0);
		min=(m>=0 && m<60? m : 0);
		sec=(s>=0 && s<60? s : 0);

	}
	
	public static void printMil(){
		System.out.println(String.format("%02d:%02d:%02d", hr,min,sec));
	}
	
	public static void printReg(){
		System.out.println(String.format("%02d:%02d:%02d %s", (hr==0||hr==12? 12 : hr%12),min,sec, (hr<=12?"A":"P")));
	}
	
}
