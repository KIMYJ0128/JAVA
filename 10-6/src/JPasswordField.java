import javax.swing.*;
import java.awt.*;

public class JPasswordField extends JFrame {
	public JPasswordField() {
		setTitle("�ؽ�Ʈ�ʵ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("Enter the password : "));
		c.add(new JTextField(20)); // â�� �� ���� 20
		
		setSize(400,100);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new JPasswordField();
	}
} 