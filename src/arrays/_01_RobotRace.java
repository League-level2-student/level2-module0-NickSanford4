package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
	Robot[] a = new Robot[9];
	//3. use a for loop to initialize the robots.
for (int i = 0; i < a.length; i++) {
	a[i]=new Robot();
	a[i].setX(i*98+50);
	a[i].setY(540);
}
	//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
for (int q = 0; q < 90; q++) {
	Random rand = new Random();
for (int i = 0; i < a.length; i++) {
	int distance = rand.nextInt(51);
	a[i].move(distance);
	a[i].setSpeed(10);
	if(a[i].getY()<=0) {
		JOptionPane.showMessageDialog(null, "Robot "+(i+1)+" won  ''We all throw it a party''");
System.exit(0);
	}

	a[i].setRandomPenColor();
	a[i].penDown();
	
}
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}