import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComponentEx extends JFrame {
	public JComponentEx() {
		super("JComponent�� ���� �޼ҵ� ����");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b3 = new JButton("��ư");
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				JComponentEx frame = (JComponentEx)b.getTopLevelAncestor();
				frame.setTitle(b.getX() + "," + b.getY()); 
			}
		});
		 c.add(b3); 
		
		setSize(260,200); 
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JComponentEx();
	}
}