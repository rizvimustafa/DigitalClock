package pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;

public class ActionListenerImpl implements ActionListener{
	
	JLabel clock = new JLabel("");

	@Override
	public void actionPerformed(ActionEvent e) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy  \n  hh:mm:ss a");
		String time = sdf.format(d);
		clock.setText(time);
		
		
	}

}
