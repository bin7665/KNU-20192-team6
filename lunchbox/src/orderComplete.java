

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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.awt.event.ActionEvent;

public class orderComplete extends JFrame implements ActionListener {
	private JPanel menuPanel;
	private String user;
	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	
	public orderComplete(String ID, int kind)
	{
		super("주문 완료");
		setLocation(450,150);
		user = ID;
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout( ));
        menuPanel = new JPanel();
        menuPanel.setLayout(null);
        JLabel comPlete = new JLabel("주문이 완료 되었습니다.");
        comPlete.setBounds(440, 100, 400, 180);
        comPlete.setBackground(Color.GREEN);
		menuPanel.add(comPlete);
		try
		{
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("user_"+ user));
			User readone = (User)inputStream.readObject();
			JLabel addressList = new JLabel("배달 주소 : " + readone.getaddress());
			addressList.setBounds(300, 340, 400, 90);
			menuPanel.add(addressList);
			inputStream.close();
		}
		catch(FileNotFoundException e1) {
			System.out.println("Cannot find datafile.");
		}catch(ClassNotFoundException e1) {
			System.out.println("Problems with file input");
		}catch(IOException e1) {
			System.out.println("Problems with file input.");
		}
		JButton phoneNum = new JButton("배달 정보 보기");
		phoneNum.setBounds(300, 430, 400, 90);
		phoneNum.addActionListener(this);
		menuPanel.add(phoneNum);
		JButton orderList = new JButton("주문 내역 보기");
		orderList.setBounds(300, 550, 400, 90);
		orderList.addActionListener(this);
		menuPanel.add(orderList);
        add(menuPanel, BorderLayout.CENTER);
	}


	public void actionPerformed(ActionEvent e) {
		String buttonString = e.getActionCommand();
		if(buttonString.equals("배달 정보 보기")){
			dispose();
			View_delivery_information gui = new View_delivery_information();
			gui.setVisible(true);
			gui.setLocationRelativeTo(null);
		}
		else if(buttonString.equals("주문 내역 보기")){
			dispose();
			Order_dir gui = new Order_dir(user);
			gui.setVisible(true);
			gui.setLocationRelativeTo(null);
		}
	}
}

