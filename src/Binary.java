

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField field1 = new JTextField(20);
JTextField field2 = new JTextField(20);
JButton button = new JButton("convert");
Binary() {
button.addActionListener(this);
frame.add(panel);
frame.setVisible(true);
panel.add(field1);
panel.add(button);
panel.add(field2);
frame.pack();
}

	public static void main(String[] args) {
	
	Binary hi = new Binary();
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
		field2.setText(convert(field1.getText()) );
		}
	}
	 String convert(String binary) {
	   	 int asciiValue = Integer.parseInt(binary, 2);
	   	 char theLetter = (char) asciiValue;
	   	 return "" + theLetter;
	    }

}
