package Graphics;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	JFrame calculator = new JFrame();
	JPanel calc = new JPanel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton div = new JButton();
	JButton mul = new JButton();
	JTextField x = new JTextField();
	JTextField y = new JTextField();
	JLabel ans = new JLabel();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Calculator c = new Calculator();
	 c.showCalculator();
	}
void showCalculator(){
	calculator.add(calc);
	calc.add(x);
	calc.add(add);
	calc.add(sub);
	calc.add(div);
	calc.add(mul);
	calc.add(y);
	calc.add(ans);
	add.setText("addition");
	sub.setText("subtract");
	mul.setText("multiply");
	div.setText("divide");
	calculator.setVisible(true);
	calculator.setSize(500, 150);
	x.setPreferredSize(new Dimension(50,25));
	y.setPreferredSize(new Dimension(50,25));
}
}

