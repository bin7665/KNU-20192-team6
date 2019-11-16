package mainPage;

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


public class order extends JFrame implements ActionListener {

	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	private JPanel orderPanel;
	public void actionPerformed(ActionEvent e) {
		
		String buttonString = e.getActionCommand();
		
	}
	
	public order(String ID, int kind)
	{
		super("주문하기");
		setSize(WIDTH, HEIGHT);
		setLayout(new BorderLayout());
		orderPanel = new JPanel();
		orderPanel.setLayout(null);
		JLabel phone = new JLabel("전화번호 : ");
		phone.setBounds(200, 80, 100, 50);
		orderPanel.add(phone);
		JTextField phoneNum = new JTextField();
		phoneNum.setBounds(310, 80, 400, 50);
		orderPanel.add(phoneNum);
		JLabel address = new JLabel("주소 : ");
		address.setBounds(200, 180, 100, 50);
		orderPanel.add(address);
		JTextField addressString = new JTextField();
		addressString.setBounds(310, 180, 400, 100);
		orderPanel.add(addressString);
		JLabel inquire = new JLabel("문의사항 : ");
		inquire.setBounds(200, 330, 100, 50);
		orderPanel.add(inquire);
		JTextField inquireString = new JTextField();
		inquireString.setBounds(310, 330, 400, 150);
		orderPanel.add(inquireString);
		JButton order = new JButton("주문하기");
		order.setBounds(310, 500, 400, 90);
		order.addActionListener(this);
		
		JButton backButton = new JButton("Back");
        //ImageIcon backIcon = new ImageIcon("basketbutton.png");
        backButton.setBounds(0, 636, 256, 128);
        /*backButton.setIcon(backIcon);
        backButton.setBackground(Color.white);
        backButton.setBorderPainted(false);
        backButton.setFocusPainted(false);
        backButton.setContentAreaFilled(false); */
        backButton.addActionListener(this);
        orderPanel.add(backButton);
        menu gui = new menu(orderPanel);
		gui.setVisible(true);
		orderPanel.add(order);
		add(orderPanel, BorderLayout.CENTER);
	}
	
}
