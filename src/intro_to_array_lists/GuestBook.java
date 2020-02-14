package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addButton = new JButton();
	JButton viewButton = new JButton();
	JTextField textField = new JTextField();
	ArrayList<String> names = new ArrayList<String>();
	
	void run(){
		frame.setVisible(true);
		frame.add(panel);
		panel.add(addButton);
		panel.add(viewButton);
		addButton.addActionListener(this);
		viewButton.addActionListener(this);
		
		
		frame.pack();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(addButton == buttonPressed) {
			names.add(JOptionPane.showInputDialog("Enter a name"));
		}
		if(viewButton == buttonPressed) {
			JOptionPane.showMessageDialog(null, names);
		}
	}
}
