package project;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class orderList_5 extends JFrame implements ActionListener {

	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	private String dish;
	private int position;
	private JPanel menuPanel;
	private fiveSize gui;
	public orderList_5(int pos, fiveSize data)
	{
		super("�޴� ����Ʈ");
		gui = data;
		position = pos;
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		menuPanel = new JPanel();
		menuPanel.setLayout(null);
		JButton menu1Button = new JButton("����1");
		menu1Button.setBounds(150, 50, 200, 100);
		menu1Button.addActionListener(this);
		menuPanel.add(menu1Button);
		JButton menu2Button = new JButton("����2");
		menu2Button.setBounds(400, 50, 200, 100);
		menu2Button.addActionListener(this);
		menuPanel.add(menu2Button);
		JButton menu3Button = new JButton("����3");
		menu3Button.setBounds(650, 50, 200, 100);
		menu3Button.addActionListener(this);
		menuPanel.add(menu3Button);
		JButton menu4Button = new JButton("����4");
		menu4Button.setBounds(150, 200, 200, 100);
		menu4Button.addActionListener(this);
		menuPanel.add(menu4Button);
		JButton menu5Button = new JButton("����5");
		menu5Button.setBounds(400, 200, 200, 100);
		menu5Button.addActionListener(this);
		menuPanel.add(menu5Button);
		JButton menu6Button = new JButton("����6");
		menu6Button.setBounds(650, 200, 200, 100);
		menu6Button.addActionListener(this);
		menuPanel.add(menu6Button);
		JButton menu7Button = new JButton("����7");
		menu7Button.setBounds(150, 350, 200, 100);
		menu7Button.addActionListener(this);
		menuPanel.add(menu7Button);
		JButton menu8Button = new JButton("����8");
		menu8Button.setBounds(400, 350, 200, 100);
		menu8Button.addActionListener(this);
		menuPanel.add(menu8Button);
		JButton menu9Button = new JButton("����9");
		menu9Button.setBounds(650, 350, 200, 100);
		menu9Button.addActionListener(this);
		menuPanel.add(menu9Button);
		JButton menu10Button = new JButton("����10");
		menu10Button.setBounds(150, 500, 200, 100);
		menu10Button.addActionListener(this);
		menuPanel.add(menu10Button);
		JButton menu11Button = new JButton("����11");
		menu11Button.setBounds(400, 500, 200, 100);
		menu11Button.addActionListener(this);
		menuPanel.add(menu11Button);
		JButton menu12Button = new JButton("����12");
		menu12Button.setBounds(650, 500, 200, 100);
		menu12Button.addActionListener(this);
		menuPanel.add(menu12Button);
		add(menuPanel, BorderLayout.CENTER);
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
		if(buttonString == "����1")
		{
			this.setDish("����1");
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
			else if(position == 4)
			{
				gui.setDish4(this.getDish());
				gui.setbutton4Text(this.getDish());
			}
		}
		else if(buttonString == "����2")
		{
			this.setDish("����2");
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
			else if(position == 4)
			{
				gui.setDish4(this.getDish());
				gui.setbutton4Text(this.getDish());
			}
		}
		else if(buttonString == "����3")
		{
			this.setDish("����3");
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
			else if(position == 4)
			{
				gui.setDish4(this.getDish());
				gui.setbutton4Text(this.getDish());
			}
		}
		else if(buttonString == "����4")
		{
			this.setDish("����4");
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
			else if(position == 4)
			{
				gui.setDish4(this.getDish());
				gui.setbutton4Text(this.getDish());
			}
		}
		else if(buttonString == "����5")
		{
			this.setDish("����5");
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
			else if(position == 4)
			{
				gui.setDish4(this.getDish());
				gui.setbutton4Text(this.getDish());
			}
		}
		else if(buttonString == "����6")
		{
			this.setDish("����6");
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
			else if(position == 4)
			{
				gui.setDish4(this.getDish());
				gui.setbutton4Text(this.getDish());
			}
		}
		else if(buttonString == "����7")
		{
			this.setDish("����7");
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
			else if(position == 4)
			{
				gui.setDish4(this.getDish());
				gui.setbutton4Text(this.getDish());
			}
		}
		else if(buttonString == "����8")
		{
			this.setDish("����8");
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
			else if(position == 4)
			{
				gui.setDish4(this.getDish());
				gui.setbutton4Text(this.getDish());
			}
		}
		else if(buttonString == "����9")
		{
			this.setDish("����9");
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
			else if(position == 4)
			{
				gui.setDish4(this.getDish());
				gui.setbutton4Text(this.getDish());
			}
		}
		else if(buttonString == "����10")
		{
			this.setDish("����10");
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
			else if(position == 4)
			{
				gui.setDish4(this.getDish());
				gui.setbutton4Text(this.getDish());
			}
		}
		else if(buttonString == "����11")
		{
			this.setDish("����11");
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
			else if(position == 4)
			{
				gui.setDish4(this.getDish());
				gui.setbutton4Text(this.getDish());
			}
		}
		else if(buttonString == "����12")
		{
			this.setDish("����12");
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
			else if(position == 4)
			{
				gui.setDish4(this.getDish());
				gui.setbutton4Text(this.getDish());
			}
		}
		this.dispose();
	}
}
