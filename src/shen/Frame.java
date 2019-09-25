package shen;
import java.awt.EventQueue;


import javax.swing.JFrame;  
  
  
//import com.sun.awt.AWTUtilities;  
  
public class Frame extends JFrame {  
  
    private static final long serialVersionUID = 7517576070147366983L;  
  
    public Frame() {  
        setTitle("PNGÍ¸Ã÷´°Ìå");  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setUndecorated(true);  
        setSize(666, 666);  
        setLocationRelativeTo(null);  
        //AWTUtilities.setWindowOpaque(this, false);  
        setContentPane(new Panel(this));  
        addMouseListener(new MoveWindow(this));  
    }  
  
    public static void main(String[] args) {  
        EventQueue.invokeLater(new Runnable() {  
            @Override  
            public void run() {  
                new Frame().setVisible(true);  
            }  
        });  
    }  
}  