import javax.swing.JOptionPane;

public class guis {
	public static void main(String args[]){
		
		String fn = JOptionPane.showInputDialog("Enter first NUM=");
		String sn = JOptionPane.showInputDialog("Enter second NUM=");
		int n1 = Integer.parseInt(fn);
		int n2 = Integer.parseInt(sn);
		int sum = n1 + n2;
		
		JOptionPane.showMessageDialog(null, "Summ is:" + sum , "CALC",0);
		JOptionPane.showMessageDialog(null, "Summ is:" + sum , "CALC",1);
		JOptionPane.showMessageDialog(null, "Summ is:" + sum , "CALC",2);//showMessageDialog(null,"Sum is:"+sum,"ssss");
		JOptionPane.showMessageDialog(null, "Summ is:" + sum , "CALC",3);
		
		
	}
	
}
