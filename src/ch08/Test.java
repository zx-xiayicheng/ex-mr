package ch08;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Test extends JFrame{

	public void creatJFrame(String title){

		JFrame jf=new JFrame(title);

		Container container=jf.getContentPane();

		JLabel label=new JLabel("你是不是喜欢我？"); 

		//设置标签文字居中

		label.setHorizontalAlignment(SwingConstants.CENTER);

		JButton btnY=new JButton("是");

		JButton btnN=new JButton("不是");

		//添加按钮监听事件

		btnN.addActionListener(new ActionListener(){

 

			@Override

			public void actionPerformed(ActionEvent arg0) {

				// TODO Auto-generated method stub

				label.setText("喜欢就直接说嘛。");

			}

			

		});

		btnY.addActionListener(new ActionListener(){

 

			@Override

			public void actionPerformed(ActionEvent arg0) {

				// TODO Auto-generated method stub

				label.setText("喜欢就直接说嘛。");

			}

			

		});

		btnN.addMouseListener(new MouseListener(){

			//鼠标点击、移上、移出、松开事件

			@Override

			public void mouseClicked(MouseEvent arg0) {

				// TODO Auto-generated method stub

			}

 

			@Override

			public void mouseEntered(MouseEvent arg0) {

				// TODO Auto-generated method stub

				btnN.setText("是");

				

			}

 

			@Override

			public void mouseExited(MouseEvent arg0) {

				// TODO Auto-generated method stub

				btnN.setText("不是");

				

			}

 

			@Override

			public void mousePressed(MouseEvent arg0) {

				// TODO Auto-generated method stub

			}

 

			@Override

			public void mouseReleased(MouseEvent arg0) {

				// TODO Auto-generated method stub

				

			}

			

		});

		btnY.setBounds(30, 100, 80, 30);

		btnN.setBounds(158, 100, 80, 30);

		container.add(btnY);

		container.add(btnN);

		container.add(label);

		jf.setSize(300, 200);

		jf.setVisible(true);

		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);

		jf.addWindowListener(new MyWindowListener());

	}

	public static void main(String[] args) {

		new Test().creatJFrame("回答我：");

	}

 

}