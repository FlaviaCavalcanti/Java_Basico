/**
 * 
 */
package primeiro_projeto;

import java.util.Locale;

public class Main {

	
	public static void main(String[] args) {
		
		int a = 24;
		double b = 10.2411;		
		String nome = "Maria";
		int idade = 30;
		Double renda = 4000.0;
		String sobrenome = "Ferraz";
		
		System.out.println("Número da primeira variável: " + a);
		System.out.println("Número da segunda variável: " + b);
		
		System.out.printf("Segunda variável com duas casas decimais: ");
		System.out.printf("%.2f%n", b); //com duas casas decimais
		
		Locale.setDefault(Locale.US); //Comando para trocar a virgula por ponto. 
		System.out.printf("%.2f%n", b);
		
		System.out.printf("Segunda variável com duas casas decimais: " + "%.2f%n", b);
		System.out.printf("Segunda variável com duas casas decimais: %.2f resultado %n", b);
		
		System.out.printf("Segunda variável com duas casas decimais: %f <= resultado %n ", b);

		System.out.println("----------------------");
		System.out.printf("%s %s tem %d anos e ganha R$ %f Reais %n", nome, sobrenome, idade, renda);
		
		
		
		
		
		
		
		
		
	}

}
