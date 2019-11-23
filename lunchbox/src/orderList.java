package project;

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

public class orderList extends JFrame implements ActionListener {

	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	private String dish;
	private int size;
	private int position;
	private JPanel menuPanel;

	public orderList(int index, int pos)
	{
		super("메뉴 리스트");
		size = index;
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
			if(size == 4)
			{
				fourSize gui = new fourSize();
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
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 5)
			{
				fiveSize gui = new fiveSize();
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
				else if(position == 5)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 6)
			{
				sixSize gui = new sixSize();
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
				else if(position == 5)
				{
					gui.setDish4(this.getDish());
					gui.setbutton4Text(this.getDish());
				}
				else if(position == 6)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			this.dispose();
			
		}
		else if(buttonString == "반찬2")
		{
			this.setDish("반찬2");
			if(size == 4)
			{
				fourSize gui = new fourSize();
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
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 5)
			{
				fiveSize gui = new fiveSize();
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
				else if(position == 5)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 6)
			{
				sixSize gui = new sixSize();
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
				else if(position == 5)
				{
					gui.setDish4(this.getDish());
					gui.setbutton4Text(this.getDish());
				}
				else if(position == 6)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			this.dispose();
		}
		else if(buttonString == "반찬3")
		{
			this.setDish("반찬3");
			if(size == 4)
			{
				fourSize gui = new fourSize();
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
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 5)
			{
				fiveSize gui = new fiveSize();
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
				else if(position == 5)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 6)
			{
				sixSize gui = new sixSize();
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
				else if(position == 5)
				{
					gui.setDish4(this.getDish());
					gui.setbutton4Text(this.getDish());
				}
				else if(position == 6)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			this.dispose();
		}
		else if(buttonString == "반찬4")
		{
			this.setDish("반찬4");
			if(size == 4)
			{
				fourSize gui = new fourSize();
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
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 5)
			{
				fiveSize gui = new fiveSize();
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
				else if(position == 5)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 6)
			{
				sixSize gui = new sixSize();
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
				else if(position == 5)
				{
					gui.setDish4(this.getDish());
					gui.setbutton4Text(this.getDish());
				}
				else if(position == 6)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			this.dispose();
		}
		else if(buttonString == "반찬5")
		{
			setDish("반찬5");
			if(size == 4)
			{
				fourSize gui = new fourSize();
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
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 5)
			{
				fiveSize gui = new fiveSize();
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
				else if(position == 5)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 6)
			{
				sixSize gui = new sixSize();
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
				else if(position == 5)
				{
					gui.setDish4(this.getDish());
					gui.setbutton4Text(this.getDish());
				}
				else if(position == 6)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			this.dispose();
		}
		else if(buttonString == "반찬6")
		{
			setDish("반찬6");
			if(size == 4)
			{
				fourSize gui = new fourSize();
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
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 5)
			{
				fiveSize gui = new fiveSize();
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
				else if(position == 5)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 6)
			{
				sixSize gui = new sixSize();
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
				else if(position == 5)
				{
					gui.setDish4(this.getDish());
					gui.setbutton4Text(this.getDish());
				}
				else if(position == 6)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			this.dispose();
		}
		else if(buttonString == "반찬7")
		{
			setDish("반찬7");
			if(size == 4)
			{
				fourSize gui = new fourSize();
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
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 5)
			{
				fiveSize gui = new fiveSize();
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
				else if(position == 5)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 6)
			{
				sixSize gui = new sixSize();
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
				else if(position == 5)
				{
					gui.setDish4(this.getDish());
					gui.setbutton4Text(this.getDish());
				}
				else if(position == 6)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			this.dispose();
		}
		else if(buttonString == "반찬8")
		{
			setDish("반찬8");
			if(size == 4)
			{
				fourSize gui = new fourSize();
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
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 5)
			{
				fiveSize gui = new fiveSize();
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
				else if(position == 5)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 6)
			{
				sixSize gui = new sixSize();
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
				else if(position == 5)
				{
					gui.setDish4(this.getDish());
					gui.setbutton4Text(this.getDish());
				}
				else if(position == 6)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			this.dispose();
		}
		else if(buttonString == "반찬9")
		{
			setDish("반찬9");
			if(size == 4)
			{
				fourSize gui = new fourSize();
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
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 5)
			{
				fiveSize gui = new fiveSize();
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
				else if(position == 5)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 6)
			{
				sixSize gui = new sixSize();
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
				else if(position == 5)
				{
					gui.setDish4(this.getDish());
					gui.setbutton4Text(this.getDish());
				}
				else if(position == 6)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			this.dispose();
		}
		else if(buttonString == "반찬10")
		{
			setDish("반찬10");
			if(size == 4)
			{
				fourSize gui = new fourSize();
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
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 5)
			{
				fiveSize gui = new fiveSize();
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
				else if(position == 5)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 6)
			{
				sixSize gui = new sixSize();
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
				else if(position == 5)
				{
					gui.setDish4(this.getDish());
					gui.setbutton4Text(this.getDish());
				}
				else if(position == 6)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			this.dispose();
		}
		else if(buttonString == "반찬11")
		{
			setDish("반찬11");
			if(size == 4)
			{
				fourSize gui = new fourSize();
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
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 5)
			{
				fiveSize gui = new fiveSize();
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
				else if(position == 5)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 6)
			{
				sixSize gui = new sixSize();
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
				else if(position == 5)
				{
					gui.setDish4(this.getDish());
					gui.setbutton4Text(this.getDish());
				}
				else if(position == 6)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			this.dispose();
		}
		else if(buttonString == "반찬12")
		{
			setDish("반찬12");
			if(size == 4)
			{
				fourSize gui = new fourSize();
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
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 5)
			{
				fiveSize gui = new fiveSize();
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
				else if(position == 5)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			else if(size == 6)
			{
				sixSize gui = new sixSize();
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
				else if(position == 5)
				{
					gui.setDish4(this.getDish());
					gui.setbutton4Text(this.getDish());
				}
				else if(position == 6)
				{
					gui.setRice(this.getDish());
					gui.setbutton_RText(this.getDish());
				}
			}
			this.dispose();
		}
	}
}
