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

public class menu extends JFrame implements ActionListener {

	private String ID = "name";
	public void actionPerformed(ActionEvent e) {
		String buttonString = e.getActionCommand();
		if(buttonString.equals("Back"))
		{
			//����������
		}
		else if(buttonString.equals("Basket"))
		{
			//��ٱ��� ������
		}
		else if(buttonString.equals("Purchase"))
		{
			ordersizePage gui = new ordersizePage(ID);
			gui.setVisible(true);
		}
		else if(buttonString.equals("Information"))
		{
			//���� ������
		}
	}
	public menu(JPanel panel)
	{
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