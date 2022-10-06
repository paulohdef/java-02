package unidade2;

import javax.swing.JOptionPane;

public class SerieHarmonica {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira o N da série harmônica: "));
		
		double somaHarmonica = 0;
		
		for(double i = 1.0; i<=n; i++) {
			somaHarmonica+= 1.0/i;

		}
		
		JOptionPane.showMessageDialog(null, "A soma harmônica é: "+somaHarmonica);
		
	}

}
