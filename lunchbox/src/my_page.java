import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class my_page extends JFrame implements ActionListener{
	private int button_width = 400;
	private int button_height = 100;
	private int LEFT_PADDING = 100;
	private int RIGHT_PADDING = 100;
	
	public my_page() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(log_in.WINDOW_WIDTH, log_in.WINDOW_HEIGHT);
		setLayout(new BorderLayout());
		
		JPanel myPan = new JPanel();
		myPan.setLayout(new FlowLayout(FlowLayout.CENTER));
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
		
		//String myid = get_id();
		JLabel ID = new JLabel("ID : myid");
		ID.setFont(new Font("Serif", Font.PLAIN, 80));
		ID.setForeground(Color.WHITE);
		myPan.add(ID);
		add(myPan, BorderLayout.NORTH);
		
		//JPanel buttonPan = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel buttonPan = new JPanel();
		
		JButton ch_info = new JButton("정보변경");
		ch_info.setFont(new Font("", Font.PLAIN, 50));
		ch_info.setPreferredSize(new Dimension(button_width,button_height));
		buttonPan.add(ch_info);
		
		JButton Ord_dir = new JButton("주문내역");
		Ord_dir.setFont(new Font("", Font.PLAIN, 50));
		Ord_dir.setPreferredSize(new Dimension(button_width,button_height));
		buttonPan.add(Ord_dir);
		
		JButton Inq = new JButton("문의하기");
		Inq.setFont(new Font("", Font.PLAIN, 50));
		Inq.setPreferredSize(new Dimension(button_width,button_height));
		buttonPan.add(Inq);
		
		//page button add...
		//here...
		
		add(buttonPan, BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();

		//change information
		if (actionCommand.equals("정보변경")) {
			//
		} 
		//order detail
		else if (actionCommand.equals("주문내역")) {
			//
		}

		//Inquiry
		else if (actionCommand.equals("문의하기")) {
			//
		} else {
			System.err.println("Error");
		}
	}
}
