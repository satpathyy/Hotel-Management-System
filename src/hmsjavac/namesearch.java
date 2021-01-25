package hmsjavac;
import javax.swing.*;
import java.awt.*;



public class namesearch extends JFrame {
    
    JTextField t1;
    JButton b1;
    
    namesearch(){
        
        JLabel l1 = new JLabel("Search By Name");
        l1.setFont(new Font("Tahoma", Font.BOLD, 10));
        l1.setBounds(200,20,100,20);
        add(l1);
        
        
        JLabel address = new JLabel("Enter Name");
        address.setBounds(60,80,120,30);
        add(address);
        
        t1 = new JTextField();
        t1.setBounds(200,80,150,30);
        add(t1);
        
        b1 = new JButton("Search Hotels");
        b1.setBounds(200,180,150,30);
        add(b1);
        
        setBounds(450,200,1000,500);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new namesearch().setVisible(true);
    }
    
}