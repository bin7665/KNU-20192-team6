import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Basket extends JFrame implements ActionListener{
	private static int LWIDTH = 768;
	private static int LHEIGHT = 100;
	private String userid;
	public Basket() {
		super();
	}
	
	public Basket(String UID) {
		super();
		userid = UID;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(log_in.WINDOW_WIDTH, log_in.WINDOW_HEIGHT);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("user_"+ userid));
			User readone = (User)inputStream.readObject();
			
			JPanel myPan = new JPanel();
			myPan.setLayout(new GridLayout(1,2));
			myPan.setBackground(Color.BLUE);
			
			JLabel myLabel = new JLabel();
			ImageIcon MyIcon = new ImageIcon("src/kakao.jpg");
			//image size change
			Image img = MyIcon.getImage();
			Image newimg = img.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
			MyIcon = new ImageIcon(newimg);
			myLabel.setIcon(MyIcon);
			myLabel.setBorder(BorderFactory.createEmptyBorder(50,50,10,50));
			myPan.add(myLabel);
			
			JPanel InFoPan = new JPanel(new GridLayout(2,1));
			InFoPan.setBackground(Color.BLUE);
			JLabel Name = new JLabel(readone.getname());
			Name.setFont(new Font("Serif", Font.PLAIN | Font.BOLD, 60));
			Name.setForeground(Color.WHITE);
			InFoPan.add(Name);
			JLabel ID = new JLabel("ID : "+userid);
			ID.setFont(new Font("Serif", Font.PLAIN | Font.BOLD, 60));
			ID.setForeground(Color.WHITE);
			InFoPan.add(ID);
			
			myPan.add(InFoPan);
			add(myPan, BorderLayout.NORTH);
			
			JPanel BasketPan = new JPanel();
			BasketPan.setLayout(null);
			
			JScrollPane scrollbar = new JScrollPane(BasketPan);
			scrollbar.setBounds(740,260,12,725);
			scrollbar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			scrollbar.setViewportView(BasketPan);
			add(scrollbar);
			
			int length = readone.getbasket_num();
			lunchbox[] basket = readone.getbasket();
			if(length > 0) {
				JButton BasketButton[] = new JButton[length];
				for(int i=0, j=length-1; i<length && j>=0; i++, j--) {
					BasketButton[i] = new JButton(basket[j].toString());
					BasketButton[i].addActionListener(this);
					BasketButton[i].setFont(new Font("", Font.PLAIN, 50));
					BasketButton[i].setHorizontalAlignment(JButton.CENTER);
					BasketButton[i].setBounds( 0, 0+i*LHEIGHT, LWIDTH-30, LHEIGHT);
					BasketButton[i].setBackground(new Color(238,238,238));
					BasketPan.add(BasketButton[i]);
				}
			}else {
				JLabel BasketLabel = new JLabel("No Basket list");
				BasketLabel.setFont(new Font("", Font.PLAIN, 100));
				BasketLabel.setHorizontalAlignment(JLabel.CENTER);
				BasketLabel.setBounds( 0, 100, LWIDTH, LHEIGHT);
				BasketPan.add(BasketLabel);
			}
			add(BasketPan, BorderLayout.CENTER);
			
		}catch(FileNotFoundException e1) {
			System.out.println("Cannot find datafile.");
		}catch(ClassNotFoundException e1) {
			System.out.println("Problems with file input");
		}catch(IOException e1) {
			System.out.println("Problems with file input.");
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		dispose();
		
		Object o = e.getSource();
		JButton Bo = (JButton) o;
		String Txt = Bo.getText();
		String[] Str = Txt.split(" ");
		
		if(Str.length == 4) {
			fourSize gui =new fourSize(userid, Str[0], Str[1], Str[2], Str[3]);
			gui.setVisible(true);
		}
		else if(Str.length == 5) {
			//order_box = new lunchbox(Str[0], Str[1], Str[2], Str[3], Str[4]);
		}
		else {
			//order_box = new lunchbox(Str[0], Str[1], Str[2], Str[3], Str[4], Str[5]);
		}
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(new Color(222, 238, 247));
		g.setFont(new Font("Couruer New", Font.BOLD, 28));
		g.drawString("BASKET", 100, 75);
	}
}
