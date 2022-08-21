package eventhandling;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.MathContext;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EventHandling extends JFrame{
JButton btn1,btn2,btn;
    public EventHandling(){
        setSize(500, 300);
        setLayout(new FlowLayout());
         btn = new JButton("Next");
         btn1 = new JButton("Previous");
         JPanel cpanel = new JPanel(new FlowLayout());
         cpanel.setBackground(Color.BLACK);
         cpanel.add(btn);
         cpanel.add(btn1);
         JLabel lbl = new JLabel();
         lbl.setBounds(10, 10,400, 250);
         ImageIcon ico = new ImageIcon("C:\\Users\\hidaya\\Desktop\\bf.jpg");
         Image img = ico.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT);
         lbl.setIcon(new ImageIcon(img));
         
      add(cpanel);
      
      final JPanel jp = new JPanel(new CardLayout());
      jp.setSize(400,250);
      JPanel p1 = new JPanel();
      p1.setBackground(Color.RED);
      p1.add(lbl);
      JPanel p2 = new JPanel();
       p2.setBackground(Color.BLUE);
     JPanel p3 = new JPanel();
      p3.setBackground(Color.BLACK);
      JPanel p4 = new JPanel();
     p4.setBackground(Color.PINK);  
     jp.add(p1);
     jp.add(p2);
     jp.add(p3);
     jp.add(p4);
     add(jp);
      
    btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) jp.getLayout();
                cl.next(jp);
            }
        });
    
     btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) jp.getLayout();
                cl.previous(jp);
            }
        });
     
      
      
      
        
        
        setVisible(true); 
            
    }

    public static void main(String[] args) {
              new EventHandling();
    }

    
}
