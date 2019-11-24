import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class my_page extends JFrame implements ActionListener{
	private int button_width = 400;
	private int button_height = 100;
	
	private String userid;
	
	public my_page() {
		super();
	}
	
	public my_page(String MYID) {
		super();
		userid = MYID;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(log_in.WINDOW_WIDTH, log_in.WINDOW_HEIGHT);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		//user info read
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
			Name.setFont(new Font("Serif", Font.PLAIN, 60));
			Name.setForeground(Color.WHITE);
			InFoPan.add(Name);
			JLabel ID = new JLabel("ID : "+userid);
			ID.setFont(new Font("Serif", Font.PLAIN, 60));
			ID.setForeground(Color.WHITE);
			InFoPan.add(ID);
			
			myPan.add(InFoPan);
			add(myPan, BorderLayout.NORTH);
			
			JPanel buttonPan = new JPanel(null);
			
			JButton ch_info = new JButton("정보변경");
			ch_info.addActionListener(this);
			ch_info.setFont(new Font("", Font.PLAIN, 50));
			ch_info.setBounds( 150, 100, button_width,button_height);
			buttonPan.add(ch_info);
			
			JButton Ord_dir = new JButton("주문내역");
			Ord_dir.addActionListener(this);
			Ord_dir.setFont(new Font("", Font.PLAIN, 50));
			Ord_dir.setBounds( 150, 250, button_width,button_height);
			buttonPan.add(Ord_dir);
			
			JButton Inq = new JButton("문의하기");
			Inq.addActionListener(this);
			Inq.setFont(new Font("", Font.PLAIN, 50));
			Inq.setBounds( 150, 400, button_width,button_height);
			buttonPan.add(Inq);

			menu menuPan = new menu(this.getWidth(), this.getHeight(), 1, 0, userid);
			menuPan.setLocation(0,1024-380);
			buttonPan.add(menuPan);
			add(buttonPan, BorderLayout.CENTER);
			
		}catch(FileNotFoundException e1) {
			System.out.println("Cannot find datafile.");
		}catch(ClassNotFoundException e1) {
			System.out.println("Problems with file input");
		}catch(IOException e1) {
			System.out.println("Problems with file input.");
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();

		//change information
		if (actionCommand.equals("정보변경")) {
			ch_inf newpage1 = new ch_inf(userid);
			newpage1.setVisible(true);
		} 
		//order detail
		else if (actionCommand.equals("주문내역")) {
			Order_dir newpage2 = new Order_dir(userid);
			newpage2.setVisible(true);
		}

		//Inquiry
		else if (actionCommand.equals("문의하기")) {
			inquiry newpage3 = new inquiry();
			newpage3.setVisible(true);
		} else {
			System.err.println("Error");
		}
	}
}
