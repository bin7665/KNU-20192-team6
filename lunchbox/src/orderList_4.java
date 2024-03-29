

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.io.*;
import java.util.Scanner;
public class orderList_4 extends JFrame implements ActionListener {

	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	private String dish;
	private int position;
	private JPanel menuPanel;
	private fourSize gui;
	private String[] sidedish = new String[12];
	
	public orderList_4(int pos, fourSize data)
	{
		super("메뉴 리스트");
		setLocation(450,150);
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("src/sidedish.txt"), "UTF-8"));
			
			String line = null;			
			int len = 0;
			while((line = bufferedReader.readLine()) != null)
				sidedish[len++] = new String(line);
			
			gui = data;
			position = pos;
			setSize(WIDTH, HEIGHT);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setLayout(new BorderLayout());
			
			menuPanel = new JPanel();
			menuPanel.setLayout(null);
			JButton menu1Button = new JButton(sidedish[0]);
			menu1Button.setFont(new Font("", Font.PLAIN, 25));
			menu1Button.setBounds(150, 50, 200, 100);
			menu1Button.addActionListener(this);
			menuPanel.add(menu1Button);
			JButton menu2Button = new JButton(sidedish[1]);
			menu2Button.setFont(new Font("", Font.PLAIN, 25));
			menu2Button.setBounds(400, 50, 200, 100);
			menu2Button.addActionListener(this);
			menuPanel.add(menu2Button);
			JButton menu3Button = new JButton(sidedish[2]);
			menu3Button.setFont(new Font("", Font.PLAIN, 25));
			menu3Button.setBounds(650, 50, 200, 100);
			menu3Button.addActionListener(this);
			menuPanel.add(menu3Button);
			JButton menu4Button = new JButton(sidedish[3]);
			menu4Button.setFont(new Font("", Font.PLAIN, 25));
			menu4Button.setBounds(150, 200, 200, 100);
			menu4Button.addActionListener(this);
			menuPanel.add(menu4Button);
			JButton menu5Button = new JButton(sidedish[4]);
			menu5Button.setFont(new Font("", Font.PLAIN, 25));
			menu5Button.setBounds(400, 200, 200, 100);
			menu5Button.addActionListener(this);
			menuPanel.add(menu5Button);
			JButton menu6Button = new JButton(sidedish[5]);
			menu6Button.setFont(new Font("", Font.PLAIN, 25));
			menu6Button.setBounds(650, 200, 200, 100);
			menu6Button.addActionListener(this);
			menuPanel.add(menu6Button);
			JButton menu7Button = new JButton(sidedish[6]);
			menu7Button.setFont(new Font("", Font.PLAIN, 25));
			menu7Button.setBounds(150, 350, 200, 100);
			menu7Button.addActionListener(this);
			menuPanel.add(menu7Button);
			JButton menu8Button = new JButton(sidedish[7]);
			menu8Button.setFont(new Font("", Font.PLAIN, 25));
			menu8Button.setBounds(400, 350, 200, 100);
			menu8Button.addActionListener(this);
			menuPanel.add(menu8Button);
			JButton menu9Button = new JButton(sidedish[8]);
			menu9Button.setFont(new Font("", Font.PLAIN, 25));
			menu9Button.setBounds(650, 350, 200, 100);
			menu9Button.addActionListener(this);
			menuPanel.add(menu9Button);
			JButton menu10Button = new JButton(sidedish[9]);
			menu10Button.setFont(new Font("", Font.PLAIN, 25));
			menu10Button.setBounds(150, 500, 200, 100);
			menu10Button.addActionListener(this);
			menuPanel.add(menu10Button);
			JButton menu11Button = new JButton(sidedish[10]);
			menu11Button.setFont(new Font("", Font.PLAIN, 25));
			menu11Button.setBounds(400, 500, 200, 100);
			menu11Button.addActionListener(this);
			menuPanel.add(menu11Button);
			JButton menu12Button = new JButton(sidedish[11]);
			menu12Button.setFont(new Font("", Font.PLAIN, 25));
			menu12Button.setBounds(650, 500, 200, 100);
			menu12Button.addActionListener(this);
			menuPanel.add(menu12Button);
			add(menuPanel, BorderLayout.CENTER);
		}catch(FileNotFoundException e1) {
			System.out.println("Cannot find datafile.");
		}catch(IOException e1) {
			System.out.println("Problems with file input.");
		}
	}
	public void setDish(String s)
	{
		dish = s;
	}
	public String getDish()
	{
		return dish;
	}
	public void actionPerformed(ActionEvent e) {
		String buttonString = e.getActionCommand();
		if(buttonString == sidedish[0])
		{
			this.setDish(sidedish[0]);
			if(position == 1)
			{
				gui.setDish1(this.getDish());
				gui.setbutton1Text(this.getDish());
			}
			else if(position == 2)
			{
				gui.setDish2(this.getDish());
				gui.setbutton2Text(this.getDish());
			}
			else if(position == 3)
			{
				gui.setDish3(this.getDish());
				gui.setbutton3Text(this.getDish());
			}
		}
		else if(buttonString == sidedish[1])
		{
			this.setDish(sidedish[1]);
			if(position == 1)
			{
				gui.setDish1(this.getDish());
				gui.setbutton1Text(this.getDish());
			}
			else if(position == 2)
			{
				gui.setDish2(this.getDish());
				gui.setbutton2Text(this.getDish());
			}
			else if(position == 3)
			{
				gui.setDish3(this.getDish());
				gui.setbutton3Text(this.getDish());
			}
		}else if(buttonString == sidedish[2])
		{
			this.setDish(sidedish[2]);
			if(position == 1)
			{
				gui.setDish1(this.getDish());
				gui.setbutton1Text(this.getDish());
			}
			else if(position == 2)
			{
				gui.setDish2(this.getDish());
				gui.setbutton2Text(this.getDish());
			}
			else if(position == 3)
			{
				gui.setDish3(this.getDish());
				gui.setbutton3Text(this.getDish());
			}
		}
		else if(buttonString == sidedish[3])
		{
			this.setDish(sidedish[3]);
			if(position == 1)
			{
				gui.setDish1(this.getDish());
				gui.setbutton1Text(this.getDish());
			}
			else if(position == 2)
			{
				gui.setDish2(this.getDish());
				gui.setbutton2Text(this.getDish());
			}
			else if(position == 3)
			{
				gui.setDish3(this.getDish());
				gui.setbutton3Text(this.getDish());
			}
		}
		else if(buttonString == sidedish[4])
		{
			this.setDish(sidedish[4]);
			if(position == 1)
			{
				gui.setDish1(this.getDish());
				gui.setbutton1Text(this.getDish());
			}
			else if(position == 2)
			{
				gui.setDish2(this.getDish());
				gui.setbutton2Text(this.getDish());
			}
			else if(position == 3)
			{
				gui.setDish3(this.getDish());
				gui.setbutton3Text(this.getDish());
			}
		}
		else if(buttonString == sidedish[5])
		{
			this.setDish(sidedish[5]);
			if(position == 1)
			{
				gui.setDish1(this.getDish());
				gui.setbutton1Text(this.getDish());
			}
			else if(position == 2)
			{
				gui.setDish2(this.getDish());
				gui.setbutton2Text(this.getDish());
			}
			else if(position == 3)
			{
				gui.setDish3(this.getDish());
				gui.setbutton3Text(this.getDish());
			}
		}
		else if(buttonString == sidedish[6])
		{
			this.setDish(sidedish[6]);
			if(position == 1)
			{
				gui.setDish1(this.getDish());
				gui.setbutton1Text(this.getDish());
			}
			else if(position == 2)
			{
				gui.setDish2(this.getDish());
				gui.setbutton2Text(this.getDish());
			}
			else if(position == 3)
			{
				gui.setDish3(this.getDish());
				gui.setbutton3Text(this.getDish());
			}
		}
		else if(buttonString == sidedish[7])
		{
			this.setDish(sidedish[7]);
			if(position == 1)
			{
				gui.setDish1(this.getDish());
				gui.setbutton1Text(this.getDish());
			}
			else if(position == 2)
			{
				gui.setDish2(this.getDish());
				gui.setbutton2Text(this.getDish());
			}
			else if(position == 3)
			{
				gui.setDish3(this.getDish());
				gui.setbutton3Text(this.getDish());
			}
		}
		else if(buttonString == sidedish[8])
		{
			this.setDish(sidedish[8]);
			if(position == 1)
			{
				gui.setDish1(this.getDish());
				gui.setbutton1Text(this.getDish());
			}
			else if(position == 2)
			{
				gui.setDish2(this.getDish());
				gui.setbutton2Text(this.getDish());
			}
			else if(position == 3)
			{
				gui.setDish3(this.getDish());
				gui.setbutton3Text(this.getDish());
			}
		}
		else if(buttonString == sidedish[9])
		{
			this.setDish(sidedish[9]);
			if(position == 1)
			{
				gui.setDish1(this.getDish());
				gui.setbutton1Text(this.getDish());
			}
			else if(position == 2)
			{
				gui.setDish2(this.getDish());
				gui.setbutton2Text(this.getDish());
			}
			else if(position == 3)
			{
				gui.setDish3(this.getDish());
				gui.setbutton3Text(this.getDish());
			}
		}
		else if(buttonString == sidedish[10])
		{
			this.setDish(sidedish[11]);
			if(position == 1)
			{
				gui.setDish1(this.getDish());
				gui.setbutton1Text(this.getDish());
			}
			else if(position == 2)
			{
				gui.setDish2(this.getDish());
				gui.setbutton2Text(this.getDish());
			}
			else if(position == 3)
			{
				gui.setDish3(this.getDish());
				gui.setbutton3Text(this.getDish());
			}
		}
		else if(buttonString == sidedish[11])
		{
			this.setDish(sidedish[11]);
			if(position == 1)
			{
				gui.setDish1(this.getDish());
				gui.setbutton1Text(this.getDish());
			}
			else if(position == 2)
			{
				gui.setDish2(this.getDish());
				gui.setbutton2Text(this.getDish());
			}
			else if(position == 3)
			{
				gui.setDish3(this.getDish());
				gui.setbutton3Text(this.getDish());
			}
		}
		this.dispose();
	}
}

