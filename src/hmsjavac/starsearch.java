
package hmsjavac;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class starsearch extends JFrame implements ActionListener {
    
    JTextField t1;
    JButton b1,b2,b3,b4,b5;
    
    starsearch(){
        
        JLabel l1 = new JLabel("Search By Star");
        l1.setFont(new Font("Tahoma", Font.BOLD, 10));
        l1.setBounds(232,20,100,20);
        add(l1);
        
        
        
        
        b1 = new JButton("ONE STAR");
        b1.setBounds(200,80,150,30);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("TWO STAR");
        b2.setBounds(200,140,150,30);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("THREE STAR");
        b3.setBounds(200,200,150,30);
        b3.addActionListener(this);
        add(b3);
        
        b4 = new JButton("FOUR STAR");
        b4.setBounds(200,260,150,30);
        b4.addActionListener(this);
        add(b4);
        
        b5 = new JButton("FIVE STAR");
        b5.setBounds(200,320,150,30);
        b5.addActionListener(this);
        add(b5);
        
        setBounds(450,200,800,500);
        setLayout(null);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            new onestarhotels().setVisible(true);
            
        }else if(ae.getSource()==b2){
            new twostarhotels().setVisible(true);
            
        }else if(ae.getSource()==b3){
            new threestarhotels().setVisible(true);
            
        }else if(ae.getSource()==b4){
            new fourstarhotels().setVisible(true);
            
        }else if(ae.getSource()==b5){
            new fivestarhotels().setVisible(true);
            
        }
        
                
    
    }
    
    
    
    public static void main(String[] args){
        new starsearch().setVisible(true);
    }
    
}
