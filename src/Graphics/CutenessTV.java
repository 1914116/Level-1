package Graphics;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements MouseListener {
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JButton b1 = new JButton();
	private JButton b2 = new JButton();
	private JButton b3 = new JButton();

	void runTV() {
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		frame.setVisible(true);
		b1.setText("Ducks");
		b2.setText("Frog");
		b3.setText("Fluffy Unicorns");
		frame.pack();
		b1.addMouseListener(this);
		b2.addMouseListener(this);
		b3.addMouseListener(this);
		frame.setDefaultCloseOperation(3);
	}

	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=e3PdcKcUvDY");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=1WgeW7gy4xo");
	}

	void showFluffyUnicorns() {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI(videoID + "/autoplay");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
			showDucks();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b2) {
			showFrog();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b3) {
			showFluffyUnicorns();
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
