//include java.package.ra

public class method_receives_array {
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6,7,8,9};
		incrIntArray(arr);
		
		//it actually changes array
		for(int i:arr){
			System.out.print(i+"\t");
		}
		
	}
	
	public static void incrIntArray(int arr[]){
		for(int i:arr){
			System.out.print(i+"\t");
			
		}
		System.out.println("");
		for(int i=0;i<arr.length;i++){
			arr[i]++;
		}
		for(int i:arr){
			System.out.print(i+"\t");
		}
		System.out.println("");
		
	}
	
}
