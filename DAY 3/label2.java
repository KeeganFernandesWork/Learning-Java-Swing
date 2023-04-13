import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class label2 extends Frame implements ActionListener{
  JTextField tf;
  JLabel l;
  JButton b;
  label2(){
    tf = new JTextField();
    tf.setBounds(50,50,150,20);
    l = new JLabel();
    l.setBounds(70,70,700,49);
    b = new JButton("Find IP");
    b.setBounds(50,100,250,20);
    b.addActionListener(this);
    add(b);
    add(tf);
    add(l);
    setSize(800,800);
    setLayout(null);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e) {
    try{
      String host = tf.getText();
      String ip = java.net.InetAddress.getByName(host).getHostAddress();
      l.setText("IP of "+host+" is "+ip);
    }
    catch(Exception ex){System.out.println(ex);}
  }
  public static void main(String[] args) {
    new label2();
  }
}
