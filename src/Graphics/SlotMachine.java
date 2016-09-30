package Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JLabel D = new JLabel();
	JLabel A = new JLabel();
	JLabel B = new JLabel();
	JLabel C = new JLabel();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SlotMachine slot = new SlotMachine();
		slot.showSlotMachine();
		
	}
public void showSlotMachine(){
	JFrame X = new JFrame();
	JPanel b = new JPanel();
	
	JButton Y = new JButton();
	X.add(b);
	b.add(Y);
	X.setVisible(true);
	Y.setText("Spin");
	b.add(A);
	b.add(B);
	b.add(C);
	A.setText("1");
	B.setText("2");
	C.setText("3");
	b.add(D);
	D.setText("WIN!");
	X.setSize(200, 200);
	Y.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	int j = new Random().nextInt(3);
	int h = new Random().nextInt(3);
	int f = new Random().nextInt(3);
	A.setText(j+"");
	B.setText(h+"");
	C.setText(f+"");
	if(j == h&&h== f){
		D.setText("Winner");
	}
	else{
		D.setText("You Lose");
	}
	}
	}



