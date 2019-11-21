

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

public class seasonMenu extends JFrame implements ActionListener{
	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	public static String ID = "name";
	private JPanel sizePanel;

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public seasonMenu(String ID)
	{
		super("도시락 크기 선정");
		setSize(WIDTH, HEIGHT);
		setLayout(new BorderLayout());
		sizePanel = new JPanel();
		sizePanel.setLayout(null);
		JButton foursize = new JButton("Spring");
		foursize.setBounds(285, 40, 400, 90);
		foursize.addActionListener(this);
		sizePanel.add(foursize);
		JButton fivesize = new JButton("Summer");
		fivesize.setBounds(285, 170, 400, 90);
		fivesize.addActionListener(this);
		sizePanel.add(fivesize);
		JButton sixsize = new JButton("Autumn");
		sixsize.setBounds(285, 300, 400, 90);
		sixsize.addActionListener(this);
		sizePanel.add(sixsize);
		JButton specialmenu = new JButton("Winter");
		specialmenu.setBounds(285, 430, 400, 90);
		specialmenu.addActionListener(this);
		sizePanel.add(specialmenu);
		JButton order = new JButton("주문하기");
		order.setBounds(285, 580, 400, 90);
		order.addActionListener(this);
		sizePanel.add(order);
		add(sizePanel, BorderLayout.CENTER);
	}
}
