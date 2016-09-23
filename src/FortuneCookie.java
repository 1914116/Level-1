import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
	void ShowButton() {
		JFrame x = new JFrame();
		x.setVisible(true);
		JPanel y = new JPanel();
		JButton z = new JButton();
		z.setText("Fortune");
		z.addActionListener(this);
		y.add(z);
		x.add(y);
		x.pack();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FortuneCookie a = new FortuneCookie();
		a.ShowButton();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(4);
		switch (rand) {
		case 0:
			JOptionPane.showMessageDialog(null, "You will die in 5 minutes");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "You will become rich and famous");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "You will have great fortune today");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "You will have a terrible day tomorrow");
		}
	}

	private Object newRandom() {
		// TODO Auto-generated method stub
		return null;
	}

}
