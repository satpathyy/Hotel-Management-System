
package hmsjavac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class addhotel extends JFrame implements ActionListener {
    
    JTextField t1,t2,t3,t4;
    JButton b1;
    
    addhotel(){
        JLabel name = new JLabel("NAME");
        name.setBounds(60,30,120,30);
        add(name);
        
        t1 = new JTextField();
        t1.setBounds(200,30,150,30);
        add(t1);
        
        JLabel address = new JLabel("ADDRESS");
        address.setBounds(60,80,120,30);
        add(address);
        
        t2 = new JTextField();
        t2.setBounds(200,80,150,30);
        add(t2);
        
        
        JLabel totalrooms = new JLabel("TOTAL ROOMS");
        totalrooms.setBounds(60,130,120,30);
        add(totalrooms);
        
        t3 = new JTextField();
        t3.setBounds(200,130,150,30);
        add(t3);
        
        JLabel stars = new JLabel("ENTER STAR");
        stars.setBounds(60,180,120,30);
        add(stars);
        
        t4 = new JTextField();
        t4.setBounds(200,180,150,30);
        add(t4);
        
        b1 = new JButton("ADD");
        b1.setBounds(200,230,150,30);
        b1.addActionListener(this);
        add(b1);
       
        
        setLayout(null);
        setBounds(400,200,600,400);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String name = t1.getText();
        String address = t2.getText();
        String totalrooms = t3.getText();
        String stars = t4.getText();
        
        conn e = new conn();
        
        String str = "insert into hotel values('"+name+"','"+address+"','"+totalrooms+"','"+stars+"')";
        try{
            e.s.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "New Hotel Added");
            this.setVisible(false);
            
            
        }catch(Exception c){
            System.out.println(c);
               
           
            
        }
    }
    
    public static void main(String[] args){
        new addhotel().setVisible(true);
    
   
    }
    
}
