import javax.swing.*;  
public class Simple2 extends JFrame{//inheriting JFrame  
JFrame f;  
Simple2(){  
JButton b=new JButton("click");//create button  
b.setBounds(130,100,100, 40); //setting the x-axis,y-axis,height,width 
          
add(b);//adding button on frame  
setSize(400,500);//Setting the size of the window
setLayout(null);//using the layout managers  
setVisible(true); //making the frame visible
}  
public static void main(String[] args) {  
new Simple2();  // creating a object of class simple
}}  
