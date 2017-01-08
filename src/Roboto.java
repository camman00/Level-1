import org.jointheleague.graphical.robot.Robot;
public class Roboto {
	public static void main(String[] args) {
		Robot ah = new Robot("vic");
		RobotShapeMaker bot = new RobotShapeMaker(ah);
		bot.setSize(100);
		bot.drawCube3d(74);
		
	}
}
