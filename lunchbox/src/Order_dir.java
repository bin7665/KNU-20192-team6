import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.StringTokenizer;

public class Order_dir extends JFrame implements ActionListener{
	private String userid;
	private static int LWIDTH = 768;
	private static int LHEIGHT = 100;
	public Order_dir() {
		super();
	}
	
	public Order_dir(String MYID) {
		super();
		userid = MYID;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(log_in.WINDOW_WIDTH, log_in.WINDOW_HEIGHT);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("user_"+ MYID));
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
			Name.setFont(new Font("Serif", Font.PLAIN, 60));
			Name.setForeground(Color.WHITE);
			InFoPan.add(Name);
			JLabel ID = new JLabel("ID : "+MYID);
			ID.setFont(new Font("Serif", Font.PLAIN, 60));
			ID.setForeground(Color.WHITE);
			InFoPan.add(ID);
			
			myPan.add(InFoPan);
			add(myPan, BorderLayout.NORTH);
			
			//readone.order or readone.lunchbox class update
			//and here...
			JPanel orderPan = new JPanel();
			orderPan.setLayout(null);
			
			JScrollPane scrollbar = new JScrollPane();
			scrollbar.setBounds(740,260,12,725);
			scrollbar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			scrollbar.setViewportView(orderPan);
			add(scrollbar);
			
			//get lunchbox
			int length = readone.getbox_num();
			lunchbox[] box = readone.getbox();
			if(length > 0) {
				JButton orderButton[] = new JButton[length];
				for(int i=0, j=length-1; i<length && j>=0; i++, j--) {
					orderButton[i] = new JButton(box[j].toString());
					orderButton[i].addActionListener(this);
					orderButton[i].setFont(new Font("", Font.PLAIN, 30));
					orderButton[i].setHorizontalAlignment(JButton.CENTER);
					orderButton[i].setBounds( 0, 0+i*LHEIGHT, LWIDTH-30, LHEIGHT);
					orderButton[i].setBackground(new Color(238,238,238));
					orderPan.add(orderButton[i]);
				}
			}else {
				JLabel orderLabel = new JLabel("No order list");
				orderLabel.setFont(new Font("", Font.PLAIN, 100));
				orderLabel.setHorizontalAlignment(JLabel.CENTER);
				orderLabel.setBounds( 0, 100, LWIDTH, LHEIGHT);
				orderPan.add(orderLabel);
			}
			add(orderPan, BorderLayout.CENTER);
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
		g.drawString("ORDER_LIST", 70, 75);
	}
}
