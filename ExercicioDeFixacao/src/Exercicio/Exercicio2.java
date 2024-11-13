package Exercicio;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
	
	/*Fazer um programa para ler as medidas da largura e comprimento de um terreno, 
	retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
	com duas casas decimal. Em seguida, o programa deve mostrar o valor da área do
	terreno, bem como o valor do preço do terreno, ambos com duas casas decimais	
	*/
	
		
		//JEITO SIMPLES DECLARANDO AS VARIAVEIS COM VALORES. 
	/* 
	double largura = 10.0;
	double comprimento = 30.0;
	double valorMetro = 200.00;
	double a, p;
	
	a = largura * comprimento;
	
	System.out.printf("A área do terreno é: %.2f%n", a);
	
	p = a * valorMetro;
	
	System.out.printf("O valor da área do terreno é: %.2f%n", p);
	
	
	*/
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a largura do terreno?");
		double largura = sc.nextDouble();
		System.out.println("Qual o comprimento do terreno?");
		double comprimento =sc.nextDouble();
		System.out.println("Qual o valor por metro quadrado?");
		double valorMetro= sc.nextDouble();
		double area, preco;
		
		
		area = largura * comprimento;
		preco = area * valorMetro;
		
		
		System.out.printf("A área do terreno é de: %.2f%n", area);
		System.out.printf("O Preço do terreno é de: %.2f%n", preco);
		
		sc.close();
	
	
	}
	
}
