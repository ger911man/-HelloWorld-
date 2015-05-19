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



public class gui2_class extends JFrame{
	
	private JLabel t1;
	private JTextField textf1;
	private JTextField textf2;
	private JTextField textf3;
	private JPasswordField passf1;
	
	
	public gui2_class(){
		super("Geras prog title");
		setLayout(new FlowLayout());
		
		t1 = new JLabel("just a text");
		add(t1);
		
		textf1 =new JTextField(10);
		textf1.setToolTipText("toltip text(popup text)");
		add(textf1);
		
		textf2 =new JTextField("Enter some text");
		add(textf2);
		
		textf3 =new JTextField("Unaditable",20);
		textf3.setEditable(false);
		add(textf3);
		
		passf1 = new JPasswordField("add some pass"); 
		add(passf1);
		
		
		theHandler handler = new theHandler(); 
		
		textf1.addActionListener(handler);
		textf2.addActionListener(handler);
		textf3.addActionListener(handler);
		passf1.addActionListener(handler);		
		
	}
	
	private class theHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			String str = "";
			
			if (event.getSource()==textf1){
				str=String.format("F 1: %s", event.getActionCommand());
			}else if(event.getSource()==textf2){
				str=String.format("F 2: %s", event.getActionCommand());
			}else if(event.getSource()==textf3){
				str=String.format("F 3: %s", event.getActionCommand());
			}else if(event.getSource()==passf1){
				str=String.format("Pass: %s", event.getActionCommand());
			}
			
			JOptionPane.showMessageDialog(null, str);
			
		}
	}
}
