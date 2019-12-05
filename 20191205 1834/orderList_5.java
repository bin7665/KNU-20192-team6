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
		super("메뉴 리스트");
		gui = data;
		position = pos;
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		menuPanel = new JPanel();
		menuPanel.setLayout(null);
		JButton menu1Button = new JButton("반찬1");
		menu1Button.setBounds(150, 50, 200, 100);
		menu1Button.addActionListener(this);
		menuPanel.add(menu1Button);
		JButton menu2Button = new JButton("반찬2");
		menu2Button.setBounds(400, 50, 200, 100);
		menu2Button.addActionListener(this);
		menuPanel.add(menu2Button);
		JButton menu3Button = new JButton("반찬3");
		menu3Button.setBounds(650, 50, 200, 100);
		menu3Button.addActionListener(this);
		menuPanel.add(menu3Button);
		JButton menu4Button = new JButton("반찬4");
		menu4Button.setBounds(150, 200, 200, 100);
		menu4Button.addActionListener(this);
		menuPanel.add(menu4Button);
		JButton menu5Button = new JButton("반찬5");
		menu5Button.setBounds(400, 200, 200, 100);
		menu5Button.addActionListener(this);
		menuPanel.add(menu5Button);
		JButton menu6Button = new JButton("반찬6");
		menu6Button.setBounds(650, 200, 200, 100);
		menu6Button.addActionListener(this);
		menuPanel.add(menu6Button);
		JButton menu7Button = new JButton("반찬7");
		menu7Button.setBounds(150, 350, 200, 100);
		menu7Button.addActionListener(this);
		menuPanel.add(menu7Button);
		JButton menu8Button = new JButton("반찬8");
		menu8Button.setBounds(400, 350, 200, 100);
		menu8Button.addActionListener(this);
		menuPanel.add(menu8Button);
		JButton menu9Button = new JButton("반찬9");
		menu9Button.setBounds(650, 350, 200, 100);
		menu9Button.addActionListener(this);
		menuPanel.add(menu9Button);
		JButton menu10Button = new JButton("반찬10");
		menu10Button.setBounds(150, 500, 200, 100);
		menu10Button.addActionListener(this);
		menuPanel.add(menu10Button);
		JButton menu11Button = new JButton("반찬11");
		menu11Button.setBounds(400, 500, 200, 100);
		menu11Button.addActionListener(this);
		menuPanel.add(menu11Button);
		JButton menu12Button = new JButton("반찬12");
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
		if(buttonString == "반찬1")
		{
			this.setDish("반찬1");
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
		else if(buttonString == "반찬2")
		{
			this.setDish("반찬2");
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
		else if(buttonString == "반찬3")
		{
			this.setDish("반찬3");
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
		else if(buttonString == "반찬4")
		{
			this.setDish("반찬4");
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
		else if(buttonString == "반찬5")
		{
			this.setDish("반찬5");
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
		else if(buttonString == "반찬6")
		{
			this.setDish("반찬6");
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
		else if(buttonString == "반찬7")
		{
			this.setDish("반찬7");
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
		else if(buttonString == "반찬8")
		{
			this.setDish("반찬8");
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
		else if(buttonString == "반찬9")
		{
			this.setDish("반찬9");
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
		else if(buttonString == "반찬10")
		{
			this.setDish("반찬10");
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
		else if(buttonString == "반찬11")
		{
			this.setDish("반찬11");
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
		else if(buttonString == "반찬12")
		{
			this.setDish("반찬12");
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
