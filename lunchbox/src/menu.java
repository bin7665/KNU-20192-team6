import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu extends JPanel implements ActionListener {
	private String userid;
	private JFrame cur;
	private int button_size;
	
	public menu() {
		super();
	}
	
	public menu(int width, int height, JFrame page, String ID)
	{
		cur = page;
		userid = ID;
		button_size = width/4;
		setLocation(0, height-140);
		setSize(width,128);
		setLayout(null);

		JButton backButton = new JButton("Back");
        backButton.setBounds(0, 0, button_size, 100);
        backButton.setBackground(Color.WHITE);
        //plus image
        ImageIcon Icon1 = new ImageIcon("src/backbutton.png");
        Image img1 = Icon1.getImage();
		Image newimg1 = img1.getScaledInstance(button_size, 100, java.awt.Image.SCALE_SMOOTH);
		Icon1 = new ImageIcon(newimg1);
		backButton.setIcon(Icon1);
		//end plus image		
        backButton.addActionListener(this);
        this.add(backButton);
        
        JButton basketButton = new JButton("Basket");
        basketButton.setBounds(button_size, 0, button_size, 100);
        basketButton.setBackground(Color.WHITE);
        //plus image
        ImageIcon Icon2 = new ImageIcon("src/basketbutton.png");
        Image img2 = Icon2.getImage();
		Image newimg2 = img2.getScaledInstance(button_size, 100, java.awt.Image.SCALE_SMOOTH);
		Icon2 = new ImageIcon(newimg2);
		basketButton.setIcon(Icon2);
		//end plus image
        basketButton.addActionListener(this);
        this.add(basketButton);
        
        JButton orderButton = new JButton("Purchase");
        orderButton.setBounds(button_size*2, 0, button_size, 100);
        orderButton.setBackground(Color.WHITE);
        //plus image
        ImageIcon Icon3 = new ImageIcon("src/purchasebutton.png");
        Image img3 = Icon3.getImage();
		Image newimg3 = img3.getScaledInstance(button_size-20, 100, java.awt.Image.SCALE_SMOOTH);
		Icon3 = new ImageIcon(newimg3);
		orderButton.setIcon(Icon3);
		//end plus image
        orderButton.addActionListener(this);
        this.add(orderButton);
        
        JButton infoButton = new JButton("Information");
        infoButton.setBounds(button_size*3, 0, button_size, 100);
        infoButton.setBackground(Color.WHITE);
        //plus image
        ImageIcon Icon4 = new ImageIcon("src/informationbutton.png");
        Image img4 = Icon4.getImage();
		Image newimg4 = img4.getScaledInstance(button_size, 100, java.awt.Image.SCALE_SMOOTH);
		Icon4 = new ImageIcon(newimg4);
		infoButton.setIcon(Icon4);
		//end plus image
        infoButton.addActionListener(this);
        this.add(infoButton);
	}
	
	public void actionPerformed(ActionEvent e) {
		String buttonString = e.getActionCommand();
		if(buttonString.equals("Back"))//뒤로가기
		{
			cur.dispose();
			if(cur.getClass().getName() == "my_page") {
				log_in newpage = new log_in();
				newpage.setVisible(true);
			}
		}
		else if(buttonString.equals("Basket"))
		{
			Basket gui = new Basket(userid);
			gui.setVisible(true);
			gui.setLocationRelativeTo(null);
		}
		else if(buttonString.equals("Purchase"))// 주문페이지
		{
			ordersizePage gui = new ordersizePage(userid);
			gui.setVisible(true);
			gui.setLocationRelativeTo(null);
		}
		else if(buttonString.equals("Information"))
		{
			//정보 페이지
			infoPage gui = new infoPage(userid);
			gui.setVisible(true);
			gui.setLocationRelativeTo(null);
		}
	}
}
