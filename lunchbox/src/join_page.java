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
		name = new JTextField("����");
		name.setHorizontalAlignment(JTextField.CENTER);
		name.setPreferredSize(new Dimension(Text_Field_width,Text_Field_height));
		name.addMouseListener(new MouseEventDemo());
		namePan.add(name);
		namePan.setBorder(BorderFactory.createEmptyBorder(30,LEFT_PADDING,10,RIGHT_PADDING));
		add(namePan);
		
		JPanel IDPan = new JPanel(new FlowLayout(FlowLayout.LEFT));
		ID = new JTextField("���̵�");
		ID.setHorizontalAlignment(JTextField.CENTER);
		ID.setPreferredSize(new Dimension(Text_Field_width-90,Text_Field_height));
		ID.addMouseListener(new MouseEventDemo());
		JButton check_duplicate = new JButton("�ߺ� Ȯ��");
		check_duplicate.addActionListener(this);
		check_duplicate.setFont(new Font("Serif", Font.PLAIN | Font.BOLD, 10));
		IDPan.add(ID);
		IDPan.add(check_duplicate);
		IDPan.setBorder(BorderFactory.createEmptyBorder(30,LEFT_PADDING,10,RIGHT_PADDING));
		add(IDPan);
		
		JPanel pwPan = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pw = new JTextField("��й�ȣ");
		pw.setHorizontalAlignment(JTextField.CENTER);
		pw.setPreferredSize(new Dimension(Text_Field_width,Text_Field_height));
		pw.addMouseListener(new MouseEventDemo());
		pwPan.add(pw);
		pwPan.setBorder(BorderFactory.createEmptyBorder(30,LEFT_PADDING,10,RIGHT_PADDING));
		add(pwPan);
		
		JPanel c_pwPan = new JPanel(new FlowLayout(FlowLayout.LEFT));
		confirm_pw = new JTextField("��й�ȣ Ȯ��");
		confirm_pw.setHorizontalAlignment(JTextField.CENTER);
		confirm_pw.setPreferredSize(new Dimension(Text_Field_width,Text_Field_height));
		confirm_pw.addMouseListener(new MouseEventDemo());
		c_pwPan.add(confirm_pw);
		c_pwPan.setBorder(BorderFactory.createEmptyBorder(30,LEFT_PADDING,10,RIGHT_PADDING));
		add(c_pwPan);
		
		JPanel phonePan = new JPanel(new FlowLayout(FlowLayout.LEFT));
		phone_num = new JTextField("�ڵ��� ��ȣ ('-'�� �����Ͽ� �Է����ּ���)");
		phone_num.setHorizontalAlignment(JTextField.CENTER);
		phone_num.setPreferredSize(new Dimension(Text_Field_width,Text_Field_height));
		phone_num.addMouseListener(new MouseEventDemo());
		phonePan.add(phone_num);
		phonePan.setBorder(BorderFactory.createEmptyBorder(30,LEFT_PADDING,10,RIGHT_PADDING));
		add(phonePan);
		
		JPanel addPan = new JPanel(new FlowLayout(FlowLayout.LEFT));
		address = new JTextField("�ּ�");
		address.setHorizontalAlignment(JTextField.CENTER);
		address.setPreferredSize(new Dimension(Text_Field_width,Text_Field_height*2));
		address.addMouseListener(new MouseEventDemo());
		addPan.add(address);
		addPan.setBorder(BorderFactory.createEmptyBorder(0,LEFT_PADDING,0,RIGHT_PADDING));
		add(addPan);

		JPanel joinPan = new JPanel(new FlowLayout());
		JButton join_confirm = new JButton("ȸ������");
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
			public confirmWindow() {
				setSize(200, 100);
				getContentPane().setBackground(Color.YELLOW);
				setLayout(new BorderLayout());
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				setLocation(49*6, 64*7);
				confirmLabel = new JLabel("   ȸ�������� �Ϸ�Ǿ����ϴ�.");
				add(confirmLabel, BorderLayout.CENTER);
				
				buttonPanel = new JPanel();
				buttonPanel.setBackground(Color.YELLOW);
				buttonPanel.setLayout(new FlowLayout());
				
				JButton exitButton = new JButton("Ȯ��");
				exitButton.addActionListener(this);
				buttonPanel.add(exitButton);
				
				add(buttonPanel, BorderLayout.SOUTH);
			}
			
			public void setmessage(String msg) {
				confirmLabel.setText("   "+msg);
			}
			
			public void setcolor(Color c) {
				buttonPanel.setBackground(c);
			}
			
			public void actionPerformed(ActionEvent e) {
				String actionCommand = e.getActionCommand();
				if(actionCommand.contentEquals("Ȯ��")) {
					dispose();
					if(confirmLabel.getText().equals("   ȸ�������� �Ϸ�Ǿ����ϴ�."))
						join_page.this.setVisible(false);
				}
				else
					System.out.println("error!");
			}
		}//End of inner class ConfirmWindow
		
		String actionCommand = e.getActionCommand();
		if(actionCommand.contentEquals("�ߺ� Ȯ��")) {
			if(ID.getText().equals("���̵�") || ID.getText().isEmpty()) {
				confirmWindow reject1Window = new confirmWindow();
				reject1Window.setmessage("��ȿ���� ���� ���̵��Դϴ�.");
				reject1Window.setcolor(Color.red);
				reject1Window.setVisible(true);	
			}
			else if(this.check_id()) {
				confirmWindow reject1Window = new confirmWindow();
				reject1Window.setmessage("�̹� �����ϴ� ���̵��Դϴ�.");
				reject1Window.setcolor(Color.red);
				reject1Window.setVisible(true);
			}
			else {
				idcheck = true;
				confirmWindow reject1Window = new confirmWindow();
				reject1Window.setmessage("��밡���� ���̵��Դϴ�.");
				reject1Window.setcolor(Color.yellow);
				reject1Window.setVisible(true);
			}
		}
		if(actionCommand.contentEquals("ȸ������")) {
			//confirm id and pw
			if(!idcheck) {
				confirmWindow reject1Window = new confirmWindow();
				reject1Window.setmessage("���̵� �ߺ�Ȯ���� ���ּ���");
				reject1Window.setcolor(Color.red);
				reject1Window.setVisible(true);
			}
			else if(this.check_pw()){
				confirmWindow reject2Window = new confirmWindow();
				reject2Window.setmessage("��й�ȣ Ȯ���� �ٽ����ּ���");
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
