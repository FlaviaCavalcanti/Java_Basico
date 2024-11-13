package javaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1C {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1,nota2,notaFinal;
		
		System.out.println("Informe a nota do primeiro semestre: ");
		nota1 = sc.nextDouble();
		System.out.println("Informe a nota do segundo semestre: ");
		nota2 = sc.nextDouble();
		
		notaFinal = nota1 + nota2;
		
		if(notaFinal> 60.0) {
			System.out.println("APROVADO!");
			System.out.printf("Nota final: %.1f",notaFinal);
		}
		else {
			System.out.println("REPROVADO!");
			System.out.printf("Nota final: %.1f", notaFinal);
		}
		
		sc.close();
		
	}

}
