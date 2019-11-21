

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

public class menu extends JFrame implements ActionListener {

	private int pagenum;
	private int kindnum;
	public void actionPerformed(ActionEvent e) {
		String buttonString = e.getActionCommand();
		if(buttonString.equals("Back"))//뒤로가기
		{
			if(pagenum == 0)
			{
				//메인메뉴 뒤로가기
			}
			else if(pagenum == 1)
			{
				mainPage gui = new mainPage();
				gui.setVisible(true);	
				pagenum--;
			}
			else if(pagenum == 2)
			{
				ordersizePage gui = new ordersizePage();
				gui.setVisible(true);
				pagenum--;
			}
			else if(pagenum == 3)
			{
				if(kindnum == 4)
				{
					fourSize gui = new fourSize();
					gui.setVisible(true);
					pagenum--;
				}
				else if(kindnum == 5)
				{
					fiveSize gui = new fiveSize();
					gui.setVisible(true);
					pagenum--;
				}
				else if(kindnum == 6)
				{
					sixSize gui = new sixSize();
					gui.setVisible(true);
					pagenum--;
				}
				else if(kindnum == 7)
				{
					seasonMenu gui = new seasonMenu();
					gui.setVisible(true);
					pagenum--;
				}
			}
		}
		else if(buttonString.equals("Basket"))
		{
			//장바구니 페이지
		}
		else if(buttonString.equals("Purchase"))// 주문페이지
		{
			ordersizePage gui = new ordersizePage();
			gui.setVisible(true);
		}
		else if(buttonString.equals("Information"))
		{
			//정보 페이지
		}
	}
	public menu(JPanel panel, int page, int kind)
	{
		pagenum = page;
		kindnum = kind;
		JButton backButton = new JButton("Back");
        //ImageIcon backIcon = new ImageIcon("basketbutton.png");
        backButton.setBounds(0, 636, 256, 128);
        /*backButton.setIcon(backIcon);
        backButton.setBackground(Color.white);
        backButton.setBorderPainted(false);
        backButton.setFocusPainted(false);
        backButton.setContentAreaFilled(false); */
        backButton.addActionListener(this);
        panel.add(backButton);
        
        JButton basketButton = new JButton("Basket");
        basketButton.setBounds(256, 636, 256, 128);
        /* ImageIcon basketIcon = new ImageIcon("basketbutton.png");
        basketButton.setIcon(basketIcon);
        basketButton.setBackground(Color.white);
        basketButton.setBorderPainted(false);
        basketButton.setFocusPainted(false);
        basketButton.setContentAreaFilled(false);*/
        basketButton.addActionListener(this);
        panel.add(basketButton);
        
        JButton orderButton = new JButton("Purchase");
        orderButton.setBounds(512, 636, 256, 128);
        /* ImageIcon orderIcon = new ImageIcon("purchasebutton.png");
        orderButton.setIcon(orderIcon);
        orderButton.setBackground(Color.white);
        orderButton.setBorderPainted(false);
        orderButton.setFocusPainted(false);
        orderButton.setContentAreaFilled(false);*/    
        orderButton.addActionListener(this);
        panel.add(orderButton);
        
        JButton infoButton = new JButton("Information");
        infoButton.setBounds(768, 636, 256, 128);
        /* ImageIcon infoIcon = new ImageIcon("informationbutton.png");
        infoButton.setIcon(infoIcon);
        infoButton.setBackground(Color.white);
        infoButton.setBorderPainted(false);
        infoButton.setFocusPainted(false);
        infoButton.setContentAreaFilled(false);*/
        infoButton.addActionListener(this);
        panel.add(infoButton);
	}
}
