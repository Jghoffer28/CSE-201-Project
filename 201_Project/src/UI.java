import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.*;


public class UI extends JFrame {
/**
 * Available
 */
	private JFrame frame;//Background structure
	private ToolSurface surface;// surface
	
	//menu part
	private JMenuBar bar;//Menu
	private JMenu menu;//a menu button called menu
	private JMenuItem[] items;//context which menu have
	
	//Button part
	private Button DNA,RNA;
	
	public UI() {
		createGUI();
	}
	private void createGUI() {
		frame = new JFrame("Bioinformatic Toolkit");
		bar = new JMenuBar();
		menu = new JMenu("Menu");
		items = new JMenuItem[2];
		menu.add(items[0] = new JMenuItem("Restart"));
		menu.add(items[1] = new JMenuItem("Close"));
	
	}
	
			
	public void start() {
		//submit.addActionListener(this);
	    DNA = new Button("DNA");
		JLabel inputD = new JLabel("Enter your DNA Align");
		JButton submit = new JButton("Submit");
		TextField DNAInput = new TextField(13);
		JLabel outputD = new JLabel("Align for your DNA");
		JTextField showD = new JTextField(13);
		
		RNA = new Button("RNA");
		RNA.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		JLabel inputR = new JLabel("Enter your RNA Align");
		TextField RNAInput = new TextField(13);
		JLabel outputR = new JLabel("Align for your RNA");
		JTextField showR = new JTextField(10);
			}
			
			
		});
		
				frame.add(DNA);
				frame.add(inputD);
				frame.add(outputD);
				frame.add(showD);
				frame.add(submit);
				
				frame.add(RNA);
				//frame.add(inputR);
				//frame.add(outputR);
				//frame.add(showR);
				//frame.add(submit);
				
				frame.setLayout(new FlowLayout());
				frame.setSize(500,500);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		UI UIsurface = new UI();
		UIsurface.start();
	}
	public class ToolSurface extends JPanel{
		
	}
}
		
	
	

		//String str = DNA1.getText();// ��password�ı����е��ַ�ȡ������str�С�
		//JButton jb = (JButton) e.getSource();// ��ð�ť�¼����¼�Դ
		//if (jb == submit) {// �����submit��ť
		//System.out.println(1);
		//}
		//if (jb == reset) {// �����reset��ť
		//password.setText(null);// �ı������
		//show.setText(null);
		//items[0].addActionListener(new ActionListener() {  
          //  public void actionPerformed(ActionEvent e) {  
               // String str = "�Ƿ�Ҫ���¿�ʼ��Ϸ?";  
                // �����Ϣ�Ի���  
              //  if (JOptionPane.showConfirmDialog(null, str, "���¿�ʼ",  
              //          JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {  
                    //clearMap(); // �������  
                //    surface.repaint(); // ˢ������        

	
