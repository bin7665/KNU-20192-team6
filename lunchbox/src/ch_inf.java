import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ch_inf extends JFrame implements ActionListener{
	private JTextField pw;
	private JTextField confirm_pw;
	private JTextField phone_num;
	private JTextField address;
	private JButton join;
	private String userid;
	
	private int Text_Field_width=440;
	private int Text_Field_height=50;
	private int x = 30;
	private int y = 60;
	
	public ch_inf() {
		super();
	}
	
	public ch_inf(String ID) {
		super();
		userid = ID;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(log_in.WINDOW_WIDTH/4*3, log_in.WINDOW_HEIGHT/4*3);
		setLocationRelativeTo(null);
		setLayout(null);
		
		JPanel junkPan = new JPanel();
		junkPan.setBounds(150+x,y,Text_Field_width,Text_Field_height);
		add(junkPan);

		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("user_"+ userid));
			User readone = (User)inputStream.readObject();
			pw = new JTextField("비밀번호");
			pw.setEditable(false);
			pw.setHorizontalAlignment(JTextField.CENTER);
			pw.addMouseListener(new MouseEventDemo());
			pw.setBounds(y,80+2*x+Text_Field_height,Text_Field_width,Text_Field_height);
			add(pw);
			
			JPanel c_pwPan = new JPanel(new FlowLayout(FlowLayout.CENTER));
			confirm_pw = new JTextField("비밀번호 확인");
			confirm_pw.setHorizontalAlignment(JTextField.CENTER);
			confirm_pw.setEditable(false);
			confirm_pw.addMouseListener(new MouseEventDemo());
			confirm_pw.setBounds(y,80+3*x+2*Text_Field_height,Text_Field_width,Text_Field_height);
			add(confirm_pw);
			
			JPanel phonePan = new JPanel(new FlowLayout(FlowLayout.CENTER));
			phone_num = new JTextField(readone.getphone_num());
			phone_num.setHorizontalAlignment(JTextField.CENTER);
			phone_num.setEditable(false);
			phone_num.addMouseListener(new MouseEventDemo());
			phone_num.setBounds(y,80+4*x+3*Text_Field_height,Text_Field_width,Text_Field_height);
			add(phone_num);
			
			JPanel addPan = new JPanel(new FlowLayout(FlowLayout.CENTER));
			address = new JTextField(readone.getaddress());
			address.setEditable(false);
			address.setHorizontalAlignment(JTextField.CENTER);
			address.addMouseListener(new MouseEventDemo());
			address.setBounds(y,80+5*x+4*Text_Field_height,Text_Field_width,3*Text_Field_height);
			add(address);
		}catch(FileNotFoundException e1) {
			System.out.println("Cannot find datafile.");
		}catch(ClassNotFoundException e1) {
			System.out.println("Problems with file input");
		}catch(IOException e1) {
			System.out.println("Problems with file input.");
		}
		
		JButton change_confirm = new JButton("변경");
		change_confirm.addActionListener(this);
		change_confirm.setPreferredSize(new Dimension(Text_Field_width,Text_Field_height));
		change_confirm.setBounds(log_in.WINDOW_WIDTH/8*3-50, log_in.WINDOW_HEIGHT/4*3-100, 100, 50);
		add(change_confirm);
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
				To.setEditable(true);
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
				confirmLabel = new JLabel("     정보변경이 완료되었습니다.");
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
					if(confirmLabel.getText().equals("     정보변경이 완료되었습니다."))
						ch_inf.this.setVisible(false);
				}
				else
					System.out.println("error!");
			}
		}//End of inner class ConfirmWindow
		
		String actionCommand = e.getActionCommand();
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("user_"+ userid));
			User readone = (User)inputStream.readObject();
			
			if(actionCommand.contentEquals("변경")) {
				//pw == confirm_pw(valid pw)
				if(this.check_pw()){
					confirmWindow reject2Window = new confirmWindow();
					reject2Window.setmessage("     비밀번호 확인을 다시해주세요", Color.RED);
					reject2Window.setcolor(Color.red);
					reject2Window.setVisible(true);
				}
				else {
					if((pw.getText()).equals(readone.getpw())) {
						confirmWindow reject2Window = new confirmWindow();
						reject2Window.setmessage("현재 pw와 변경하려는 pw가 일치합니다.", Color.RED);
						reject2Window.setcolor(Color.red);
						reject2Window.setVisible(true);
					}
					else {
						readone.setpw(pw.getText());
						readone.setphone_num(phone_num.getText());
						readone.setaddress(address.getText());
						inputStream.close();
						ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("user_" +userid));
						outputStream.writeObject(readone);
						outputStream.close();
						confirmWindow smallWindow = new confirmWindow();
						smallWindow.setVisible(true);
					}
				}
			}
		}catch(FileNotFoundException e1) {
			System.out.println("Cannot find datafile.");
		}catch(ClassNotFoundException e1) {
			System.out.println("Problems with file input");
		}catch(IOException e1) {
			System.out.println("Problems with file input.");
		}
	}		
}
