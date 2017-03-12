import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class M0le {
	JPanel jpanel = new JPanel();
	JFrame frame = new JFrame();

	public static void main(String[] args) {
		M0le mole = new M0le();
		mole.createUI();
	}

	public void createUI() {
		frame.add(jpanel);
		frame.setSize(400, 500);
		frame.setVisible(true);
		JButton[] buttons = addMutipleJButtons();
	}

	public JButton[] addMutipleJButtons() {
		JButton[] buttons = new JButton[18];
		for (int i = 0; i < 18; i++) {
			buttons[i] = new JButton();
			jpanel.add(buttons[i]);
		}
		frame.setSize(300, 300);
		frame.setVisible(true);
		return buttons;
	}

}
