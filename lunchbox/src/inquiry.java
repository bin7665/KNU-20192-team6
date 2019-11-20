import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class inquiry extends JFrame implements ActionListener{
	private int Text_Field_width=440;
	private int Text_Field_height=50;
	
	private int LEFT_PADDING = 100;
	private int RIGHT_PADDING = 100;
	
	private JTextField title;
	private JTextArea text;
	
	public inquiry() {
		super();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(log_in.WINDOW_WIDTH, log_in.WINDOW_HEIGHT);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		JPanel titlePan = new JPanel(new FlowLayout(FlowLayout.CENTER));
		title = new JTextField("문의 제목");
		title.setHorizontalAlignment(JTextField.CENTER);
		title.setPreferredSize(new Dimension(Text_Field_width,Text_Field_height));
		title.addMouseListener(new MouseEventDemo());
		titlePan.add(title);
		titlePan.setBorder(BorderFactory.createEmptyBorder(30,LEFT_PADDING,10,RIGHT_PADDING));
		add(titlePan, BorderLayout.NORTH);
		
		JPanel textPan = new JPanel(new FlowLayout(FlowLayout.CENTER));
		text = new JTextArea("문의 내용", 40, 60);
		text.setBackground(Color.WHITE);
		JScrollPane scrolledText = new JScrollPane(text);
		scrolledText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		textPan.add(scrolledText);
		add(textPan, BorderLayout.CENTER);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.LIGHT_GRAY);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton okButton = new JButton("확인");
		okButton.setBackground(Color.YELLOW);
		okButton.addActionListener(this);
		buttonPanel.add(okButton);
		
		JButton clearButton = new JButton("clear");
		clearButton.setBackground(Color.RED);
		clearButton.addActionListener(this);
		buttonPanel.add(clearButton);
		
		add(buttonPanel, BorderLayout.SOUTH);
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
			if(o.getClass().equals(title)) {
				JTextField To = (JTextField)o;
				To.setText("");
			}else if(o.getClass().equals(text)) {
				JTextArea Ao = (JTextArea)o;
				Ao.setText("");
			}
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
		
		if(actionCommand.equals("clear")) {
			text.setText("");
		}else if(actionCommand.equals("확인")) {
			String inquiry_=text.getText();
			//save inquiry_
			//here...
			dispose();
		}
	}
}
