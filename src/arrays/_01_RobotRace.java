package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Random rand = new Random();
		//2. create an array of 5 robots.
		Robot[]rob = new Robot[1];
		//3. use a for loop to initialize the robots.
		for (int i = 0; i < rob.length; i++) { 
		rob[i] = new Robot();
		//4. make each robot start at the bottom of the screen, side by side, facing up 
		rob[i].setX(300);
		rob[i].setY(300);
		rob[i].penDown();
		}

		boolean finish=false;
		int     winner=0;
		//while (finish==false) {
		for(int j=0;j<360;j++) {
			 for (int i = 0; i < rob.length; i++) {
				    //if (rob[i].getY()>0) {
				       int t=rand.nextInt(50);
				       for(int k=0;k<t;k++) {
				    	   		rob[i].move(5);
				    	   		rob[i].turn(1);
				    	   		//rob[i].penDown();
				    	   		rob[i].setSpeed(10);
				       }
//				    else {
				    	  //  finish=true;
				    	  //  winner=i;
				    	  //  break;
				   // }
			 }
				
		//}
	 
		
}
        System.out.println("winner="+winner+1);
		//7. declare that robot the winner and throw it a party!
    		if(rob[winner].getY() <= 0) {
    			rob[winner].sparkle();
    			JOptionPane.showMessageDialog(null,"winner="+(winner+1));
    		}
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}

}