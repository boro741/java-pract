import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class factj extends Applet implements ActionListener
{
    Label l1,l2;
    TextField t1,t2;
    Button b1,b2;
    
    public void init()
    {
        l1 = new Label("Enter a value: ");
        l2 = new Label("Result: ");
        
        t1 = new TextField(10);
        t2 = new TextField(10);
        
    
        b1 = new Button("Calucate");
        b2 = new Button("Clear");
        
       add(l1);
       add(t1);
        
       add(l2);
       add(t2);
        
        add(b1);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        int n = Integer.parseInt(t1.getText());
        int fact = 1;
        
        if(ae.getSource() == b1){
            if(n==0 || n == 1){
                fact = 1;
                t1.setText(String.valueOf(fact));
            }else if(ae.getSource() == b2){
                t1.setText("  ");
                t2.setText("  ");
                
            }else{
                for(int i=1; i<=n;i++){
                    fact *= i;
                }
                t2.setText(String.valueOf(fact));
            }
        }
    }
}

/*<applet code="factj.class" height=300 width=300></applet>*/