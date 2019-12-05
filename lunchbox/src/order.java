

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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;


public class order extends JFrame implements ActionListener {

	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	private JPanel orderPanel;
	private JTextField phoneNum;
	private JTextField addressString;
	private JTextField inquireString;
	private int Kind;
	private String user;
	private lunchbox temp;

	public void actionPerformed(ActionEvent e) {
		
		String buttonString = e.getActionCommand();
		if(buttonString == "주문하기")
		{
			try {
				ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("user_"+ user));
				User readone = (User)inputStream.readObject();
				inputStream.close();
				readone.setphone_num(phoneNum.getText());
				readone.setaddress(addressString.getText());
				readone.setinquiry(inquireString.getText());
				ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("user_" +user));
				outputStream.writeObject(readone);
				outputStream.close();
			}catch(FileNotFoundException e1) {
				System.out.println("Cannot find datafile.");
			}catch(ClassNotFoundException e1) {
				System.out.println("Problems with file input");
			}catch(IOException e1) {
				System.out.println("Problems with file input.");
			}
			orderComplete gui = new orderComplete(user, Kind);
			gui.setVisible(true);
			this.dispose();
		}
		else if(buttonString == "장바구니에 담기")
		{
			try {
				ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("user_"+ user));
				User readone = (User)inputStream.readObject();
				readone.setphone_num(phoneNum.getText());
				readone.setaddress(addressString.getText());
				readone.setinquiry(inquireString.getText());
				temp = readone.getbox()[readone.getbox_num() - 1];
				inputStream.close();
				readone.setbasket(temp);
				ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("user_"+ user));
				outputStream.writeObject(readone);
				outputStream.close();
			}catch(FileNotFoundException e1) {
				System.out.println("Cannot find datafile.");
			}catch(ClassNotFoundException e1) {
				System.out.println("Problems with file input");
			}catch(IOException e1) {
				System.out.println("Problems with file input.");
			}
			orderComplete_basket gui = new orderComplete_basket(user, Kind);
			gui.setVisible(true);
			this.dispose();
		}
	}
	public order(String name, int kind)
	{
		super("주문하기");
			Kind = kind;
			user = name;
			setSize(WIDTH, HEIGHT);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setLayout(new BorderLayout());
			orderPanel = new JPanel();
			orderPanel.setLayout(null);
		try
		{
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("user_"+ user));
			User readone = (User)inputStream.readObject();
			JLabel phone = new JLabel("전화번호 : ");
			phone.setBounds(200, 80, 100, 50);
			orderPanel.add(phone);
			phoneNum = new JTextField(readone.getphone_num());
			phoneNum.setBounds(310, 80, 400, 50);
			phoneNum.setHorizontalAlignment(JTextField.CENTER);
			phoneNum.setEditable(false);
			phoneNum.addMouseListener(new MouseEventDemo());
			orderPanel.add(phoneNum);
			JLabel address = new JLabel("주소 : ");
			address.setBounds(200, 180, 100, 50);
			orderPanel.add(address);
			addressString = new JTextField(readone.getaddress());
			addressString.setBounds(310, 180, 400, 100);
			addressString.setHorizontalAlignment(JTextField.CENTER);
			addressString.setEditable(false);
			addressString.addMouseListener(new MouseEventDemo());
			orderPanel.add(addressString);
			inputStream.close();
		}
		catch(FileNotFoundException e1) {
			System.out.println("Cannot find datafile.");
		}catch(ClassNotFoundException e1) {
			System.out.println("Problems with file input");
		}catch(IOException e1) {
			System.out.println("Problems with file input.");
		}
		JLabel inquire = new JLabel("문의사항 : ");
		inquire.setBounds(200, 330, 100, 50);
		orderPanel.add(inquire);
		inquireString = new JTextField();
		inquireString.setBounds(310, 330, 400, 150);
		orderPanel.add(inquireString);
		JButton order = new JButton("주문하기");
		order.setBounds(300, 500, 200, 90);
		order.addActionListener(this);
		orderPanel.add(order);
		JButton order_basket = new JButton("장바구니에 담기");
		order_basket.setBounds(520, 500, 200, 90);
		order_basket.addActionListener(this);
		orderPanel.add(order_basket);
		menu gui = new menu(this.getWidth(), this.getHeight(), this, user);
	    orderPanel.add(gui);
		add(orderPanel, BorderLayout.CENTER);
	}
}

class MouseEventDemo implements MouseListener, MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		JTextField To = (JTextField)o;
		To.setText("");
		To.setEditable(true);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


