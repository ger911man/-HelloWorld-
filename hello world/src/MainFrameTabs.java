import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;

public class MainFrameTabs {

 private JFrame frame;
 private JScrollPane scrollPane;
 private JTabbedPane tabbedPane;

 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     MainFrameTabs window = new MainFrameTabs();
     window.frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 /**
  * Create the application.
  */
 public MainFrameTabs() {
  initialize();
 }

 /**
  * Initialize the contents of the frame.
  */
 private void initialize() {
  frame = new JFrame();
  frame.setBounds(100, 100, 450, 300);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.getContentPane().setLayout(new MigLayout("", "[217px]", "[237px]"));
  
  JTabbedPane jtp = new JTabbedPane();
   jtp.addTab("first", new JLabel ("Hello, Gera!"));
   jtp.addTab("second", new JLabel ("FOF, mizerable"));
   
  frame.getContentPane().add(jtp, "grow");
 }

} 