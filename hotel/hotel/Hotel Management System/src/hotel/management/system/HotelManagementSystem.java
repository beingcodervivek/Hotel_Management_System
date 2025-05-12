
package hotel.management.system;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class HotelManagementSystem extends JFrame implements ActionListener {

    HotelManagementSystem(){
//        setSize(1366,565);
//        setLocation(100,100);
        setBounds(100,100,1366,565);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/p1.jpg"));
        JLabel image = new JLabel(i1);
        add(image);
        JLabel text = new JLabel("HOTEL MANAGEMENT SYSTEM");
        text.setBounds(20,430 , 1000, 90);
        image.add(text);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("serif",Font.PLAIN,50));
        image.setBounds(0,0,1366,566);
        
        JButton next = new JButton("NEXT");
        next.setBounds(1150,450,150,50);
        next.setBackground(Color.WHITE);
        next.addActionListener(this);
        text.setFont(new Font("serif",Font.PLAIN,24));
        image.add(next);
        
        setVisible(true);
        
        while(true){
            text.setVisible(false);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
            text.setVisible(true);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args) {
        new HotelManagementSystem();
        
    }
    
}
