package shen;

import java.awt.Graphics;  
import java.awt.Image;  
import java.awt.event.MouseAdapter;  
import java.awt.event.MouseEvent;  
import java.net.URL;  
  
import javax.swing.ImageIcon;  
import javax.swing.JFrame;  
import javax.swing.JPanel;  
  
//import com.sun.awt.AWTUtilities;  
import com.wanju.blessing.ShowFrame;  
  
public class Panel extends JPanel{  
  
    private Image background;  
    JFrame frame = null;  
    public JFrame getFrame() {  
        return frame;  
    }  
  
    public void setFrame(JFrame frame) {  
        this.frame = frame;  
    }  
  
    public Panel(JFrame frame){  
        this.frame = frame;  
        try {  
//          background = ImageIO.read(new File("D:\\workspace\\maven\\blessing\\src\\shen\\window.png"));  
//          background = ImageIO.read(new File("D:\\workspace\\maven\\blessing\\src\\shen\\b.jpg"));  
            URL url=Panel.class.getResource("c.jpg");    
            ImageIcon icon = new ImageIcon(url);  
            background = icon.getImage() ;  
//          background = ImageIO.read(new File("D:\\workspace\\maven\\blessing\\src\\shen\\b.jpg"));  
            this.addMouseListener(new MouseAdapter() {  
                @Override  
                public void mouseClicked(MouseEvent e) {  
                    super.mouseClicked(e);  
                    new FadeOut(Panel.this.frame).start();  
                      
                }  
            });  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
      
     class FadeOut extends Thread {  
        private JFrame wnd;  
        public FadeOut(JFrame wnd) {  
            this.wnd = wnd;  
        }  
        public void run() {  
            try {  
                for (int i = 50; i > 0; i--) {  
                    Thread.sleep(50);  
                    //AWTUtilities.setWindowOpacity(wnd, i / 50f);  
                }  
            } catch (Exception ex) {  
                ex.printStackTrace();  
            }  
            wnd.setVisible(false);  
            wnd.dispose();  
            new ShowFrame();  
        }  
    }  
      
    protected void paintComponent(Graphics g) {  
        super.paintComponent(g);  
        g.drawImage(background,0,0,666,666,null);  
    }  
}  