package unidade2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class RegexEmail {

	public static void main(String[] args) {
		
		 String regex = "\\w++@\\w++.\\w++(.\\w++)*+";
		
		 String texto = JOptionPane.showInputDialog("Insira o texto a ser testado pelo regex: ");
		
		 boolean b = Pattern.matches(regex, texto);
		 
		 System.out.println(b);
		 

	}

}
