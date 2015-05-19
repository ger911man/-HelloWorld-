
public class method_receives_random_number_of_args {
	public static void main(String args[]){
		printNumbers(1,2,3,4,5,6,7,8);
	}	
	public static void printNumbers(int...nums){
		for(int n:nums){
			System.out.print(n+"\t");
		}
	}
}
