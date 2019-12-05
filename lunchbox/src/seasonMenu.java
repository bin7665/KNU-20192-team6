

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

public class seasonMenu extends JFrame implements ActionListener{
	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	private String name;
	private lunchbox temp;
	private String seasonmenu;
	private JPanel sizePanel;

	public void actionPerformed(ActionEvent e) {
		String buttonString = e.getActionCommand();
		if(buttonString.equals("Spring"))
		{
			
		}
		else if(buttonString.equals("Summer"))
		{
			
		}
		else if(buttonString.equals("Autumn"))
		{
			
		}
		else if(buttonString.equals("Winter"))
		{
		
		}
		else if(buttonString.equals("주문하기"))
		{
			temp = new lunchbox(seasonmenu);
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
			order gui = new order(name, 7);
			gui.setVisible(true);
			this.dispose();
		}
		
	}
	public seasonMenu(String user)
	{
		super("도시락 크기 선정");
		name = user;  
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		sizePanel = new JPanel();
		sizePanel.setLayout(null);
		JButton foursize = new JButton("Spring");
		foursize.setBounds(285, 40, 400, 80);
		foursize.addActionListener(this);
		sizePanel.add(foursize);
		JButton fivesize = new JButton("Summer");
		fivesize.setBounds(285, 150, 400, 90);
		fivesize.addActionListener(this);
		sizePanel.add(fivesize);
		JButton sixsize = new JButton("Autumn");
		sixsize.setBounds(285, 260, 400, 80);
		sixsize.addActionListener(this);
		sizePanel.add(sixsize);
		JButton specialmenu = new JButton("Winter");
		specialmenu.setBounds(285, 370, 400, 80);
		specialmenu.addActionListener(this);
		sizePanel.add(specialmenu);
		JButton order = new JButton("주문하기");
		order.setBounds(285, 500, 400, 90);
		order.addActionListener(this);
		sizePanel.add(order);
		menu gui = new menu(this.getWidth(), this.getHeight(), this, name);
	    sizePanel.add(gui);
		add(sizePanel, BorderLayout.CENTER);
	}
}

