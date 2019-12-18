

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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class fiveSize extends JFrame implements ActionListener {

	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	private String name;
	private String side1 = "반찬.";
	private String side2 = "반찬..";
	private String side3 = "반찬...";
	private String side4 = "반찬 or 국";
	private String riceString = "밥";
	private lunchbox temp;
	private JPanel sizePanel;
	private JButton sideDish1;
	private JButton sideDish2;
	private JButton sideDish3;
	private JButton sideDish4;
	private JButton rice;
	
	public void actionPerformed(ActionEvent e) {
		String buttonString = e.getActionCommand();
		if(buttonString.equals(side1))
		{
			orderList_5 gui5 = new orderList_5(1, this);
			gui5.setVisible(true);
		}
		else if(buttonString.equals(side2))
		{
			orderList_5 gui5 = new orderList_5(2, this);
			gui5.setVisible(true);
		}
		else if(buttonString.equals(side3))
		{
			orderList_5 gui5 = new orderList_5(3, this);
			gui5.setVisible(true);
		}
		else if(buttonString.equals(side4))
		{
			orderList_5 gui5 = new orderList_5(4, this);
			gui5.setVisible(true);
		}
		else if(buttonString.equals(riceString))
		{
			orderList_rice gui5 = new orderList_rice(5, this);
			gui5.setVisible(true);
		}
		else if(buttonString.equals("주문하기"))
		{
			temp = new lunchbox(side1, side2, side3, side4, riceString);
			try {
				ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("user_"+ name));
				User readone = (User)inputStream.readObject();
				readone.setbox(temp);
				inputStream.close();
				ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("user_"+ name));
				outputStream.writeObject(readone);
				outputStream.close();
			}
			catch(FileNotFoundException e1) {
				System.out.println("Cannot find datafile.");
			}catch(ClassNotFoundException e1) {
				System.out.println("Problems with file input");
			}catch(IOException e1) {
				System.out.println("Problems with file input.");
			}
			order gui = new order(name, 5);
			gui.setVisible(true);
			this.dispose();
		}
	}
	public fiveSize(String user)
	{
		super("메뉴 정하기");
		setLocation(450,150);
		name = user;
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		sizePanel = new JPanel();
		sizePanel.setLayout(null);
		sideDish1 = new JButton(side1);
		sideDish1.setBounds(200, 50, 190, 200);
		sideDish1.addActionListener(this);
		sizePanel.add(sideDish1);
		sideDish2 = new JButton(side2);
		sideDish2.setBounds(390, 50, 190, 200);
		sideDish2.addActionListener(this);
		sizePanel.add(sideDish2);
		sideDish3 = new JButton(side3);
		sideDish3.setBounds(580, 50, 190, 200);
		sideDish3.addActionListener(this);
		sizePanel.add(sideDish3);
		rice = new JButton(riceString);
		rice.setBounds(200, 250, 325, 200);
		rice.addActionListener(this);
		sizePanel.add(rice);
		sideDish4 = new JButton(side4);
		sideDish4.setBounds(525, 250, 245, 200);
		sideDish4.addActionListener(this);
		sizePanel.add(sideDish4);
		JButton order = new JButton("주문하기");
		order.setBounds(285, 500, 400, 90);
		order.addActionListener(this);
		sizePanel.add(order);
		menu gui = new menu(this.getWidth(), this.getHeight(), this, name);
	    sizePanel.add(gui);
		add(sizePanel, BorderLayout.CENTER);
	}
	public void setDish1(String s)
	{
		side1 = s;
	}
	public void setDish2(String s)
	{
		side2 = s;
	}
	public void setDish3(String s)
	{
		side3 = s;
	}
	public void setDish4(String s)
	{
		side4 = s;
	}
	public void setRice(String s)
	{
		riceString = s;
	}
	public void setbutton1Text(String s)
	{
		this.sideDish1.setText(s);
	}
	public void setbutton2Text(String s)
	{
		this.sideDish2.setText(s);
	}
	public void setbutton3Text(String s)
	{
		this.sideDish3.setText(s);
	}
	public void setbutton4Text(String s)
	{
		this.sideDish4.setText(s);
	}
	public void setbutton_RText(String s)
	{
		this.rice.setText(s);
	}
}


