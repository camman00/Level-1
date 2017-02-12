
// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {

		int randomvar = new Random().nextInt(4);

		// 2. Make a variable that will hold a random number and put a random number into this variable using "new
		// Random().nextInt(4)"

		// 3. Print out this variable
		System.out.println(randomvar);

		// 4. Get the user to enter a question for the 8 ball
		String question = JOptionPane.showInputDialog("Eneter yo question");

		// 5. If the random number is 0
		if (randomvar == 0) {
			JOptionPane.showMessageDialog(null, "INDEED SO");
		} else if (randomvar == 1) {
			JOptionPane.showMessageDialog(null, "INDEED SO S1KE!");
		} else if (randomvar == 2) {
			JOptionPane.showMessageDialog(null, "Y0 Y0u N33d T0 45K g00gl3");
		} else {
			JOptionPane.showMessageDialog(null, "SKRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRT");
		}

		// -- tell the user "Yes"

		// 6. If the random number is 1

		// -- tell the user "No"

		// 7. If the random number is 2

		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3

		// -- write your own answer
	}

}