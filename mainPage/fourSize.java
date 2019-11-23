
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

public class fourSize extends JFrame implements ActionListener{

	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	private JPanel sizePanel;
	
	public void actionPerformed(ActionEvent e) {
		String buttonString = e.getActionCommand();
		if(buttonString.equals("반찬."))
		{
			
		}
		else if(buttonString.equals("반찬.."))
		{
			
		}
		else if(buttonString.equals("반찬 or 국"))
		{
		
		}
		else if(buttonString.equals("밥"))
		{
		
		}
		else if(buttonString.equals("주문하기"))
		{
			order gui = new order(4);
			gui.setVisible(true);
		}
	}
	public fourSize()	
	{
		super("메뉴 정하기");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		sizePanel = new JPanel();
		sizePanel.setLayout(null);
		JButton sideDish1 = new JButton("반찬.");
		sideDish1.setBounds(200, 50, 285, 200);
		sideDish1.addActionListener(this);
		sizePanel.add(sideDish1);
		JButton sideDish2 = new JButton("반찬..");
		sideDish2.setBounds(485, 50, 285, 200);
		sideDish2.addActionListener(this);
		sizePanel.add(sideDish2);
		JButton rice = new JButton("밥");
		rice.setBounds(200, 250, 325, 200);
		rice.addActionListener(this);
		sizePanel.add(rice);
		JButton sideDish3 = new JButton("반찬 or 국");
		sideDish3.setBounds(525, 250, 245, 200);
		sideDish3.addActionListener(this);
		sizePanel.add(sideDish3);
		JButton order = new JButton("주문하기");
		order.setBounds(285, 500, 400, 90);
		order.addActionListener(this);
		sizePanel.add(order);
		menu gui = new menu(sizePanel, 2, 0);
		add(sizePanel, BorderLayout.CENTER);
	
	}

}
