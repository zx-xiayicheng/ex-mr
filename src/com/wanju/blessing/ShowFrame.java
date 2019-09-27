package com.wanju.blessing;
import java.awt.Color;  
import java.awt.Container;  
import java.awt.Dimension;  
import java.awt.Font;  
import java.awt.Graphics;  
import java.awt.Image;  
import java.awt.Toolkit;  
import java.awt.event.MouseAdapter;  
import java.awt.event.MouseEvent;  
import java.net.URL;  
  
import javax.swing.ImageIcon;  
import javax.swing.JFrame;  
import javax.swing.JPanel;  
  
import shen.Panel;  
  
//import com.sun.awt.AWTUtilities;  

public class ShowFrame extends JFrame {  
	  
    public ShowFrame() {  
        this.setSize(600, 500);  
  
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();  
        Dimension frameSize = this.getSize();  
        this.setUndecorated(true);  
        this.setLocation((screenSize.width - frameSize.width) / 2,  
                (screenSize.height - frameSize.height) / 2);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        Container container = this.getContentPane();  
       // AWTUtilities.setWindowOpaque(this, true);  
        //AWTUtilities.setWindowOpacity(this, 0.01f);  
        container.add(new MyPanel(this));  
        this.setBackground(null);  
        this.setVisible(true);  
        new FadeOut(this).start();  
    }  
  
    public static void main(String[] args) {  
        ShowFrame showFrame = new ShowFrame();  
    }  
}  
class MyPanel extends JPanel{  
    private Image background;  
    JFrame frame;  
    public MyPanel(final JFrame frame){  
        this.frame = frame;  
        try {  
            URL url=Panel.class.getResource("a.jpg");    
            ImageIcon icon = new ImageIcon(url);  
            background = icon.getImage() ;  
//          background = ImageIO.read(new File("D:\\workspace\\maven\\blessing\\src\\shen\\b.jpg"));  
            this.addMouseListener(new MouseAdapter() {  
                @Override  
                public void mouseClicked(MouseEvent e) {  
                    super.mouseClicked(e);  
//                  new FadeOut(MyPanel.this.frame).start();  
                    frame.setVisible(false);  
                    frame.dispose();  
                }  
            });  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
    protected void paintComponent(Graphics g) {  
        super.paintComponent(g);  
        g.drawImage(background,0,0,666,666,null);  
        g.setColor(Color.red);  
        g.setFont(new Font("", Font.BOLD, 15));  
          
          
          
          
        g.drawString("ףԸ������Զ�Ҹ����񻨶�һ��", 60, 280);  
    }  
      
      
}  
class FadeOut extends Thread {  
    private JFrame wnd;  
    public FadeOut(JFrame wnd) {  
        this.wnd = wnd;  
    }  
    public void run() {  
        try {  
            for (int i = 0; i < 50; i++) {  
                Thread.sleep(50);  
              //  AWTUtilities.setWindowOpacity(wnd, i / 50f);  
            }  
              
        } catch (Exception ex) {  
            ex.printStackTrace();  
        }  
    }  
}  