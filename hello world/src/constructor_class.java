public class constructor_class {
	private int h=1;
	private int m=1;
	private int s=1;

// Multiple constructors 4 different amount of args
	public constructor_class(){
		this (0,0,0);
	}
	public constructor_class(int h){
		this (h,0,0);
	}
	public constructor_class(int h, int m){
		this (h,m,0);
	}
	public constructor_class(int h, int m, int s){
		set(h,m,s);
		System.out.printf("Constructed a class %s\n", this); // see the toString method
	}
	
	
	public void set(int x,int y,int z){
		this.h=x;
		this.m=y;
		this.s=z;
	}
	
	public void prnt(){
		System.out.println(this.h+"\t"+m+"\t"+s);
	}
	
	public String toString(){
		return String.format("%d/%d/%d",h,m,s);
	}
	
}
