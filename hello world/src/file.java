import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;


public class file {
	public static void main(String[] args){
		
		final Formatter f;
		
		//testing if file exists and creating it if it is not
		//overwtites old file
		File file1 = new File ("gera.txt");
		if(file1.exists()){
			System.out.println("File exists "+file1.getName());
		}else{
			try {
				f = new Formatter("gera.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("file1 not exists");
		}
		
		openFileWriteClose();
		readFile();
		readFile2();
	}
	
	public static void openFileWriteClose() {
		Formatter f = null;
		try {
			f = new Formatter("gera2.txt");
			System.out.println("file gera2.txt created");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("probybley file gera2.txt not exists");
		}		
		
		f.format("%s\t%s\t%s\n", "key", "code", "delay");
		f.format("%s\t%s\t%s\n", "up", "22", "100");
		f.format("%s\t%s\t%s\n", "up", "21", "120");
		
		f.close();
	}
	
	public static void readFile(){
		Scanner f = null;
		
		try {
			f=new Scanner(new File("gera2.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file not exists");
		}
		
		while(f.hasNext()){
			String str = f.next();
			System.out.println(str);
		}
		f.close();		
	}
	
	public static void readFile2(){
		Scanner f = null;
		
		try {
			f=new Scanner(new File("gera2.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file not exists");
		}
		
		while(f.hasNext()){
			String str = f.next();
			System.out.println(str);
		}
		f.close();		
	}
	

}

