import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class infoPage extends JFrame {
	private JLabel name;//
	private JLabel id;//
	private JLabel pw;
	private JLabel confirm_pw;
	private JLabel phone_num;
	private JTextArea address;
	private JButton join;
	private String userid;
	
	private int Text_Label_width=300;
	private int Text_Label_height=50;
	private int x = 5;
	private int y = 35;
	
	public infoPage() {
		super();
	}
	
	public infoPage(String ID) {
		super();
		userid = ID;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(log_in.WINDOW_WIDTH/2, log_in.WINDOW_HEIGHT/2);
		setLocationRelativeTo(null);
		setLayout(null);
		
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("user_"+ userid));
			User readone = (User)inputStream.readObject();
			
			x=90;
			name = new JLabel("이          름 :  "+readone.getname());
			name.setHorizontalAlignment(JLabel.LEFT);
			name.setFont(new Font("Couruer New", Font.TYPE1_FONT, 20));
			name.setBounds(y,x,Text_Label_width,Text_Label_height);
			add(name);
			
			x+=Text_Label_height+5;
			id = new JLabel("아   이   디 :  "+userid);
			id.setHorizontalAlignment(JLabel.LEFT);
			id.setFont(new Font("Couruer New", Font.TYPE1_FONT, 20));
			id.setBounds(y,x,Text_Label_width,Text_Label_height);
			add(id);
			
			x+=Text_Label_height+5;
			pw = new JLabel("비 밀 번 호 :  "+readone.getpw());
			pw.setHorizontalAlignment(JLabel.LEFT);
			pw.setFont(new Font("Couruer New", Font.TYPE1_FONT, 20));
			pw.setBounds(y,x,Text_Label_width,Text_Label_height);
			add(pw);
			
			x+=Text_Label_height+5;
			JPanel phonePan = new JPanel(new FlowLayout(FlowLayout.CENTER));
			phone_num = new JLabel("핸드폰번호 :  "+readone.getphone_num());
			phone_num.setHorizontalAlignment(JLabel.LEFT);
			phone_num.setFont(new Font("Couruer New", Font.TYPE1_FONT, 20));
			phone_num.setBounds(y,x,Text_Label_width,Text_Label_height);
			add(phone_num);
			
			x+=Text_Label_height+20;
			JPanel addPan = new JPanel(new FlowLayout(FlowLayout.CENTER));
			address = new JTextArea("주          소 : \n"+readone.getaddress());
			address.setLineWrap(true);
			address.setEditable(false);
			address.setBackground(getBackground());
			address.setFont(new Font("Couruer New", Font.TYPE1_FONT, 18));
			address.setBounds(y,x,Text_Label_width,3*Text_Label_height);
			add(address);
			
		}catch(FileNotFoundException e1) {
			System.out.println("Cannot find datafile.");
		}catch(ClassNotFoundException e1) {
			System.out.println("Problems with file input");
		}catch(IOException e1) {
			System.out.println("Problems with file input.");
		}
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.LIGHT_GRAY);
		g.draw3DRect(0,0,log_in.WINDOW_WIDTH/2, 100, true);
		g.setColor(Color.BLUE);
		g.setFont(new Font("Couruer New", Font.BOLD, 40));
		g.drawString("INFO", 50, 75);
	}
}
