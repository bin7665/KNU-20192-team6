package mainPage;

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
	
	public static final int WIDTH = 600;
	public static final int HEIGHT = 800;
	
	private JPanel infoPanel;
	private JPanel mainPanel;
	private JPanel menuPanel;
	public static String ID = "name";
	
	public static void main(String[] args)
	{
		mainPage gui = new mainPage(ID);
		gui.setVisible(true);
	}
	public mainPage(String ID)
	{
		super("도시락 서비스");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout( ));
        
        infoPanel = new JPanel();
        infoPanel.setBackground(Color.CYAN);
        infoPanel.setLayout(new FlowLayout());
        JLabel pictureLabel = new JLabel("picture");
        infoPanel.add(pictureLabel);
        JLabel emptyLabel = new JLabel("                 ");
        infoPanel.add(emptyLabel);
        JLabel idLabel = new JLabel("ID : " + ID +"");
        idLabel.setBackground(Color.white);
        infoPanel.add(idLabel);
        add(infoPanel, BorderLayout.NORTH);
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.gray);
        mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.PAGE_AXIS));
        mainPanel.add(Box.createRigidArea(new Dimension(118,0)));
        mainPanel.add(Box.createRigidArea(new Dimension(0,150)));
        JButton changeInfo = new JButton("정보 변경");
        changeInfo.setSize(80, 120);
        changeInfo.addActionListener(this);
        mainPanel.add(changeInfo);
        mainPanel.add(Box.createRigidArea(new Dimension(0,100)));
        JButton orderList = new JButton("주문 내역");
        orderList.setSize(80, 120);
        orderList.addActionListener(this);
        mainPanel.add(orderList);
        mainPanel.add(Box.createRigidArea(new Dimension(0,100)));
        JButton inQuire = new JButton("문의 하기");
        inQuire.setSize(80, 120);
        inQuire.addActionListener(this);
        mainPanel.add(inQuire);
        mainPanel.add(Box.createRigidArea(new Dimension(0,100)));
        add(mainPanel, BorderLayout.CENTER);
        menuPanel = new JPanel();
        menuPanel.setBackground(Color.LIGHT_GRAY);
        menuPanel.setLayout(new GridLayout(1, 4));
        
        JButton backButton = new JButton("Back");
        ImageIcon backIcon = new ImageIcon("basketbutton.png");
        /*backButton.setIcon(backIcon);
        backButton.setBackground(Color.white);
        backButton.setBorderPainted(false);
        backButton.setFocusPainted(false);
        backButton.setContentAreaFilled(false); */
        backButton.addActionListener(this);
        menuPanel.add(backButton);
        
        JButton basketButton = new JButton("Basket");
       /* ImageIcon basketIcon = new ImageIcon("basketbutton.png");
        basketButton.setIcon(basketIcon);
        basketButton.setBackground(Color.white);
        basketButton.setBorderPainted(false);
        basketButton.setFocusPainted(false);
        basketButton.setContentAreaFilled(false);*/
        basketButton.addActionListener(this);
        menuPanel.add(basketButton);
        
        JButton orderButton = new JButton("Purchase");
       /* ImageIcon orderIcon = new ImageIcon("purchasebutton.png");
        orderButton.setIcon(orderIcon);
        orderButton.setBackground(Color.white);
        orderButton.setBorderPainted(false);
        orderButton.setFocusPainted(false);
        orderButton.setContentAreaFilled(false);*/
        orderButton.addActionListener(this);
        menuPanel.add(orderButton);
        
        JButton infoButton = new JButton("Information");
       /* ImageIcon infoIcon = new ImageIcon("informationbutton.png");
        infoButton.setIcon(infoIcon);
        infoButton.setBackground(Color.white);
        infoButton.setBorderPainted(false);
        infoButton.setFocusPainted(false);
        infoButton.setContentAreaFilled(false);*/
        infoButton.addActionListener(this);
        menuPanel.add(infoButton);
        
        add(menuPanel, BorderLayout.SOUTH);
	}
	public void actionPerformed(ActionEvent e) {
		String buttonString = e.getActionCommand();
		if(buttonString.equals("정보 변경"))
		{
			//정보 변경 페이지
		}
		else if(buttonString.equals("주문 내역"))
		{
			//주문 내역 페이지
		}
		
		else if(buttonString.equals("문의 하기"))
		{
			//문의하기 페이지
		}
		
		else if(buttonString.equals("Back"))
		{
			//이전페이지
		}
		else if(buttonString.equals("Basket"))
		{
			//장바구니 페이지
		}
		else if(buttonString.equals("Purchase"))
		{
			//주문페이지
		}
		else if(buttonString.equals("Information"))
		{
			//정보 페이지
		}
		
		
	}
}

