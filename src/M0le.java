import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class M0le implements ActionListener {
	JPanel jpanel = new JPanel();
	JFrame frame = new JFrame();
	JButton[] allButtons;
	private int hitCount;
	private int insultCount;
	private Date StartDate;

	public static void main(String[] args) {
		M0le mole = new M0le();
		mole.createUI();

	}

	public void createUI() {
		frame.add(jpanel);
		frame.setSize(400, 500);
		frame.setVisible(true);
		frame.setTitle("Whacka m0le");
		JButton[] buttons = addMutipleJButtons();
		allButtons = buttons;
		StartDate = new Date();
	}

	public JButton[] addMutipleJButtons() {
		JButton[] buttons = new JButton[24];
		for (int i = 0; i < 24; i++) {
			buttons[i] = new JButton();
			buttons[i].addActionListener(this);
			jpanel.add(buttons[i]);
		}
		int selectRandom = new Random().nextInt(24);
		buttons[selectRandom].setText("mole!");
		frame.setSize(300, 300);
		frame.setVisible(true);
		return buttons;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (!buttonPressed.getText().equalsIgnoreCase("mole!")) {
			// speak("No!");
			System.out.println("No!");
			insultCount++;
			if (insultCount == 2) {
				System.out.println("HAHAHAHAHAHahaah");
			} else if (insultCount == 3) {
				System.out.println("EZZZZZZZZZZZZZZZZzZZZzzzZZZzzzZ");
			}
		} else {
			hitCount++;
			insultCount = 0;
			// playSound("mfewef.wav");
		}
		for (JButton button : allButtons) {
			if (button.getText().equalsIgnoreCase("mole!")) {
				button.setText("");
			}

		}
		int selectRandom = new Random().nextInt(24);
		allButtons[selectRandom].setText("mole!");
		if (hitCount == 10) {
			frame.dispose();
			endGame(StartDate, hitCount);
		}

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is " + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		System.exit(1);
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
