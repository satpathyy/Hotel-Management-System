
package hmsjavac;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class dashboard extends JFrame implements ActionListener {
    
    JMenuBar mb;
    JMenu m1,m2;
    JMenuItem i1,i2,i3,i4;
    
    dashboard(){
        
        mb = new JMenuBar();
        add(mb);
        
        m1 = new JMenu("Search Hotels");
        m1.setForeground(Color.WHITE);
        mb.add(m1);
        
        m2 = new JMenu("Admin");
        m2.setForeground(Color.WHITE);
        mb.add(m2);
        
        i1 = new JMenuItem("Search By Star");
        i1.addActionListener(this);
        m1.add(i1);
        
        i2 = new JMenuItem("Search By Name");
        i2.addActionListener(this);
        m1.add(i2);
        
        i3 = new JMenuItem("Add Hotel");
        i3.addActionListener(this);
        m2.add(i3);
        
        i4 = new JMenuItem("Cancel Booking");
        m2.add(i4);
        
        
        
        mb.setBounds(120,120,350,30);
        setLayout(null);
        setBounds(500,300,600,300);
        setVisible(true);
    
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Search By Star")){
        new starsearch().setVisible(true);
            
        }else if(ae.getActionCommand().equals("Add Hotel")){
            new addhotel().setVisible(true);
            
            
        }else if(ae.getActionCommand().equals("Search By Name")){
            new namesearch().setVisible(true);
    }
    
        
    
    
}

    public static void main(String[] args){
        new addhotel().setVisible(true);
        
    }
}
    
    
    
   
        
    
    
        
        
        
  