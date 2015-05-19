import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;


public class gui2_class_btn extends JFrame{
	private JButton b1;
	private JButton imgb1;

	public gui2_class_btn(){
		super("Geras buttoned prog title ");
		setLayout(new FlowLayout());
		
		b1 = new JButton("regular buton");
		add(b1);
		
		Icon geraIcon = new ImageIcon(getClass().getResource("gera.png"));
		Icon geraIconRollover = new ImageIcon(getClass().getResource("geraRollover.png"));
		imgb1 = new JButton("custom buton",geraIcon);
		imgb1.setRolloverIcon(geraIconRollover);
		
		add(imgb1);
		
		theHandler handler = new theHandler(); 
		
		b1.addActionListener(handler);
		imgb1.addActionListener(handler);		
	}
	
	private class theHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			String str = "";
			
			/*
			if (event.getSource()==b1){
				str=String.format("b1: %s", event.getActionCommand());
			}else if(event.getSource()==imgb1){
				str=String.format("F 2: %s", event.getActionCommand());
			}*/
			
			JOptionPane.showMessageDialog(null, str);
		}	
		
	
	}
}

	
	
	









	
	
