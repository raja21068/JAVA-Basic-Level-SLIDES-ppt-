import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Panel;
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
      String[] s = {"label1", "label2", "label3", "label4", "label5", "lbl6"};
      
      for(String l : s){
          
          JPanel p = new JPanel();
          JLabel lb = new JLabel(l);
          p.add(lb);
          jp.add(p);
      
      }
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
