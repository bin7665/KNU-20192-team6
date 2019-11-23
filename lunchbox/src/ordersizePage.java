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


public class ordersizePage extends JFrame implements ActionListener {

	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	private JPanel sizePanel;

	public ordersizePage(String name)
	{
		super("���ö� ũ�� ����");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		sizePanel = new JPanel();
		sizePanel.setLayout(null);
		JButton foursize = new JButton("(��, ��, ���� 2��) or (��, ���� 3��)");
		foursize.setBounds(285, 80, 400, 90);
		foursize.addActionListener(this);
		sizePanel.add(foursize);
		JButton fivesize = new JButton("(��, ��, ���� 3��) or (��, ���� 4��)");
		fivesize.setBounds(285, 220, 400, 90);
		fivesize.addActionListener(this);
		sizePanel.add(fivesize);
		JButton sixsize = new JButton("(��, ��, ���� 4��) or (��, ���� 5��)");
		sixsize.setBounds(285, 360, 400, 90);
		sixsize.addActionListener(this);
		sizePanel.add(sixsize);
		JButton specialmenu = new JButton("���� ����");
		specialmenu.setBounds(285, 500, 400, 90);
		specialmenu.addActionListener(this);
		sizePanel.add(specialmenu);
		menu gui = new menu(sizePanel, 1, 0);
		gui.setVisible(true);
		add(sizePanel, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		String buttonString = e.getActionCommand();
		if(buttonString.equals("(��, ��, ���� 2��) or (��, ���� 3��)"))
		{
			fourSize gui = new fourSize();
			gui.setVisible(true);
		}
		else if(buttonString.equals("(��, ��, ���� 3��) or (��, ���� 4��)"))
		{
			fiveSize gui = new fiveSize();
			gui.setVisible(true);
		}
		else if(buttonString.equals("(��, ��, ���� 4��) or (��, ���� 5��)"))
		{
			sixSize gui = new sixSize();
			gui.setVisible(true);
		}
		else if(buttonString.equals("���� ����"))
		{
			seasonMenu gui = new seasonMenu();
			gui.setVisible(true);
		}
		
	}

}

