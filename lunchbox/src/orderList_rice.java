

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

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
	private String[] rice = new String[6];
	
	public orderList_rice(int size, fourSize data)
	{
		super("ธÞดบ ธฎฝบฦฎ");
		setLocation(450,150);
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("src/rice.txt"), "UTF-8"));
			
			String line = null;			
			int len = 0;
			while((line = bufferedReader.readLine()) != null)
				rice[len++] = new String(line);
			gui4 = data;
			Size = size;
			setSize(WIDTH, HEIGHT);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setLayout(new BorderLayout());
			menuPanel = new JPanel();
			menuPanel.setLayout(null);
			JButton menu1Button = new JButton(rice[0]);
			menu1Button.setFont(new Font("", Font.PLAIN, 25));
			menu1Button.setBounds(150, 100, 200, 200);
			menu1Button.addActionListener(this);
			menuPanel.add(menu1Button);
			JButton menu2Button = new JButton(rice[1]);
			menu2Button.setFont(new Font("", Font.PLAIN, 25));
			menu2Button.setBounds(400, 100, 200, 200);
			menu2Button.addActionListener(this);
			menuPanel.add(menu2Button);
			JButton menu3Button = new JButton(rice[2]);
			menu3Button.setFont(new Font("", Font.PLAIN, 25));
			menu3Button.setBounds(650, 100, 200, 200);
			menu3Button.addActionListener(this);
			menuPanel.add(menu3Button);
			JButton menu4Button = new JButton(rice[3]);
			menu4Button.setFont(new Font("", Font.PLAIN, 25));
			menu4Button.setBounds(150, 400, 200, 200);
			menu4Button.addActionListener(this);
			menuPanel.add(menu4Button);
			JButton menu5Button = new JButton(rice[4]);
			menu5Button.setFont(new Font("", Font.PLAIN, 25));
			menu5Button.setBounds(400, 400, 200, 200);
			menu5Button.addActionListener(this);
			menuPanel.add(menu5Button);
			JButton menu6Button = new JButton(rice[5]);
			menu6Button.setFont(new Font("", Font.PLAIN, 25));
			menu6Button.setBounds(650, 400, 200, 200);
			menu6Button.addActionListener(this);
			menuPanel.add(menu6Button);
			add(menuPanel, BorderLayout.CENTER);
		}catch(FileNotFoundException e1) {
			System.out.println("Cannot find datafile.");
		}catch(IOException e1) {
			System.out.println("Problems with file input.");
		}
	}
	public orderList_rice(int size, fiveSize data)
	{
		super("ธÞดบ ธฎฝบฦฎ");
		gui5 = data;
		Size = size;
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		menuPanel = new JPanel();
		menuPanel.setLayout(null);
		JButton menu1Button = new JButton("นไ1");
		menu1Button.setBounds(150, 100, 200, 200);
		menu1Button.addActionListener(this);
		menuPanel.add(menu1Button);
		JButton menu2Button = new JButton("นไ2");
		menu2Button.setBounds(400, 100, 200, 200);
		menu2Button.addActionListener(this);
		menuPanel.add(menu2Button);
		JButton menu3Button = new JButton("นไ3");
		menu3Button.setBounds(650, 100, 200, 200);
		menu3Button.addActionListener(this);
		menuPanel.add(menu3Button);
		JButton menu4Button = new JButton("นไ4");
		menu4Button.setBounds(150, 400, 200, 200);
		menu4Button.addActionListener(this);
		menuPanel.add(menu4Button);
		JButton menu5Button = new JButton("นไ5");
		menu5Button.setBounds(400, 400, 200, 200);
		menu5Button.addActionListener(this);
		menuPanel.add(menu5Button);
		JButton menu6Button = new JButton("นไ6");
		menu6Button.setBounds(650, 400, 200, 200);
		menu6Button.addActionListener(this);
		menuPanel.add(menu6Button);
		add(menuPanel, BorderLayout.CENTER);
	}
	public orderList_rice(int size, sixSize data)
	{
		super("ธÞดบ ธฎฝบฦฎ");
		gui6 = data;
		Size = size;
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		menuPanel = new JPanel();
		menuPanel.setLayout(null);
		JButton menu1Button = new JButton("นไ1");
		menu1Button.setBounds(150, 100, 200, 200);
		menu1Button.addActionListener(this);
		menuPanel.add(menu1Button);
		JButton menu2Button = new JButton("นไ2");
		menu2Button.setBounds(400, 100, 200, 200);
		menu2Button.addActionListener(this);
		menuPanel.add(menu2Button);
		JButton menu3Button = new JButton("นไ3");
		menu3Button.setBounds(650, 100, 200, 200);
		menu3Button.addActionListener(this);
		menuPanel.add(menu3Button);
		JButton menu4Button = new JButton("นไ4");
		menu4Button.setBounds(150, 400, 200, 200);
		menu4Button.addActionListener(this);
		menuPanel.add(menu4Button);
		JButton menu5Button = new JButton("นไ5");
		menu5Button.setBounds(400, 400, 200, 200);
		menu5Button.addActionListener(this);
		menuPanel.add(menu5Button);
		JButton menu6Button = new JButton("นไ6");
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
			if(buttonString == rice[0])		
			{
				this.setDish(rice[0]);
				gui4.setRice(this.getDish());
				gui4.setbutton_RText(this.getDish());
			}
			else if(buttonString == rice[1])
			{
				this.setDish(rice[1]);
				gui4.setRice(this.getDish());
				gui4.setbutton_RText(this.getDish());
			}
			else if(buttonString == rice[2])
			{
				this.setDish(rice[2]);
				gui4.setRice(this.getDish());
				gui4.setbutton_RText(this.getDish());
			}
			else if(buttonString == rice[3])
			{
				this.setDish(rice[3]);
				gui4.setRice(this.getDish());
				gui4.setbutton_RText(this.getDish());
			}
			else if(buttonString == rice[4])
			{
				this.setDish(rice[4]);
				gui4.setRice(this.getDish());
				gui4.setbutton_RText(this.getDish());
			}
			else if(buttonString == rice[5])
			{
				this.setDish(rice[5]);
				gui4.setRice(this.getDish());
				gui4.setbutton_RText(this.getDish());
			}
		}
		else if(Size == 5)
		{
			if(buttonString == "นไ1")		
			{
				this.setDish("นไ1");
				gui5.setRice(this.getDish());
				gui5.setbutton_RText(this.getDish());
			}
			else if(buttonString == "นไ2")
			{
				this.setDish("นไ2");
				gui5.setRice(this.getDish());
				gui5.setbutton_RText(this.getDish());
			}
			else if(buttonString == "นไ3")
			{
				this.setDish("นไ3");
				gui5.setRice(this.getDish());
				gui5.setbutton_RText(this.getDish());
			}
			else if(buttonString == "นไ4")
			{
				this.setDish("นไ4");
				gui5.setRice(this.getDish());
				gui5.setbutton_RText(this.getDish());
			}
			else if(buttonString == "นไ5")
			{
				this.setDish("นไ5");
				gui5.setRice(this.getDish());
				gui5.setbutton_RText(this.getDish());
			}
			else if(buttonString == "นไ6")
			{
				this.setDish("นไ6");
				gui5.setRice(this.getDish());
				gui5.setbutton_RText(this.getDish());
			}
		}
		else if(Size == 6)
		{
			if(buttonString == "นไ1")		
			{
				this.setDish("นไ1");
				gui6.setRice(this.getDish());
				gui6.setbutton_RText(this.getDish());
			}
			else if(buttonString == "นไ2")
			{
				this.setDish("นไ2");
				gui6.setRice(this.getDish());
				gui6.setbutton_RText(this.getDish());
			}
			else if(buttonString == "นไ3")
			{
				this.setDish("นไ3");
				gui6.setRice(this.getDish());
				gui6.setbutton_RText(this.getDish());
			}
			else if(buttonString == "นไ4")
			{
				this.setDish("นไ4");
				gui6.setRice(this.getDish());
				gui6.setbutton_RText(this.getDish());
			}
			else if(buttonString == "นไ5")
			{
				this.setDish("นไ5");
				gui6.setRice(this.getDish());
				gui6.setbutton_RText(this.getDish());
			}
			else if(buttonString == "นไ6")
			{
				this.setDish("นไ6");
				gui6.setRice(this.getDish());
				gui6.setbutton_RText(this.getDish());
			}
		}
		this.dispose();
	}
}