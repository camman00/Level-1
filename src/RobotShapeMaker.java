import org.jointheleague.graphical.robot.Robot;
public class RobotShapeMaker {
	private Robot roboto;
	private int Size;
	public static void main(String[] args) {
		
	}
	public RobotShapeMaker(Robot roboto) {
		this.roboto = roboto;
		this.Size = 75;
		this.roboto.setRandomPenColor();
		this.roboto.penDown();
		this.roboto.setSpeed(10);
		this.roboto.hide();
	}
	public void drawSquare(int Length) {
		for (int i = 0; i < 4; i++) {
			roboto.move(Length);
			roboto.turn(90);
		}
	}
	public void drawCircle(int Length) {
		for (int i = 0; i < 360; i++) {
			roboto.move(Length);
			roboto.turn(1);
		}
	}
	public void drawTriangle(int Length) {
		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				roboto.turn(20);
			}
			roboto.move(Length);
			roboto.turn(120);
			
		}
	}
	public void drawRectangle(int Width,int Heigth) {
		for (int i = 0; i < 4; i++) {
			if(i % 2 == 0) {
				roboto.move(Heigth);
			}
			else {
				roboto.move(Width);
			}
			roboto.turn(90);
		}
	}
	public void drawCube3d(int Length) {
		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				drawSquare(Length);
			}
			else if (i == 1) {
				roboto.move(Length / 2);
				roboto.turn(90);
				roboto.penUp();
				roboto.move((int) (Length / 2));
				roboto.penDown();
				drawSquare(Length);
			}
			else if (i == 2) {
				roboto.move((int) (Length / 2));
				roboto.turn(-90);
				roboto.move(Length / 2);
				roboto.turn(135);
				roboto.move((int) ((Length / 2) * Math.sqrt(2)));
				roboto.turn(45);
				roboto.penUp();
				roboto.move(Length);
				roboto.penDown();
				roboto.turn(135);
				roboto.move((int) ((Length / 2) * Math.sqrt(2)));
				roboto.turn(-45);
				
				
				roboto.move(Length);
				roboto.turn(-135);
				roboto.move((int) ((Length / 2) * Math.sqrt(2)));
				roboto.turn(225);
				roboto.move(Length);
				roboto.turn(-270-135);
				roboto.move((int) ((Length / 2) * Math.sqrt(2)));
			}
		}
	}
	public void setSize(int Size) {
		this.Size = Size;
	}
}
