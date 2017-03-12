import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pane implements ActionListener {
	JFrame frame = new JFrame();
	JButton button1 = new JButton("Double");
	JButton button2 = new JButton("Square");
	JTextField jfield = new JTextField();
	JPanel panel = new JPanel();

	public static void main(String[] args) {
		Pane pane = new Pane();
		pane.createUI();

	}

	public void createUI() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(jfield);
		frame.setVisible(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		jfield.setEditable(true);
		jfield.setText("Enter Number!");
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		try {
			if (buttonPressed == button1) {
				int textNum = Integer.parseInt(jfield.getText());
				textNum *= 2;
				jfield.setText(String.valueOf(textNum));
				JOptionPane.showMessageDialog(null, textNum);
			} else if (buttonPressed == button2) {
				int textNum = Integer.parseInt(jfield.getText());
				textNum *= textNum;
				jfield.setText(String.valueOf(textNum));
				JOptionPane.showMessageDialog(null, textNum);
			}
		} catch (Exception error) {
			jfield.setText("Enter Number!");
		}

	}

}
