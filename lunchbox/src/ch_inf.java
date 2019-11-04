import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch_inf extends JFrame implements ActionListener{
	private JTextField pw;
	private JTextField confirm_pw;
	private JTextField phone_num;
	private JTextField address;
	private JButton join;
	
	private int Text_Field_width=440;
	private int Text_Field_height=50;
	
	private int LEFT_PADDING = 100;
	private int RIGHT_PADDING = 100;
	
	public ch_inf() {
		super();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(log_in.WINDOW_WIDTH, log_in.WINDOW_HEIGHT);
		setLayout(new BorderLayout());
		
		JPanel junkPan = new JPanel();
		add(junkPan, BorderLayout.NORTH);//upper padding...
		
		JPanel textPan = new JPanel(new GridLayout(4,1));
		JPanel pwPan = new JPanel(new FlowLayout(FlowLayout.CENTER));
		pw = new JTextField("비밀번호");
		pw.setHorizontalAlignment(JTextField.CENTER);
		pw.setPreferredSize(new Dimension(Text_Field_width,Text_Field_height));
		pw.addMouseListener(new MouseEventDemo());
		pwPan.add(pw);
		pwPan.setBorder(BorderFactory.createEmptyBorder(80,LEFT_PADDING,10,RIGHT_PADDING));
		textPan.add(pwPan);
		
		JPanel c_pwPan = new JPanel(new FlowLayout(FlowLayout.CENTER));
		confirm_pw = new JTextField("비밀번호 확인");
		confirm_pw.setHorizontalAlignment(JTextField.CENTER);
		confirm_pw.setPreferredSize(new Dimension(Text_Field_width,Text_Field_height));
		confirm_pw.addMouseListener(new MouseEventDemo());
		c_pwPan.add(confirm_pw);
		c_pwPan.setBorder(BorderFactory.createEmptyBorder(30,LEFT_PADDING,10,RIGHT_PADDING));
		textPan.add(c_pwPan);
		
		JPanel phonePan = new JPanel(new FlowLayout(FlowLayout.CENTER));
		phone_num = new JTextField("핸드폰 번호");
		phone_num.setHorizontalAlignment(JTextField.CENTER);
		phone_num.setPreferredSize(new Dimension(Text_Field_width,Text_Field_height));
		phone_num.addMouseListener(new MouseEventDemo());
		phonePan.add(phone_num);
		phonePan.setBorder(BorderFactory.createEmptyBorder(30,LEFT_PADDING,10,RIGHT_PADDING));
		textPan.add(phonePan);
		
		JPanel addPan = new JPanel(new FlowLayout(FlowLayout.CENTER));
		address = new JTextField("주소");
		address.setHorizontalAlignment(JTextField.CENTER);
		address.setPreferredSize(new Dimension(Text_Field_width,Text_Field_height*2));
		address.addMouseListener(new MouseEventDemo());
		addPan.add(address);
		addPan.setBorder(BorderFactory.createEmptyBorder(0,LEFT_PADDING,50,RIGHT_PADDING));
		textPan.add(addPan);
		add(textPan, BorderLayout.CENTER);
		
		JPanel buttonPan = new JPanel(new FlowLayout());
		JButton change_confirm = new JButton("변경");
		change_confirm.addActionListener(this);
		change_confirm.setPreferredSize(new Dimension(Text_Field_width,Text_Field_height));
		buttonPan.add(change_confirm);
		buttonPan.setBorder(BorderFactory.createEmptyBorder(0,LEFT_PADDING,0,RIGHT_PADDING));
		add(buttonPan, BorderLayout.SOUTH);
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
		String actionCommand = e.getActionCommand();
		if(actionCommand.contentEquals("변경")) {
			//pw == confirm_pw(valid pw)
			class confirmWindow extends JFrame implements ActionListener{
				public confirmWindow() {
					setSize(200, 100);
					getContentPane().setBackground(Color.YELLOW);
					setLayout(new BorderLayout());
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
					setLocation(49*6, 64*7);
					JLabel confirmLabel = new JLabel("   정보변경이 완료되었습니다.");
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
						ch_inf.this.setVisible(false);
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
