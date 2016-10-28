package Graphics;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	NastySurprise variable = new NastySurprise();
	variable.show();
	
	}
void show(){
	JFrame A = new JFrame();
	JPanel a = new JPanel();
	JButton B = new JButton();
	JButton b = new JButton();
	A.setVisible(true);
	A.add(a);
	a.add(B);
	a.add(b);
	B.setText("Trick");
	b.setText("Treat");
	A.pack();
	
}

private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
