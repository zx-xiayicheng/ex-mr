package ch08;

import java.awt.*;

import java.awt.event.*;

 

import javax.swing.*;

//����WindowListener�¼�

class MyWindowListener extends WindowAdapter{

	//����رչ����д�������

	public void windowClosing(WindowEvent e){

		new MyJDialog().setVisible(true);

		System.exit(0);;

	}

}

//����رմ���ʱ��Ҫ�����ĶԻ���

class MyJDialog extends JDialog{

	public MyJDialog(){

		super(new JFrame(),"��ʾ��",true);

		Container c=getContentPane();

		JLabel label=new JLabel("����Ϊ�رվ��ܻر����������");

		label.setHorizontalAlignment(SwingConstants.CENTER);

		JButton btnY=new JButton("��");

		JButton btnN=new JButton("����");

		//��Ӱ�ť�����¼�

		btnN.addMouseListener(new MouseListener(){

			//����������ϡ��Ƴ����ɿ��¼�

			@Override

			public void mouseClicked(MouseEvent arg0) {

				// TODO Auto-generated method stub

			}

 

			@Override

			public void mouseEntered(MouseEvent arg0) {

				// TODO Auto-generated method stub

				btnN.setText("��");

				

			}

 

			@Override

			public void mouseExited(MouseEvent arg0) {

				// TODO Auto-generated method stub

				btnN.setText("����");

				

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

		//��Ӱ�ť�����¼�

				btnN.addActionListener(new ActionListener(){

 

					@Override

					public void actionPerformed(ActionEvent arg0) {

						// TODO Auto-generated method stub

						label.setText("ϲ����ֱ��˵�");

					}

					

				});

				btnY.addActionListener(new ActionListener(){

 

					@Override

					public void actionPerformed(ActionEvent arg0) {

						// TODO Auto-generated method stub

						label.setText("ϲ����ֱ��˵�");

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