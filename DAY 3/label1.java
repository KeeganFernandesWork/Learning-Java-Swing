import javax.swing.*;
class label1{
  public static void main(String args[]){
    JFrame f = new JFrame("Label");
    JLabel l1,l2;
    l1 = new JLabel("first label");
    l1.setBounds(50,50, 100,100);
    f.add(l1);
    f.setSize(300,300);
    f.setLayout(null);
    f.setVisible(true);
  }
}
