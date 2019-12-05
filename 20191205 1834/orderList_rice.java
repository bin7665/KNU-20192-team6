package project;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class orderList_rice extends JFrame implements ActionListener {

	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	private String dish;
	private int Size;
	private JPanel menuPanel;
	private fourSize gui4;
	private fiveSize gui5;
	private sixSize gui6;
	
	public orderList_rice(int size, fourSize data)
	{
		super("�޴� ����Ʈ");
		gui4 = data;
		Size = size;
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		menuPanel = new JPanel();
		menuPanel.setLayout(null);
		JButton menu1Button = new JButton("��1");
		menu1Button.setBounds(150, 100, 200, 200);
		menu1Button.addActionListener(this);
		menuPanel.add(menu1Button);
		JButton menu2Button = new JButton("��2");
		menu2Button.setBounds(400, 100, 200, 200);
		menu2Button.addActionListener(this);
		menuPanel.add(menu2Button);
		JButton menu3Button = new JButton("��3");
		menu3Button.setBounds(650, 100, 200, 200);
		menu3Button.addActionListener(this);
		menuPanel.add(menu3Button);
		JButton menu4Button = new JButton("��4");
		menu4Button.setBounds(150, 400, 200, 200);
		menu4Button.addActionListener(this);
		menuPanel.add(menu4Button);
		JButton menu5Button = new JButton("��5");
		menu5Button.setBounds(400, 400, 200, 200);
		menu5Button.addActionListener(this);
		menuPanel.add(menu5Button);
		JButton menu6Button = new JButton("��6");
		menu6Button.setBounds(650, 400, 200, 200);
		menu6Button.addActionListener(this);
		menuPanel.add(menu6Button);
		add(menuPanel, BorderLayout.CENTER);
	}
	public orderList_rice(int size, fiveSize data)
	{
		super("�޴� ����Ʈ");
		gui5 = data;
		Size = size;
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		menuPanel = new JPanel();
		menuPanel.setLayout(null);
		JButton menu1Button = new JButton("��1");
		menu1Button.setBounds(150, 100, 200, 200);
		menu1Button.addActionListener(this);
		menuPanel.add(menu1Button);
		JButton menu2Button = new JButton("��2");
		menu2Button.setBounds(400, 100, 200, 200);
		menu2Button.addActionListener(this);
		menuPanel.add(menu2Button);
		JButton menu3Button = new JButton("��3");
		menu3Button.setBounds(650, 100, 200, 200);
		menu3Button.addActionListener(this);
		menuPanel.add(menu3Button);
		JButton menu4Button = new JButton("��4");
		menu4Button.setBounds(150, 400, 200, 200);
		menu4Button.addActionListener(this);
		menuPanel.add(menu4Button);
		JButton menu5Button = new JButton("��5");
		menu5Button.setBounds(400, 400, 200, 200);
		menu5Button.addActionListener(this);
		menuPanel.add(menu5Button);
		JButton menu6Button = new JButton("��6");
		menu6Button.setBounds(650, 400, 200, 200);
		menu6Button.addActionListener(this);
		menuPanel.add(menu6Button);
		add(menuPanel, BorderLayout.CENTER);
	}
	public orderList_rice(int size, sixSize data)
	{
		super("�޴� ����Ʈ");
		gui6 = data;
		Size = size;
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		menuPanel = new JPanel();
		menuPanel.setLayout(null);
		JButton menu1Button = new JButton("��1");
		menu1Button.setBounds(150, 100, 200, 200);
		menu1Button.addActionListener(this);
		menuPanel.add(menu1Button);
		JButton menu2Button = new JButton("��2");
		menu2Button.setBounds(400, 100, 200, 200);
		menu2Button.addActionListener(this);
		menuPanel.add(menu2Button);
		JButton menu3Button = new JButton("��3");
		menu3Button.setBounds(650, 100, 200, 200);
		menu3Button.addActionListener(this);
		menuPanel.add(menu3Button);
		JButton menu4Button = new JButton("��4");
		menu4Button.setBounds(150, 400, 200, 200);
		menu4Button.addActionListener(this);
		menuPanel.add(menu4Button);
		JButton menu5Button = new JButton("��5");
		menu5Button.setBounds(400, 400, 200, 200);
		menu5Button.addActionListener(this);
		menuPanel.add(menu5Button);
		JButton menu6Button = new JButton("��6");
		menu6Button.setBounds(650, 400, 200, 200);
		menu6Button.addActionListener(this);
		menuPanel.add(menu6Button);
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
		if(Size == 4)
		{
			if(buttonString == "��1")		
			{
				this.setDish("��1");
				gui4.setRice(this.getDish());
				gui4.setbutton_RText(this.getDish());
			}
			else if(buttonString == "��2")
			{
				this.setDish("��2");
				gui4.setRice(this.getDish());
				gui4.setbutton_RText(this.getDish());
			}
			else if(buttonString == "��3")
			{
				this.setDish("��3");
				gui4.setRice(this.getDish());
				gui4.setbutton_RText(this.getDish());
			}
			else if(buttonString == "��4")
			{
				this.setDish("��4");
				gui4.setRice(this.getDish());
				gui4.setbutton_RText(this.getDish());
			}
			else if(buttonString == "��5")
			{
				this.setDish("��5");
				gui4.setRice(this.getDish());
				gui4.setbutton_RText(this.getDish());
			}
			else if(buttonString == "��6")
			{
				this.setDish("��6");
				gui4.setRice(this.getDish());
				gui4.setbutton_RText(this.getDish());
			}
		}
		else if(Size == 5)
		{
			if(buttonString == "��1")		
			{
				this.setDish("��1");
				gui5.setRice(this.getDish());
				gui5.setbutton_RText(this.getDish());
			}
			else if(buttonString == "��2")
			{
				this.setDish("��2");
				gui5.setRice(this.getDish());
				gui5.setbutton_RText(this.getDish());
			}
			else if(buttonString == "��3")
			{
				this.setDish("��3");
				gui5.setRice(this.getDish());
				gui5.setbutton_RText(this.getDish());
			}
			else if(buttonString == "��4")
			{
				this.setDish("��4");
				gui5.setRice(this.getDish());
				gui5.setbutton_RText(this.getDish());
			}
			else if(buttonString == "��5")
			{
				this.setDish("��5");
				gui5.setRice(this.getDish());
				gui5.setbutton_RText(this.getDish());
			}
			else if(buttonString == "��6")
			{
				this.setDish("��6");
				gui5.setRice(this.getDish());
				gui5.setbutton_RText(this.getDish());
			}
		}
		else if(Size == 6)
		{
			if(buttonString == "��1")		
			{
				this.setDish("��1");
				gui6.setRice(this.getDish());
				gui6.setbutton_RText(this.getDish());
			}
			else if(buttonString == "��2")
			{
				this.setDish("��2");
				gui6.setRice(this.getDish());
				gui6.setbutton_RText(this.getDish());
			}
			else if(buttonString == "��3")
			{
				this.setDish("��3");
				gui6.setRice(this.getDish());
				gui6.setbutton_RText(this.getDish());
			}
			else if(buttonString == "��4")
			{
				this.setDish("��4");
				gui6.setRice(this.getDish());
				gui6.setbutton_RText(this.getDish());
			}
			else if(buttonString == "��5")
			{
				this.setDish("��5");
				gui6.setRice(this.getDish());
				gui6.setbutton_RText(this.getDish());
			}
			else if(buttonString == "��6")
			{
				this.setDish("��6");
				gui6.setRice(this.getDish());
				gui6.setbutton_RText(this.getDish());
			}
		}
		this.dispose();
	}
}