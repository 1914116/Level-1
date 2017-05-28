package Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FortuneCookie fortune = new FortuneCookie();
		fortune.showButton();
	}
	public void showButton(){
		JFrame jFrame = new JFrame();
		JButton jButton = new JButton();
		jFrame.setVisible(true);
		jFrame.add(jButton);
		jFrame.pack();
		jButton.addActionListener(this);
		jButton.setText("Fortune");

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String t;
		int rand = new Random().nextInt(5);
		if(rand== 0){
		t= "You will become wealthy";	
		}
		else if(rand ==1){
			t = "You will become famous";
		}
		else if(rand==2){
			t = "You will travel the world.";
		}
		else if(rand== 3){
			t= "You will live for very long";
			}
		else{
			t= "You will win the lottery.";
		}
		JOptionPane.showMessageDialog(null, t);
	}
}
