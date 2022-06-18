package pack1;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class ClockDisplay extends JFrame{
	
	private JLabel title;
	private JLabel actualClock;
	private Font clockFont = new Font("",Font.BOLD,35);
	ActionListenerImpl ALimple = new ActionListenerImpl();
	
	
	ClockDisplay(){
		super.setTitle("My Digital Clock");
		super.setSize(500, 500);
		super.setLocation(400,100);
		this.createGUI();
		
		super.setVisible(true);
	}
	
	public void createGUI() {
		
		title = new JLabel("Digital Clock");
		actualClock = new JLabel(" ");
		this.startClock();
		
		title.setFont(clockFont);
		actualClock.setFont(clockFont);
		
		this.setLayout(new GridLayout(2,1));
		this.add(title);
		this.add(actualClock);
		
		
	}
	
	public void startClock() {
		Timer time = new Timer(100, ALimple);
		actualClock = ALimple.clock;
		time.start();
		
	}
}
