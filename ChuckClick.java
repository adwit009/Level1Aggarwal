import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class ChuckClick implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	int x = 0;
public static void main(String[] args) {
	ChuckClick hi = new ChuckClick();
	hi.makeButton();
}
 void makeButton(){ 
	 frame = new JFrame();
	 panel = new JPanel();
	 button1 = new JButton("Joke");
	 button2 = new JButton("Punchline");
	 panel.add(button1);
	 panel.add(button2);
	 frame.add(panel);
	 frame.setVisible(true);
	 frame.setSize(200, 70);
	 button1.addActionListener(this);
	 button2.addActionListener(this);
 }
@Override
public void actionPerformed(ActionEvent e) {
	
	if (   e.getSource() == button1) {
	JOptionPane.showMessageDialog(null, "What does C.S. Lewis keep at the back of his wardrobe?");
x++;
	}	
	if (   e.getSource() == button2 && x == 1) {
		JOptionPane.showMessageDialog(null, " Narnia business!");
	}	

	if (   e.getSource() == button2 && x == 0){
	JOptionPane.showMessageDialog(null, "Look at the joke first!");
	}
	

}

}


