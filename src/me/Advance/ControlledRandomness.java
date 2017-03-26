package me.Advance;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ControlledRandomness {
	private Random random = new Random();
	private int increment = 1;
	private boolean isPlaying = true;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	private int askTimes = Integer.parseInt(JOptionPane.showInputDialog("How many lines?"));
	private ArrayList<String> strList = new ArrayList<String>();
	public static void main(String[] args) {
		ControlledRandomness randomness = new ControlledRandomness();
		randomness.setWindow();
		randomness.doMain();
	}
	public void doMain() {
		for (int i = 0; i < askTimes; i++) {
			int rand = random.nextInt(10);
			if(i == 0) {
				strList.add(Integer.toString(rand));
			}
			else {
				strList.add(strList.get(i - 1) + rand);
			}
		}
		for (String i :strList) {
			if((strList.lastIndexOf(i) % 2) == 0) {
				System.out.println(i);
			}
			else {
				System.out.println(i);
			}
		}
	}
	public void setWindow() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.setVisible(true);
		button1.setOpaque(true);
		button2.setOpaque(true);
		button3.setOpaque(true);
		button4.setOpaque(true);
		button1.setBackground(Color.RED);
		button2.setBackground(Color.BLUE);
		button3.setBackground(Color.GREEN);
		button4.setBackground(Color.YELLOW);
		frame.pack();
	}
	public void initSequence() {
		while(isPlaying == true) {
			
		}
	}

}
