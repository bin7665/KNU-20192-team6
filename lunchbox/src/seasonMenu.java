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
	private String name;
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
		else if(buttonString.equals("�ֹ��ϱ�"))
		{
			order gui = new order(name, 7);
			gui.setVisible(true);
		}
		
	}
	public seasonMenu()
	{
		super("���ö� ũ�� ����");
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
		JButton order = new JButton("�ֹ��ϱ�");
		order.setBounds(285, 500, 400, 90);
		order.addActionListener(this);
		sizePanel.add(order);
		menu gui = new menu(this.getWidth(), this.getHeight(), 2 ,0, name);
	    sizePanel.add(gui);
		add(sizePanel, BorderLayout.CENTER);
	}
}

