package Exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		
		int num, horas;
		double vHora, salario;
		
		System.out.println("Informe o número do funcionário: ");
		num = sc.nextInt();
		System.out.println("Informe as horas trabalhadas: ");
		horas = sc.nextInt();
		System.out.println("Informe o valor que o funcionário recebe por hora: ");
		vHora = sc.nextDouble();
		
		salario = horas * vHora;
		
		System.out.printf("O funcionário: %d, receberá: %.2f", num, salario);
		

	}

}
