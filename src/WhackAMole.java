import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JPanel a;
	JFrame b;
	JButton mole;
	Date timeAtStart = new Date();
	static boolean re = true;
	int molesWacked = 0;                                
public static void main(String[] args) {
	WhackAMole hi = new WhackAMole();
hi.create();

	
}

void create ()  {
	a = new JPanel();
	b = new JFrame();
	b.setVisible(true);
	b.add(a);
	a.setLayout(new GridLayout(8,3));
	Random rng = new Random(); 
	int x = rng.nextInt(24);
for (int i = 0; i < 24; i++) {
	if (x == i) {
		mole = new JButton("Mole!");
		mole.addActionListener(this);
		a.add(mole);
	}
	else{JButton b1 = new JButton();
	b1.addActionListener(this);
	b1.setSize(100, 50);
	a.add(b1);
	}
}
b.pack();
}

public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == mole) {
		speak("ow");
		molesWacked ++;
		b.dispose();
if (molesWacked == 2) {
			
	endGame(timeAtStart, molesWacked);
System.exit(0);	;	
}
		
	if ( re = true) {
		create();
	}	
		
	}
	else {
	speak ("no");
	}
}

void speak(String words) {
try {
Runtime.getRuntime().exec("say " + words).waitFor();
} catch (Exception e) {
e.printStackTrace();
}
}
private void endGame(Date timeAtStart, int molesWhacked) {
Date timeAtEnd = new Date();
JOptionPane.showMessageDialog(null, "Your whack rate is "
+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
}


}

