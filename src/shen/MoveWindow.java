package shen;

import java.awt.Graphics;  
import java.awt.Image;  
import java.awt.Point;  
import java.awt.event.MouseAdapter;  
import java.awt.event.MouseEvent;  
import java.net.URL;  
  
import javax.swing.ImageIcon;  
import javax.swing.JFrame;  
import javax.swing.JPanel;  
  
//import com.sun.awt.AWTUtilities;  
  
import shen.Panel.FadeOut;  
  
public class MoveWindow extends MouseAdapter {  
  
    private Point last;  
    private JFrame frame;  
  
    public MoveWindow(JFrame frame) {  
        this.frame = frame;  
    }  
  
    public void mousePressed(MouseEvent e) {  
        last = e.getLocationOnScreen();  
    }  
  
    public void mouseReleased(MouseEvent e) {  
        Point point = e.getLocationOnScreen();  
        Point fPoint = frame.getLocation();  
        frame.setLocation(fPoint.x + point.x - last.x, fPoint.y + point.y  
                - last.y);  
        last = point;  
    }  
  
}  