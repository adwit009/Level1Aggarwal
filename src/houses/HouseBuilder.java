package houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class HouseBuilder {

	Robot r1 = new Robot("batman");

	void moveToBottomLeft() {
		r1.moveTo(0, 950);
	}
	
	void drawHouse(int height) {

	
	r1.setSpeed(100);
		r1.setPenColor(255,0,0);
	r1.penDown();
    r1.move(height1);
	r1.turn(90);
	r1.move(20);
	r1.turn(90);
	r1.move(height1);
	r1.turn(-90);
	r1.setPenColor(Color.green);
	r1.move(30);
	r1.turn(-90);
	}

	int height1 = 0;
	void drawHouse(String height, String color) {
	if (height.equalsIgnoreCase("small")) {
		 height1 = 60;
	} 
if (height.equalsIgnoreCase("medium")) {
	height1 = 120;
	} 
if (height.equalsIgnoreCase("large")) {
	height1 = 250;
} 
if(color.equalsIgnoreCase("yellow")) {
	
} 
if (color.equalsIgnoreCase("blue")) {
} 
if (color.equalsIgnoreCase("red")) {

} 	
	
	r1.setSpeed(100);
		r1.setPenColor(0,255,0);
	r1.penDown();
    r1.move(height1);
	r1.turn(90);
	r1.move(20);
	r1.turn(90);
	r1.move(height1);
	r1.turn(-90);
	r1.setPenColor(Color.green);
	r1.move(30);
	r1.turn(-90);
	}
}
