import javax.swing.*;
import javax.swing.event.*;

public class JSpinnerTest {
     public static void main(String[] args) {
     JFrame f=new JFrame("스피너 예제");
     JLabel lb= new JLabel();
     lb.setHorizontalAlignment(JLabel.CENTER);
     lb.setSize(250,100);
     SpinnerNumberModel value = new SpinnerNumberModel(5, 0, 10, 1);
     JSpinner spin = new JSpinner(value);
     spin.setBounds(100,100,50,30);
     f.add(spin); f.add(lb);
     f.setSize(300, 300);
     f.setLayout(null);
     f.setVisible(true);
     spin.addChangeListener(new ChangeListener() {
     public void stateChanged(ChangeEvent e) {
     lb.setText("현재 값 : " + ((JSpinner)e.getSource()).getValue());
     }
   });
 }
}
  
      