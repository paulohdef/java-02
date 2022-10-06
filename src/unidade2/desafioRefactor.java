package unidade2;

import javax.swing.JOptionPane;

public class desafioRefactor {

	public static void main(String[] args) {
		int firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero A"));
		
		int secondNumber = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero B"));

		try {
			
			if(secondNumber < 0 ) 
				throw new Exception("Valor inválido");
	
			String operacao = JOptionPane.showInputDialog("Insira a operação desejada: (+, -, /, *) ");
			
			int resultado = switch(operacao) {
				case "+" -> resultado = firstNumber + secondNumber;
	
				case "-" -> resultado = firstNumber - secondNumber;
	
				case "/" -> resultado = firstNumber / secondNumber;
		
				case "*" -> resultado = firstNumber + secondNumber;
		
				default -> throw new Exception("Valor inválido");
					
			};
			
			JOptionPane.showMessageDialog(null, "O valor final é: "+resultado);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
		
	}
}
