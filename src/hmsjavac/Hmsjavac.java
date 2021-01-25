
package hmsjavac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Hmsjavac extends JFrame implements ActionListener {
    Hmsjavac(){
        setBounds(300,300,1471,984);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hmsjavac/icons/Group 1.jpg"));
        JLabel li = new JLabel(i1);
        li.setBounds(0,0,1471,984);
        add(li);
        
        JButton b1 = new JButton("Next");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(1030,600,140,30);
        b1.addActionListener(this);
        li.add(b1);
        
        
        
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        new Login().setVisible(true);
        this.setVisible(false);
    }

    
    public static void main(String[] args) {
        new Hmsjavac();
      
    }
    
}
