
package Graphics;

	import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
	import java.net.URL;

	import javax.swing.Icon;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;

	public class NastysSurprise implements ActionListener {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		NastysSurprise variable = new NastysSurprise();
		variable.show();
			
		}
		JButton B = new JButton();
		JButton b = new JButton();
	void show(){
		JFrame A = new JFrame();
		JPanel a = new JPanel();
		A.setVisible(true);
		A.add(a);
		a.add(B);
		a.add(b);
		B.setText("Trick");
		b.setText("Treat");
		A.pack();
		B.addActionListener(this);
		b.addActionListener(this);
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
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button= (JButton) e.getSource();
		if(button == B){
			showPictureFromTheInternet("http://static.boredpanda.com/blog/wp-content/uuuploads/cute-baby-animals/cute-baby-animals-10.jpg");
		}
		if(button==b){
			showPictureFromTheInternet("http://static3.businessinsider.com/image/56feb17752bcd01b008ba4e8-480/donald-trump.jpg");
		}
	}

	}


