import javax.swing.*;
import java.awt.*;

public class JPasswordField extends JFrame {
	public JPasswordField() {
		setTitle("텍스트필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("Enter the password : "));
		c.add(new JTextField(20)); // 창의 열 개수 20
		
		setSize(400,100);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new JPasswordField();
	}
} 