

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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

public class orderComplete_basket extends JFrame implements ActionListener {

	private JPanel menuPanel;
	private String name;
	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	
	public orderComplete_basket(String user, int kind)
	{
		super("장바구니에 담기 완료");
		setLocation(450,150);
		name = user;
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout( ));
        menuPanel = new JPanel();
        menuPanel.setLayout(null);
        JLabel comPlete = new JLabel("장바구니에 담기가 완료 되었습니다.");
        comPlete.setBounds(400, 100, 400, 180);
        comPlete.setBackground(Color.GREEN);
		menuPanel.add(comPlete);
		JButton phoneNum = new JButton("배달 정보 보기 ");
		phoneNum.setBounds(300, 430, 400, 90);
		menuPanel.add(phoneNum);
		JButton orderList = new JButton("장바구니 창 가기");
		orderList.setBounds(300, 550, 400, 90);
		orderList.addActionListener(this);
		menuPanel.add(orderList);
        add(menuPanel, BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent e) {
		String buttonString = e.getActionCommand();
		if(buttonString.equals("배달 정보 보기")){
			
		}
		else if(buttonString.equals("장바구니 창 가기")){
			dispose();
			Basket gui = new Basket(name);
			gui.setVisible(true);
			gui.setLocationRelativeTo(null);
		}
	}
}



