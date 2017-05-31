/*<applet code="calc.class" height=150 width=700></applet>*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calc extends Applet implements ActionListener
{
    JPanel p1,p2;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;
   
    
    public void init()
    {
        p1 = new JPanel();
        p2 = new JPanel();
        
        p1.setBackground(Color.green);
        p2.setBackground(Color.gray);
        
        setBackground(Color.lightGray);
        
        l1 = new JLabel("Enter the first number");
        p1.add(l1);
        
        t1 = new JTextField(10);
        p1.add(t1);
        
        l2 = new JLabel("Enter the second number");
        p1.add(l2);
        
        t2 = new JTextField(10);
        p1.add(t2);
        
        l3 = new JLabel("Result");
        p2.add(l3);
        
        t3 = new JTextField(10);
        p2.add(t3);
        
       
        
        
        
        
        b1 = new JButton("add");
        p2.add(b1);
        
        b1.addActionListener(this);
        
        b2 = new JButton("sub");
        p2.add(b2);
        
        b2.addActionListener(this);
        
        b3 = new JButton("Mul");
        p2.add(b3);
        
        b3.addActionListener(this);
        
        b4 = new JButton("Div");
        p2.add(b4);
        
        b4.addActionListener(this);
        
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        
        t1.setBackground(Color.yellow);
        t2.setBackground(Color.yellow);
        t3.setBackground(Color.yellow);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        try{
            if(ae.getSource() == b1){
                int x = Integer.parseInt(t1.getText());
                int y = Integer.parseInt(t2.getText());
                int sum = x+y;
                
                t3.setText(" " + sum);
            }
        } catch(Exception e ){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}