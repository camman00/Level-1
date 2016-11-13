import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Hood {
	public class Building {
		int wallH;
		int grassW;
		int roofW;
		int x;
		int y;
		public Building(int wallHeight, int roofWidth, int grassWidth) {
			this.wallH = wallHeight;
			this.roofW = roofWidth;
			this.grassW = grassWidth;
			
			
		}
		
		public void draw(Robot bottle) {
			x = bottle.getX();
			y = bottle.getY();
			bottle.setPenColor(Color.MAGENTA);
			bottle.move(wallH);
			bottle.turn(60);
			bottle.move(roofW);
			bottle.turn(60);
			bottle.move(roofW);
			bottle.turn(60);
			bottle.move(wallH);
			bottle.turn(-90);
			bottle.setPenColor(Color.GREEN);
			bottle.move(grassW);
			bottle.turn(-90);
			
		}
		public void drawDoor(Robot bottle) {
			float doorX = x + roofW;
			float doorY = y;
			float doorHeight = wallH / 3;
			float doorWidth = roofW / 3;
			bottle.penUp();
			int oldX = bottle.getX();
			int oldY = bottle.getY();
			bottle.moveTo((int)doorX, (int)doorY);
			bottle.penDown();
			bottle.setPenColor(Color.cyan);
			bottle.move((int)doorHeight);
			bottle.turn(90);
			bottle.move((int)doorWidth);
			bottle.turn(90);
			bottle.move((int)doorHeight);
			bottle.turn(180);
			bottle.penUp();
			bottle.moveTo(oldX, oldY);
			bottle.penDown();
			
			
			
		}
		

	}

	public static void main(String[] args) {
		Building[] bill = new Building[10];
		Hood hood = new Hood();
		Robot bottle = new Robot();
		bottle.moveTo(100, bottle.getWindow().getHeight() - 50);
		bottle.penDown();
		bottle.setSpeed(10);
		
		for (int i = 0; i < 10; i++) {
			Random rand = new Random();
			bill[i] = hood.new Building(rand.nextInt(800),90,45);
			
			//Building bob = hood.new Building(rand.nextInt(800),90,45);
			bill[i].draw(bottle);
			
		}
		for (int i = 0; i < 10; i++) {
			bill[i].drawDoor(bottle);
		}
	}

}
