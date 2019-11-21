import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class log_in extends JFrame implements ActionListener{
	public static final int WINDOW_WIDTH = 768;//98*8
	public static final int WINDOW_HEIGHT = 1024;//128*8
	private JButton login;//log in
	private JButton join;//join membership
	private JTextField ID;
	private JTextField PW;
	
	public log_in() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setLocationRelativeTo(null);
		
		setBackground(Color.lightGray);
		setLayout(new BorderLayout());
		
		JLabel lunchlab = new JLabel();
		ImageIcon lunchIcon = new ImageIcon("src/lunchbox.jpg");
		//image size change
		Image img = lunchIcon.getImage();
		Image newimg = img.getScaledInstance(400, 500, java.awt.Image.SCALE_SMOOTH);
		lunchIcon = new ImageIcon(newimg);
		lunchlab.setIcon(lunchIcon);
		lunchlab.setBorder(BorderFactory.createEmptyBorder(80,160,10,10));
		add(lunchlab, BorderLayout.NORTH);
		
		JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		ID = new JTextField(15);
		ID.setFont(new Font("Serif", Font.PLAIN, 30));
		ID.setEditable(true);
		ID.setBackground(Color.white);
		JLabel IDlab = new JLabel("ID:");
		IDlab.setBorder(BorderFactory.createEmptyBorder(10,12,10,0));//up,left,down,right PADDING
		IDlab.setFont(new Font("Serif", Font.PLAIN, 30));
		inputPanel.add(IDlab);
		inputPanel.add(ID);
		
		PW = new JTextField(15);
		PW.setFont(new Font("Serif", Font.PLAIN, 30));
		PW.setEditable(true);
		PW.setBackground(Color.white);
		JLabel PWlab = new JLabel("PW:");
		PWlab.setFont(new Font("Serif", Font.PLAIN, 30));
		inputPanel.add(PWlab);
		inputPanel.add(PW);
		
		inputPanel.setBorder(BorderFactory.createEmptyBorder(50,150,50,150));
		add(inputPanel, BorderLayout.CENTER);
		
		JPanel buttonPanel =new JPanel(new FlowLayout());
		login = new JButton("login");
		login.addActionListener(this);
		login.setPreferredSize(new Dimension(200,50));
		buttonPanel.add(login);
		join = new JButton("join");
		join.addActionListener(this);
		join.setPreferredSize(new Dimension(200,50));
		buttonPanel.add(join);
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(10,150,50,150));
		
		add(buttonPanel, BorderLayout.SOUTH);
	}
	
	//button action
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		String userid = ID.getText();
		String userpw = PW.getText();
		
		class confirmWindow extends JFrame implements ActionListener{
			JLabel confirmLabel;
			JPanel buttonPanel;
			public confirmWindow() {
				setSize(200, 100);
				getContentPane().setBackground(Color.YELLOW);
				setLocationRelativeTo(null);
				setLayout(new BorderLayout());
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				setLocation(49*6, 64*7);
				confirmLabel = new JLabel("   ");
				add(confirmLabel, BorderLayout.CENTER);
				
				buttonPanel = new JPanel();
				buttonPanel.setBackground(Color.YELLOW);
				buttonPanel.setLayout(new FlowLayout());
				
				JButton exitButton = new JButton("확인");
				exitButton.addActionListener(this);
				buttonPanel.add(exitButton);
				
				add(buttonPanel, BorderLayout.SOUTH);
			}
			
			public void setmessage(String msg) {
				confirmLabel.setText("   "+msg);
			}
			
			public void actionPerformed(ActionEvent e) {
				String actionCommand = e.getActionCommand();
				if(actionCommand.contentEquals("확인")) {
					dispose();
				}
				else
					System.out.println("error!");
			}
		}//End of inner class ConfirmWindow
		
		if(actionCommand.equals("login")) {
			if(true) {
				//check the ID
				File id_f = new File("user_" +userid);
				if(id_f.isFile()) {
					//check pw
					try{
						ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("user_" + userid));
						User readone = (User)inputStream.readObject();
						if(PW.getText().equals(readone.getpw())) {
							//go to the my page
							my_page new_page = new my_page(ID.getText());
							new_page.setVisible(true);
							this.setVisible(false);
						}
						else {//invalid pw
							confirmWindow confirm = new confirmWindow();
							confirm.setmessage("pw가 일치하지않습니다.");
							confirm.setVisible(true);
						}
					}catch(FileNotFoundException e1) {
						System.out.println("Cannot find datafile.");
					}catch(ClassNotFoundException e1) {
						System.out.println("Problems with file input");
					}catch(IOException e1) {
						System.out.println("Problems with file input.");
					}
				}
				else {//invalid id
					confirmWindow confirm = new confirmWindow();
					confirm.setmessage("존재하지 않는 ID입니다.");
					confirm.setVisible(true);
				}
			}
		}
		else if(actionCommand.contentEquals("join")) {
			//go to the join membership page
			join_page new_page = new join_page();
			new_page.setVisible(true);
		}
		else {
			System.err.println("Error");
		}
	}
	
//for the test main function	
	public static void main(String[] args) {
		log_in page1 = new log_in();
		page1.setVisible(true);
	}

}
