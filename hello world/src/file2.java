import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;


public class file2 {

	public static void main(String[] args) throws IOException {
		
		
		File f = new File("gera4.txt");
		System.out.println("Got a file "+f);
		
		System.out.println("File exists? "+f.exists());
		System.out.println("Is it directory? "+f.isDirectory());
		
		OutputStream fileOutStream = new FileOutputStream(f);
		
		String hi = "Hello worldnhing\nf\nff\nnf\nff\nff\nf";
		fileOutStream.write(56);
		fileOutStream.write(56);
		fileOutStream.write(57);
		fileOutStream.write(hi.getBytes());
		//fileOutStream.
		fileOutStream.close();
		
		
		BufferedReader fileInStream = new BufferedReader (new InputStreamReader(new FileInputStream(f)));
		String line = fileInStream.readLine();
		while(line!=null){
			System.out.println(line);
			line = fileInStream.readLine();			
		}
		fileInStream.close();
	}

}
