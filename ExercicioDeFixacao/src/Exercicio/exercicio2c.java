package javaBasico;

import java.util.Scanner;

public class exercicio2c {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número inteiro: ");
		int num = sc.nextInt();
		if(num<0){
			System.out.println("Negativo");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
		
		
		
		
		
		sc.close();
	}

}
