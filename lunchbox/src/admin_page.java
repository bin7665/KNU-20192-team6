import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class admin_page extends JFrame implements ActionListener{
	private int button_width = 400;
	private int button_height = 100;
	private String[] sidedish = new String[12];
	private String[] rice = new String[6];
	private String userid;
	
	public admin_page() {
		super();
	}
	
	public admin_page(String MYID) {
		super();
		userid = MYID;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(log_in.WINDOW_WIDTH, log_in.WINDOW_HEIGHT);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		//user info read
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(userid));;
			Administer readone = (Administer)inputStream.readObject();
			
			JPanel myPan = new JPanel();
			myPan.setLayout(new GridLayout(1,2));
			myPan.setBackground(Color.BLUE);
			
			JLabel myLabel = new JLabel();
			ImageIcon MyIcon = new ImageIcon("src/admin.jpg");
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
			
			JButton ch_info = new JButton("재고관리");
			ch_info.addActionListener(this);
			ch_info.setFont(new Font("", Font.PLAIN, 50));
			ch_info.setBounds( 184, 160, button_width,button_height);
			buttonPan.add(ch_info);
			
			JButton Ord_dir = new JButton("문의내역");
			Ord_dir.addActionListener(this);
			Ord_dir.setFont(new Font("", Font.PLAIN, 50));
			Ord_dir.setBounds( 184, 380, button_width,button_height);
			buttonPan.add(Ord_dir);
			
			menu menuPan = new menu(this.getWidth(), this.getHeight(), this, userid);
			menuPan.setLocation(0,1024-400);
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
		if (actionCommand.equals("재고관리")) {
			 inventory_control  newpage1 = new inventory_control();
			 newpage1.setVisible(true);
		} 
		//order detail
		else if (actionCommand.equals("문의내역")) {
			Order_dir newpage2 = new Order_dir(userid);
			newpage2.setVisible(true);
		}else {
			System.err.println("Error");
		}
	}
}
