import javax.swing.*;
public class window extends JFrame //Inferiting from Jframe class
{
  JFrame f;
  window(){
    JButton b = new JButton("click"); // Creating a button
    b.setBounds(130,100,100,40); // setting the a-axis,y-axis,width height 
    add(b);
    setSize(300,400);
    setLayout(null);
    setVisible(true);
  }
  public static void main(String[] args){
    new window();
  }
}
