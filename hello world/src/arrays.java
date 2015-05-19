
public class arrays {
	public static void main(String[] args) {
		int days_in_month[] = new int[12];
		int i,j,k,n;
		String[] month_names = {"yanvar", "fevral", "mart", "aprel", "may", "iun", "iul", "august", "sentabr", "oktabr", "noyabr", "decabr" };
		
		for(String ss: month_names){
			System.out.print(ss+"\t");
		}
		System.out.println("");
		
		//int days_in_month[] = new int[12];
		//int[] days_in_month, engl, ukr = new int[12];
		for(i=0;i<month_names.length;i++){
			if ( (i&1) == 0 ){
				days_in_month[i]=31;
			}else{
				days_in_month[i]=30;
			}
			
			if (i==1) days_in_month[i]=28;
		}
		
		
		
		
		
		
		for (i=0;i<=11;i++){
			System.out.println(month_names[i]+" = "+days_in_month[i]);
		}
		
		System.out.println("***********************************************");
		
		k=10;
		
		int array[][]=new int[12][6];
		for(j=0;j<6;j++){
			for(i=0;i<12;i++){
				array[i][j]=k;
				k++;
				System.out.print(" "+array[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("***********************************************");
		
		k=0;
		int triangle_array[][] = new int[4][];
		for(j=0;j<4;j++){
			triangle_array[j] = new int[(j+1)];
			for(i=0;i<=j;i++){
				triangle_array[j][i]=k;
				k++;
				System.out.print(" "+triangle_array[j][i]);
			}
			System.out.println();
		}
		
		System.out.println("***********************************************");
		
		n=0;
		int[][][] tripple_array = new int[5][4][3];
		for (k=0;k<3;k++){
			for(j=0;j<4;j++){
				for(i=0;i<5;i++){
					tripple_array[i][j][k]=++n;
					System.out.print(tripple_array[i][j][k]+" ");
				}
				System.out.println("");
			}
			System.out.println("");
		}
		
		int massRow[][] = {{11,12,13,14},{21,22},{31,32,33}};
		for (i=0;i<massRow.length;i++){
			for(j=0;j<massRow[i].length;j++){
				System.out.print(massRow[i][j]+"\t");
			}
			System.out.println("");
		}
		
		
		
	}
}
