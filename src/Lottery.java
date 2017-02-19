import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {
		int[] array = new int[4];
		array[0] = 3;
		array[1] = 5;
		array[2] = 7;
		array[3] = 9;
		int[] array2 = { 9, 7, 5, 3 };

		int test = Integer.parseInt(JOptionPane.showInputDialog("Enter a number 0-80"));
		int count = 0;
		for (int i = 0; i < 1000000; i++) {
			int number, bleh;
			number = new Random().nextInt(80);
			bleh = new Random().nextInt(80);
			int numbermatch = new Random().nextInt(80);
			if (number == numbermatch && bleh == numbermatch) {
				++count;
			}

		}
		System.out.println(compare(test, array));
		System.out.println(compareArrays(array, array2) + "!");
		System.out.println("Your number occured " + count + " out of a million times! " + "That's " + (double) count / 10000 + "%");
		a125485355();
	}

	public static boolean compare(int num, int[] numz) {
		for (int i : numz) {
			if (i == num) {
				return true;
			}
		}
		return false;
	}

	public static boolean compareArrays(int[] ar1, int[] ar2) {
		if (ar1.length != ar2.length) {
			return false;
		}
		int count = 0;
		for (int i : ar1) {
			if (compare(i, ar2)) {
				++count;
			}
		}
		if (count == ar1.length) {
			return true;
		}
		return false;
	}

	public static void a125485355() {
		int times = 0;
		int[] ar1 = new int[6];
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter a message"));
		}
		boolean running = true;
		while (running) {
			++times;

			int[] ar2 = new int[6];
			for (int i = 0; i < 6; i++) {

				int random = new Random().nextInt(80);
				ar2[i] = random;

			}
			if (compareArrays(ar1, ar2)) {
				running = false;
			}
			System.out.println(times);
		}

	}
}
