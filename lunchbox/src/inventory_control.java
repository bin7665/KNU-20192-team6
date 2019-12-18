import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class inventory_control  extends JFrame implements ActionListener{
	private JPanel sub_dish_Pan;
	private JPanel main_dish_Pan;
	private JPanel rice_Pan;
	
	private JMenu selectMenu;
	
	private String[] maindish = new String[12];
	private String[] sidedish = new String[12];
	private String[] rice = new String[6];
	
	public inventory_control() {
		super("Menu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(log_in.WINDOW_WIDTH/2, log_in.WINDOW_HEIGHT/2);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		try {
			//make rice Panel 
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("src/rice.txt"), "UTF-8"));
			String line = null;
			int len = 0;
			while((line = bufferedReader.readLine()) != null)
				rice[len++] = new String(line);
			
			rice_Pan = new JPanel(new GridLayout(6, 1));
			for(int i=0; i<6; i++) {
				JPanel minyP = new JPanel(null);
				JLabel minyL = new JLabel(rice[i]);
				int rand = (int)(Math.random()*100);
				JTextField minT = new JTextField(Integer.toString(rand));
				minyL.setFont(new Font("", Font.PLAIN, 15));
				minT.setFont(new Font("", Font.PLAIN, 15));
				minyL.setBounds(15, 0, 100, 40); minT.setBounds(log_in.WINDOW_WIDTH/2-60,0, 30, 40);
				minT.setEditable(false);
				minyP.add(minyL); minyP.add(minT);
				rice_Pan.add(minyP);
			}
		
			bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("src/sidedish.txt"), "UTF-8"));
			line = null;			
			len = 0;
			while((line = bufferedReader.readLine()) != null)
				sidedish[len++] = new String(line);
			
			sub_dish_Pan = new JPanel(new GridLayout(12, 1));
			for(int i=0; i<12; i++) {
				JPanel minyP = new JPanel(null);
				JLabel minyL = new JLabel(sidedish[i]);
				int rand = (int)(Math.random()*100);
				JTextField minT = new JTextField(Integer.toString(rand));
				minyL.setFont(new Font("", Font.PLAIN, 15));
				minT.setFont(new Font("", Font.PLAIN, 15));
				minyL.setBounds(15, 0, 100, 40); minT.setBounds(log_in.WINDOW_WIDTH/2-60,0, 30, 40);
				minT.setEditable(false);
				minyP.add(minyL); minyP.add(minT);
				sub_dish_Pan.add(minyP);
			}
			
			//make maindish Panel			
			bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("src/maindish_or_soup.txt"), "UTF-8"));
			line = null;			
			len = 0;
			while((line = bufferedReader.readLine()) != null)
				maindish[len++] = new String(line);
			
			main_dish_Pan = new JPanel(new GridLayout(12, 1));
			for(int i=0; i<12; i++) {
				JPanel minyP = new JPanel(null);
				JLabel minyL = new JLabel(maindish[i]);
				int rand = (int)(Math.random()*100);
				JTextField minT = new JTextField(Integer.toString(rand));
				minyL.setFont(new Font("", Font.PLAIN, 15));
				minT.setFont(new Font("", Font.PLAIN, 15));
				minyL.setBounds(15, 0, 100, 40); minT.setBounds(log_in.WINDOW_WIDTH/2-60,0, 30, 40);
				minT.setEditable(false);
				minyP.add(minyL); minyP.add(minT);
				main_dish_Pan.add(minyP);
			}		
			
			selectMenu = new JMenu("inventory_contorl");
			
			JMenuItem rice_choice = new JMenuItem("rice");
			rice_choice.addActionListener(this);
			selectMenu.add(rice_choice);
			JMenuItem main_choice = new JMenuItem("maindish / soup");
			main_choice.addActionListener(this);
			selectMenu.add(main_choice);
			JMenuItem sub_choice = new JMenuItem("sidedish");
			sub_choice.addActionListener(this);
			selectMenu.add(sub_choice);
			
			JMenuBar bar = new JMenuBar();
			bar.add(selectMenu);
			setJMenuBar(bar);
			
		}catch(FileNotFoundException e1) {
			System.out.println("Cannot find datafile.");
		}catch(IOException e1) {
			System.out.println("Problems with file input.");
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		String buttonString = e.getActionCommand();
		if(buttonString.equals("rice")) {
			add(rice_Pan);
			selectMenu.setText("rice");
			rice_Pan.setVisible(true);
			sub_dish_Pan.setVisible(false);
			main_dish_Pan.setVisible(false);
		}else if(buttonString.equals("sidedish")) {
			add(sub_dish_Pan);
			selectMenu.setText("sidedish");
			rice_Pan.setVisible(false);
			sub_dish_Pan.setVisible(true);
			main_dish_Pan.setVisible(false);
		}else if(buttonString.equals("maindish / soup")) {
			add(main_dish_Pan);
			selectMenu.setText("maindish");
			rice_Pan.setVisible(false);
			sub_dish_Pan.setVisible(false);
			main_dish_Pan.setVisible(true);
		}
	}
}
