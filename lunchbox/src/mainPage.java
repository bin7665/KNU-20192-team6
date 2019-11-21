

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

public class mainPage extends JFrame implements ActionListener {
	
	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	public static int pagenum = 0;
	private JPanel menuPanel;
	
	public static void main(String[] args)
	{
		mainPage gui = new mainPage();
		gui.setVisible(true);
	}
	public mainPage()
	{
		super("도시락 서비스");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout( ));
        menuPanel = new JPanel();
        menuPanel.setLayout(null);
        JPanel infoPanel = new JPanel();
        infoPanel.setBounds(0, 0, 1024, 128);
        infoPanel.setBackground(Color.CYAN);
        JLabel pictureLabel = new JLabel("picture");
        pictureLabel.setBounds(256, 64, 128, 64);
        infoPanel.add(pictureLabel);
        JLabel idLabel = new JLabel("ID : name");
        idLabel.setBounds(512, 64, 128, 64);
        idLabel.setBackground(Color.white);
        infoPanel.add(idLabel);
        menuPanel.add(infoPanel);
        JButton changeInfo = new JButton("정보 변경");
        changeInfo.setBounds(300, 200, 400, 90);
        changeInfo.addActionListener(this);
		menuPanel.add(changeInfo);
		JButton orderList = new JButton("주문 내역");
		orderList.setBounds(300, 340, 400, 90);
		orderList.addActionListener(this);
		menuPanel.add(orderList);
		JButton inQuire = new JButton("문의 하기");
		inQuire.setBounds(300, 480, 400, 90);
		inQuire.addActionListener(this);
		menuPanel.add(inQuire);
		menu gui = new menu(menuPanel, 0, 0);
        add(menuPanel, BorderLayout.CENTER);
	}
        
	public void actionPerformed(ActionEvent e) {
	}	
}

