package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	
    int N_robots=8;
	//2. create an array of 5 robots.
	Robot[] a = new Robot[N_robots];
	//3. use a for loop to initialize the robots.
	int xc = 500;
	int yc = 300;
	int R  =200;
	int x = 0;
	int y = 0;
	
for (int i = 0; i < a.length; i++) {
	x=xc+(int)(R*Math.cos(2*Math.PI*i/N_robots));
	y=yc+(int)(R*Math.sin(2*Math.PI*i/N_robots));
	System.out.println(i+" "+x+" "+y);
	a[i]=new Robot();
	a[i].setX(x);
	a[i].setY(y);
	a[i].turn(i*360/N_robots);
	}
	//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
for (int q = 0; q < 90; q++) {
	Random rand = new Random();
for (int i = 0; i < a.length; i++) {
	int distance = rand.nextInt(5);
	a[i].move(distance);
	a[i].turn(-distance);
	a[i].move(distance);
	a[i].setSpeed(10);
	if(a[i].getY()<=0) {
		JOptionPane.	showMessageDialog(null, "Robot "+(i+1)+" won  ''We all throw it a party''");
System.exit(0);

	}

	a[i].setRandomPenColor();
	a[i].penDown();
	
}
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
//done
	//7. declare that robot the winner and throw it a party!
//done
	//8. try different races with different amounts of robots.
//done
	//9. make the robots race around a circular track.

}
}

