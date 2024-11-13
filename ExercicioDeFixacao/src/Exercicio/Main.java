package Exercicio;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String produto1 = "Computador";
		String produto2 = "Mesa de Escritório";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medir = 52.234567;
		
		
		System.out.println("Produtos: ");
		System.out.println("");
		System.out.println(produto1 + ", cujo o preço é : " + preco1);
		System.out.println(produto2 + ", cujo preço é R$: " + preco2);
		System.out.println("");
		System.out.println("-----------------------------------");
		
		System.out.printf("Registro: %n%d anos, código: %d e gênero: %s %n", idade, codigo, genero);
		
		System.out.println("-----------------------------------");
		
		System.out.printf("%nMedida com oito casas decimais: %.8f %n",medir);
		System.out.printf("Medida com três casas decimais: %.3f %n %n", medir);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("Medida com três casas decimais(Ponto): %.3f %n", medir);

		
		
	}

}
