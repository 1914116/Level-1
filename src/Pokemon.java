
import javax.swing.JOptionPane;

public class Pokemon {
	String pokemon;
	String move;

	Pokemon(String pokemon, String move) {
		this.pokemon = pokemon;
		this.move = move;
	}
	 void call(){
		JOptionPane.showMessageDialog(null, pokemon+" I choose you!");
	}
	 void attack(){
		 JOptionPane.showMessageDialog(null, "Use "+move+"!");
	 }

		public static void main(String[] args) {
			
		}	
}
	