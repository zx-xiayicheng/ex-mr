package ch08;

import java.awt.*;

import java.awt.event.*;

 

import javax.swing.*;

//定义WindowListener事件

class MyWindowListener extends WindowAdapter{

	//窗体关闭过程中触发函数

	public void windowClosing(WindowEvent e){

		new MyJDialog().setVisible(true);

		System.exit(0);;

	}

}

//定义关闭窗体时需要弹出的对话框

class MyJDialog extends JDialog{

	public MyJDialog(){

		super(new JFrame(),"提示：",true);

		Container c=getContentPane();

		JLabel label=new JLabel("你以为关闭就能回避这个话题吗？");

		label.setHorizontalAlignment(SwingConstants.CENTER);

		JButton btnY=new JButton("是");

		JButton btnN=new JButton("不是");

		//添加按钮监听事件

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

		btnY.setBounds(30, 100, 80, 30);

		btnN.setBounds(158, 100, 80, 30);

		c.add(btnY);

		c.add(btnN);

		c.add(label);

		setSize(300, 200);

	}

}