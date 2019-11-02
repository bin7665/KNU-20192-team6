import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class join_page extends JFrame implements ActionListener{
	private JTextField name;
	private JTextField ID;
	private JTextField pw;
	private JTextField confirm_pw;
	private JTextField phone_num;
	private JTextField address;
	private JButton join;
	
	private int Text_Field_width=440;
	private int Text_Field_height=50;
	
	private int LEFT_PADDING = 100;
	private int RIGHT_PADDING = 100;
	
	public join_page() {
		super();
		setTitle("join our membership!");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(log_in.WINDOW_WIDTH-98, log_in.WINDOW_HEIGHT-128);
		setLocation(49,64);
		setLayout(new GridLayout(7,1));
		
		JPanel namePan = new JPanel(new FlowLayout(FlowLayout.LEFT));
		name = new JTextField("성명");
		name.setHorizontalAlignment(JTextField.CENTER);
		name.setPreferredSize(new Dimension(Text_Field_width,Text_Field_height));
		name.addMouseListener(new MouseEventDemo());
		namePan.add(name);
		namePan.setBorder(BorderFactory.createEmptyBorder(30,LEFT_PADDING,10,RIGHT_PADDING));
		add(namePan);
		
		JPanel IDPan = new JPanel(new FlowLayout(FlowLayout.LEFT));
		ID = new JTextField("아이디");
		ID.setHorizontalAlignment(JTextField.CENTER);
		ID.setPreferredSize(new Dimension(Text_Field_width-90,Text_Field_height));
		ID.addMouseListener(new MouseEventDemo());
		JButton check_duplicate = new JButton("중복 확인");
		check_duplicate.setFont(new Font("Serif", Font.PLAIN | Font.BOLD, 10));
		IDPan.add(ID);
		IDPan.add(check_duplicate);
		IDPan.setBorder(BorderFactory.createEmptyBorder(30,LEFT_PADDING,10,RIGHT_PADDING));
		add(IDPan);
		
		JPanel pwPan = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pw = new JTextField("비밀번호");
		pw.setHorizontalAlignment(JTextField.CENTER);
		pw.setPreferredSize(new Dimension(Text_Field_width,Text_Field_height));
		pw.addMouseListener(new MouseEventDemo());
		pwPan.add(pw);
		pwPan.setBorder(BorderFactory.createEmptyBorder(30,LEFT_PADDING,10,RIGHT_PADDING));
		add(pwPan);
		
		JPanel c_pwPan = new JPanel(new FlowLayout(FlowLayout.LEFT));
		confirm_pw = new JTextField("비밀번호 확인");
		confirm_pw.setHorizontalAlignment(JTextField.CENTER);
		confirm_pw.setPreferredSize(new Dimension(Text_Field_width,Text_Field_height));
		confirm_pw.addMouseListener(new MouseEventDemo());
		c_pwPan.add(confirm_pw);
		c_pwPan.setBorder(BorderFactory.createEmptyBorder(30,LEFT_PADDING,10,RIGHT_PADDING));
		add(c_pwPan);
		
		JPanel phonePan = new JPanel(new FlowLayout(FlowLayout.LEFT));
		phone_num = new JTextField("핸드폰 번호");
		phone_num.setHorizontalAlignment(JTextField.CENTER);
		phone_num.setPreferredSize(new Dimension(Text_Field_width,Text_Field_height));
		phone_num.addMouseListener(new MouseEventDemo());
		phonePan.add(phone_num);
		phonePan.setBorder(BorderFactory.createEmptyBorder(30,LEFT_PADDING,10,RIGHT_PADDING));
		add(phonePan);
		
		JPanel addPan = new JPanel(new FlowLayout(FlowLayout.LEFT));
		address = new JTextField("주소");
		address.setHorizontalAlignment(JTextField.CENTER);
		address.setPreferredSize(new Dimension(Text_Field_width,Text_Field_height*2));
		address.addMouseListener(new MouseEventDemo());
		addPan.add(address);
		addPan.setBorder(BorderFactory.createEmptyBorder(0,LEFT_PADDING,0,RIGHT_PADDING));
		add(addPan);
		
		JPanel joinPan = new JPanel(new FlowLayout());
		JButton join_confirm = new JButton("회원가입");
		join_confirm.addActionListener(this);
		join_confirm.setPreferredSize(new Dimension(Text_Field_width,Text_Field_height));
		joinPan.add(join_confirm);
		joinPan.setBorder(BorderFactory.createEmptyBorder(0,LEFT_PADDING,0,RIGHT_PADDING));
		add(joinPan);
	}
	
	public class MouseEventDemo implements MouseListener, MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			Object o = e.getSource();
			JTextField To = (JTextField)o;
			To.setText("");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if(actionCommand.contentEquals("회원가입")) {
			//pw == confirm_pw(valid pw)
			class confirmWindow extends JFrame implements ActionListener{
				public confirmWindow() {
					setSize(200, 100);
					getContentPane().setBackground(Color.YELLOW);
					setLayout(new BorderLayout());
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
					setLocation(49*6, 64*7);
					JLabel confirmLabel = new JLabel("   회원가입이 완료되었습니다.");
					add(confirmLabel, BorderLayout.CENTER);
					
					JPanel buttonPanel = new JPanel();
					buttonPanel.setBackground(Color.YELLOW);
					buttonPanel.setLayout(new FlowLayout());
					
					JButton exitButton = new JButton("확인");
					exitButton.addActionListener(this);
					buttonPanel.add(exitButton);
					
					add(buttonPanel, BorderLayout.SOUTH);
				}
				
				public void actionPerformed(ActionEvent e) {
					String actionCommand = e.getActionCommand();
					
					if(actionCommand.contentEquals("확인")) {
						dispose();
						join_page.this.setVisible(false);
					}
					else
						System.out.println("error!");
				}
			}//End of inner class ConfirmWindow
			confirmWindow smallWindow = new confirmWindow();
			smallWindow.setVisible(true);
		}
		
		//not invalid pw
		//here...
	}
}
