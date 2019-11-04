import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Order_dir extends JFrame implements ActionListener{
	public Order_dir() {
		super();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(log_in.WINDOW_WIDTH, log_in.WINDOW_HEIGHT);
		setLayout(new BorderLayout());
		
		JPanel myPan = new JPanel();
		myPan.setLayout(new FlowLayout(FlowLayout.CENTER));
		myPan.setBackground(Color.BLUE);
		
		JLabel myLabel = new JLabel();
		ImageIcon MyIcon = new ImageIcon("src/kakao.jpg");
		//image size change
		Image img = MyIcon.getImage();
		Image newimg = img.getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
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
		
		//order directory
		//here...
	}
	
	public void actionPerformed(ActionEvent e) {
	
	}
}
