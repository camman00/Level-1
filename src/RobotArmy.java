import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

public class RobotArmy {
	public static void main(String[] asd){
		//1. create a new human
		Human human = new Human("Ralph");
		
		//2. create a new Robot army of good and evil robots.
		Robot[] bot = new Robot[15];
		String[] names = {"HAHAHA","Julian","INDEED"};
		for (int i = 0; i < bot.length; i++) {
			int random = new Random().nextInt(names.length);
			if (i % 2 == 0) {
				bot[i] = new Robot(names[random],true);
			}
			else {
				bot[i] = new Robot(names[random],new Random().nextBoolean());
			}
		}
		for (Robot robot : bot) {
			robot.destroy(human);
		}
		

		
		//3. command your robot army to destroy a human
	
	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	
	public Human(String name){
		this.name = name;
		this.isAlive = true;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	
	public Robot(String name, boolean isEvil){
		this.name = name;
		this.isEvil = isEvil;
	}
	
	public void destroy(Human man){
		if(isEvil){
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else{
			System.out.println("No!! The robot " + name + " loves " +man.getName());
		}
	}
}
