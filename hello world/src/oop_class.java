class Crkl{
	double coord_x;
	double coord_y;
	double radius;
	Crkl(double coord_x,double coord_y,double radius){
		this.coord_x=coord_x;
		this.coord_y=coord_y;
		this.radius=radius;
	}
	
	double countArea(){
		return 3.14159*radius*radius; 
	}
	double countLenght(){
		return 2*3.14159*radius; 
	}
}



class Box{
	double width;
	double height;
	double depth;
	
	Box(){ // constructor, zadaet na4alnie parametri exemplara
		width=1;
		height=1;
		depth=1;
		
	}
	
	void getdimensions (double w, double h, double d){
		width=w;
		height=h;
		depth=d;
	
	}
	
	void printDimensions(){
		System.out.println("\nmethod:\nWid="+width+"\nhei="+height+"\ndep="+depth);
	}
	
	double countVolume(){
		
		return (width*height*depth);
	}
	
	/*public void finalize() {
		System.out.println("Box has bin destroyed");
	}*/
}

public class oop_class {
	public static void main(String args[]){
		Box box1 = new Box();
		double vol=0;
		box1.width=10.1;
		box1.height=5.3;
		box1.depth=7.2;
		
		System.out.println("Counted in main: vol=" + (box1.width*box1.depth*box1.height));
		
		//Box box2 = new Box();
		box1.printDimensions();
		
		vol=box1.countVolume();
		System.out.println("\ncounted and returned by method:     vol="+vol);
		
		Box box2 =new Box();
		box2.getdimensions(2.13, 4.799, 15.34324);
		box2.printDimensions();
		vol=box2.countVolume();
		System.out.println("\ncounted and returned by method:     vol="+vol);
		
		Box box3 =new Box();
		box3.printDimensions();
		vol=box3.countVolume();
		System.out.println("\ncounted and returned by method:     vol="+vol);
		
		Crkl circl1 = new Crkl(1,1,5);
		double area=circl1.countArea();
		double lenght=circl1.countLenght();
		System.out.println("area="+area+"  length="+lenght);
		
	}	
}
