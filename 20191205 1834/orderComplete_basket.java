package project;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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

public class orderComplete_basket extends JFrame implements ActionListener {

	private JPanel menuPanel;
	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public orderComplete_basket(int kind)
	{
		super("��ٱ��Ͽ� ��� �Ϸ�");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout( ));
        menuPanel = new JPanel();
        menuPanel.setLayout(null);
        JLabel comPlete = new JLabel("��ٱ��Ͽ� ��Ⱑ �Ϸ� �Ǿ����ϴ�.");
        comPlete.setBounds(400, 100, 400, 180);
        comPlete.setBackground(Color.GREEN);
		menuPanel.add(comPlete);
		JLabel addressList = new JLabel("��� �ּ� : ");
		addressList.setBounds(300, 340, 400, 90);
		menuPanel.add(addressList);
		JButton phoneNum = new JButton("��� ���� ���� ");
		phoneNum.setBounds(300, 430, 400, 90);
		menuPanel.add(phoneNum);
		JButton orderList = new JButton("��ٱ��� â ����");
		orderList.setBounds(300, 550, 400, 90);
		orderList.addActionListener(this);
		menuPanel.add(orderList);
        add(menuPanel, BorderLayout.CENTER);
	}
}



