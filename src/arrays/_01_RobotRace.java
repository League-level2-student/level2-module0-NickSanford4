package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Random rand = new Random();
		//2. create an array of 5 robots.
		int  number_Robost=2;
		Robot[]rob = new Robot[number_Robost];
		int[] dist = new int[number_Robost];
		//3. use a for loop to initialize the robots.
		for (int i = 0; i < rob.length; i++) { 
		rob[i] = new Robot();
		dist[i]=0;
		//4. make each robot start at the bottom of the screen, side by side, facing up 
		
		rob[i].setX(250);
		rob[i].setY(300);
		rob[i].penDown();
		}

		int winner=-1;
		while(winner==-1) {
		   for (int i = 0; i < rob.length; i++) {
		    	   int t=rand.nextInt(100);
		    	  
			   for(int k=0;k<t;k++) {
				  rob[i].move(4);
				  rob[i].turn(1);
				  //rob[i].penDown();
				  rob[i].setSpeed(10);
				  dist[i]+=1;
				  System.out.println(dist[i]);
				  if(dist[i]>360) {
					  winner = i;
					  break;
				  }
				}
			   if(winner!=-1) {
				   break;
			   }
		  }
       }
		//7. declare that robot the winner and throw it a party!
    	
    		rob[winner].sparkle();
    		JOptionPane.showMessageDialog(null,"winner = robot "+(winner+1));
    			
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}

}