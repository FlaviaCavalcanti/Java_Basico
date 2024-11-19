package Exercicio;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            int a, b, resultado;

            System.out.println("Digite um número inteiro");
            a = sc.nextInt();
            System.out.println("Digite um número inteiro");
            b = sc.nextInt();

            if( a % b == 0 || b % a == 0){
                System.out.println("São Multiplos");

            }
                else{
                    System.out.println("Não são Multiplos");
                }

        sc.close();
    }
}
