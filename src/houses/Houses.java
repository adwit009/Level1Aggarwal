package houses;

import javax.swing.JOptionPane;

public class Houses {
	public static void main(String[] args) {
		HouseBuilder bob = new HouseBuilder();
		bob.moveToBottomLeft();
		for (int i = 0; i < 10; i++) {
		String height = JOptionPane.showInputDialog("Should the height be small, medium or large");	
		String color  = JOptionPane.showInputDialog("Enter a color : red, green or blue");
		
		bob.drawHouse(height, color);
		}
		}
}
