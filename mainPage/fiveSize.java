
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class fiveSize extends JFrame implements ActionListener {

	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	private JPanel sizePanel;
	
	public void actionPerformed(ActionEvent e) {
		String buttonString = e.getActionCommand();
		if(buttonString.equals("����."))
		{
			
		}
		else if(buttonString.equals("����.."))
		{
			
		}
		else if(buttonString.equals("����..."))
		{
			
		}
		else if(buttonString.equals("���� or ��"))
		{
		
		}
		else if(buttonString.equals("��"))
		{
		
		}
		else if(buttonString.equals("�ֹ��ϱ�"))
		{
			order gui = new order(5);
			gui.setVisible(true);
		}
	}
	public fiveSize()
	{
		super("�޴� ���ϱ�");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		sizePanel = new JPanel();
		sizePanel.setLayout(null);
		JButton sideDish1 = new JButton("����.");
		sideDish1.setBounds(200, 50, 190, 200);
		sideDish1.addActionListener(this);
		sizePanel.add(sideDish1);
		JButton sideDish2 = new JButton("����..");
		sideDish2.setBounds(390, 50, 190, 200);
		sideDish2.addActionListener(this);
		sizePanel.add(sideDish2);
		JButton sideDish3 = new JButton("����...");
		sideDish3.setBounds(580, 50, 190, 200);
		sideDish3.addActionListener(this);
		sizePanel.add(sideDish3);
		JButton rice = new JButton("��");
		rice.setBounds(200, 250, 325, 200);
		rice.addActionListener(this);
		sizePanel.add(rice);
		JButton sideDish4 = new JButton("���� or ��");
		sideDish4.setBounds(525, 250, 245, 200);
		sideDish4.addActionListener(this);
		sizePanel.add(sideDish4);
		JButton order = new JButton("�ֹ��ϱ�");
		order.setBounds(285, 500, 400, 90);
		order.addActionListener(this);
		sizePanel.add(order);
		menu gui = new menu(sizePanel, 2, 0);
		add(sizePanel, BorderLayout.CENTER);
	}
}