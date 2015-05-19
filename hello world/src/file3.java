import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class file3 {
	
	//буферизированная запись, чтение, парсинг строки

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter pathWr = new FileWriter("gera5.txt");
		BufferedWriter bw = new BufferedWriter(pathWr);
		bw.write("sda 152 sss    	   rrr     \n");
		bw.write("sdas 154\n");
		bw.write("sdas 15\n");
		bw.write("sdas 15\n");
		bw.close();
		
		FileReader pathRd = new FileReader("gera5.txt"); 
		BufferedReader br = new BufferedReader(pathRd);
		
		String str;
		while((str = br.readLine())!=null){
			System.out.println(str);
		}
		br.close();
		System.out.println("closed\n");
		
		FileReader pathRd2 = new FileReader("gera5.txt");
		BufferedReader br2 = new BufferedReader(pathRd2);
		System.out.println("line1");
		str = br2.readLine();		
		//allso see this StringTokenizer st = new StringTokenizer(str, ":");
		StringTokenizer st = new StringTokenizer(str);
		System.out.println("line contains words n="+st.countTokens());
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		System.out.println("\nline2");
		str = br2.readLine();
		st = new StringTokenizer(str);
		System.out.println(st.nextToken()+st.nextToken());
		
		br.close();
	}

}
