package Exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o raio do círculo: ");
		double raio = sc.nextDouble();
		
		double area;
		double pi = 3.14159;
		
		area = pi  * (raio = Math.pow(raio,2));
		
		System.out.printf("A área do círculo é: %.4f", area);
		
		
		
		sc.close();
	}

}
