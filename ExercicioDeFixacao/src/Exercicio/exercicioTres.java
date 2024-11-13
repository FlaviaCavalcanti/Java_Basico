package Exercicio;

import java.util.Scanner;

public class exercicioTres {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, soma;
		System.out.println("BORA TOMAR UMA?: ");
		num1 = sc.nextInt();
		System.out.println("Digite um número inteiro: ");
		num2= sc.nextInt();
		soma = num1+num2;
		
		System.out.printf("A Soma de %d mais %d é = %d" ,num1, num2, soma);
		
		sc.close();
		

	}
}
