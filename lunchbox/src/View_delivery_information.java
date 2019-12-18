import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class View_delivery_information extends JFrame{
	public static final int PAUSE = 10;

	private JPanel box;
	
	public View_delivery_information() {
		super();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(log_in.WINDOW_HEIGHT/7*6, log_in.WINDOW_WIDTH/2);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		box = new JPanel();
		add(box, BorderLayout.CENTER);
	}
	
	public class fill extends Thread {
		public void run() {
			while(true) {
				//Thread.sleep(PAUSE);
				Graphics g = box.getGraphics();
				g.setColor(Color.BLACK);
				g.setFont(new Font("Couruer New", Font.BOLD, 40));
				g.drawString("Deliver arrival",0, 0);
				doNothing(PAUSE);
			}
		}
		
		public void doNothing(int millis) {
			try {
				Thread.sleep(millis);
			} catch(InterruptedException e) {
				System.out.println("Unexpected interrupt");
				System.exit(0);
			}
		}
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.LIGHT_GRAY);
		g.draw3DRect(0,0,log_in.WINDOW_WIDTH/2, 100, true);
		g.setColor(Color.BLUE);
		//g.setFont(new Font("Couruer New", Font.BOLD, 40));
		//g.drawString("Delivery_information", 50, 75);
	}
	
	private class WindowListen implements WindowListener{
		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			fill filling = new fill();
			filling.start();
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}
