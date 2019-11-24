import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class join_page extends JFrame implements ActionListener{
	private JTextField name;
	private JTextField ID;
	private JTextField pw;
	private JTextField confirm_pw;
	private JTextField phone_num;
	private JTextField address;
	private JButton join;
	private boolean idcheck;
	
	private int Text_Field_width=440;
	private int Text_Field_height=50;
	
	private int LEFT_PADDING = 100;
	private int RIGHT_PADDING = 100;
	
	public join_page() {
		super();
		setTitle("join our membership!");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(log_in.WINDOW_WIDTH-98, log_in.WINDOW_HEIGHT-128);
		setLocationRelativeTo(null);
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
		check_duplicate.addActionListener(this);
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
		phone_num = new JTextField("핸드폰 번호 ('-'은 제외하여 입력해주세요)");
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
	
	public boolean check_id() {
		File id_f = new File("user_"+ID.getText());
		return id_f.isFile();
	}
	
	public boolean check_pw() {
		return (pw.getText().isEmpty()) || !(pw.getText().equals(confirm_pw.getText()));
	}
	
	//mouse click event...
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
		class confirmWindow extends JFrame implements ActionListener{
			JLabel confirmLabel;
			JPanel buttonPanel;
			JButton exitButton;
			public confirmWindow() {
				setSize(250, 100);
				getContentPane().setBackground(Color.YELLOW);
				setLayout(new BorderLayout());
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				setLocationRelativeTo(null);
				confirmLabel = new JLabel("   회원가입이 완료되었습니다.");
				add(confirmLabel, BorderLayout.CENTER);
				
				buttonPanel = new JPanel();
				buttonPanel.setBackground(Color.YELLOW);
				buttonPanel.setLayout(new FlowLayout());
				
				exitButton = new JButton("확인");
				exitButton.addActionListener(this);
				buttonPanel.add(exitButton);
				
				add(buttonPanel, BorderLayout.SOUTH);
			}
			
			public void setmessage(String msg, Color c) {
				confirmLabel.setText(msg);
				confirmLabel.setForeground(c);
			}
			
			public void setcolor(Color c) {
				exitButton.setBackground(c);
			}
			
			public void actionPerformed(ActionEvent e) {
				String actionCommand = e.getActionCommand();
				if(actionCommand.contentEquals("확인")) {
					dispose();
					if(confirmLabel.getText().equals("   회원가입이 완료되었습니다."))
						join_page.this.setVisible(false);
				}
				else
					System.out.println("error!");
			}
		}//End of inner class ConfirmWindow
		
		String actionCommand = e.getActionCommand();
		if(actionCommand.contentEquals("중복 확인")) {
			if(ID.getText().equals("아이디") || ID.getText().isEmpty()) {
				confirmWindow reject1Window = new confirmWindow();
				reject1Window.setmessage("유효하지 않은 아이디입니다.", Color.red);
				reject1Window.setcolor(Color.red);
				reject1Window.setVisible(true);	
			}
			else if(this.check_id()) {
				confirmWindow reject1Window = new confirmWindow();
				reject1Window.setmessage("이미 존재하는 아이디입니다.", Color.red);
				reject1Window.setcolor(Color.red);
				reject1Window.setVisible(true);
			}
			else {
				idcheck = true;
				confirmWindow reject1Window = new confirmWindow();
				reject1Window.setmessage("사용가능한 아이디입니다.", Color.red);
				reject1Window.setcolor(Color.yellow);
				reject1Window.setVisible(true);
			}
		}
		if(actionCommand.contentEquals("회원가입")) {
			//confirm id and pw
			if(!idcheck) {
				confirmWindow reject1Window = new confirmWindow();
				reject1Window.setmessage("아이디 중복확인을 해주세요", Color.red);
				reject1Window.setcolor(Color.red);
				reject1Window.setVisible(true);
			}
			else if(this.check_pw()){
				confirmWindow reject2Window = new confirmWindow();
				reject2Window.setmessage("비밀번호 확인을 다시해주세요", Color.red);
				reject2Window.setcolor(Color.red);
				reject2Window.setVisible(true);
			}
			else {//valid sign in
				try{
					ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("user_" +ID.getText()));
					User newone = new User(name.getText(), pw.getText(), phone_num.getText(), address.getText() );
					outputStream.writeObject(newone);
					outputStream.close();
				}catch(IOException e1) {
					System.out.println("Problem with file output.");
				}
				confirmWindow smallWindow = new confirmWindow();
				smallWindow.setVisible(true);
			}
		}
	}
}
