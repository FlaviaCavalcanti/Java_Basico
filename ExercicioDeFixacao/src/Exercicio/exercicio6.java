package Exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a,b,c,triangulo, circulo, trapezio, quadrado,retangulo;
		
		a= sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		triangulo = a*c/2;
		circulo = c * c * 3.141519;
		trapezio = ((a+b)*c)/2;
		quadrado = b*b; 
		retangulo = a*b;
		
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

		
		
		sc.close();
		
	}
}
