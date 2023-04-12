import java.awt.event.*;
import javax.swing.*;
public class button extends JFrame{

  public static void main(String[] args) {
    new button();
  }

  public button(){
    int counter = 0;
    JFrame f = new JFrame("Click Counter");
    JTextField text = new JTextField();
    text.setBounds(50,50,150,10 );
    JButton b = new JButton("+1");
    b.setBounds(50,100,95,30);
    b.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        text.setText(Integer.toString(counter));
      }
    });
    f.add(b);
    f.add(text);
    f.setSize(500,500);
    f.setVisible(true);
    f.setLayout(null);

  }
}
