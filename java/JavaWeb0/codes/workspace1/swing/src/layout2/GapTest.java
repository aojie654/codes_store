package layout2;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class GapTest {
 public static void main(String[] args) {
  JFrame f=new JFrame();
  //边缘空50
  //((JPanel)f.getContentPane()).setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
  //水平间隔120，垂直间隔80
  
  JPanel p1  = new JPanel();
  JPanel p  = new JPanel();
  p.setLayout(new GridLayout(3,3,50,50));
  f.setSize(800,600);
  for(int i=0; i<7; i++){
   p.add(new JButton("bt "+String.valueOf(i+1)));
  }
  p1.add(p);
  f.add(p1);
  
  f.setVisible(true);
 }
}