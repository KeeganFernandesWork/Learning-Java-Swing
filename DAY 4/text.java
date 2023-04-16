import javax.swing.*;
class text{
  public static void main(String args[]){
    JFrame f = new JFrame("TextField Example");
    JTextField t1;
    t1 = new JTextField("Welcome to javatpoint");
    t1.setBounds(50,100,200,30);
    f.add(t1);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
  }
}
