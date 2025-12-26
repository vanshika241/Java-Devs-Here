import java.awt.*;

import javax.swing.*;
public class Basics{
   public static void main(String[] args) {
       //Frame 
       JFrame frame = new JFrame("Hello Lavi");
       frame.setSize(400 , 400);
       frame.setLayout(null);
       frame.setVisible(true);
       frame.getContentPane().setBackground(Color.GREEN);

       //Labels 
       JLabel l1Name = new JLabel("Enter your name");
       l1Name.setBounds(50 , 60 , 300 , 75);
       l1Name.setForeground(Color.BLUE);
       frame.add(l1Name);

       //TextField 
       JTextField lwrite = new JTextField("Enter name");
       lwrite.setBounds(60 , 140 , 300 , 50);
       frame.add(lwrite);

       //JTextArea
       JTextArea msg = new JTextArea("Write your feedback");
       msg.setBounds(60 , 210 , 300 , 100);
       JScrollPane sp = new JScrollPane(msg);
sp.setBounds(60, 210, 300, 100);

       frame.add(sp);

       JButton submit = new JButton("Submit");
       submit.setBounds(100 , 340 , 100 , 30);
       frame.add(submit);



   }

}