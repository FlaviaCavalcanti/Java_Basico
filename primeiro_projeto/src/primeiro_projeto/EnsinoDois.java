package primeiro_projeto;

import java.util.Scanner;

public class EnsinoDois {
	
		public static void main(String[] args) {
			
			// Aprendendo a ler uma palavra
			/*      Scanner sc = new Scanner(System.in);
			
			String teste;
			teste = sc.next();
			System.out.println("Você digitou : " + teste);
			
			sc.close();      */
			
			//      Aprendendo a ler um número
			/*			Scanner sc = new Scanner(System.in);
			int x;
			x =sc.nextInt();
			System.out.println("Você digitou: " + x);
			sc.close();    */
			
			/*   Scanner sc = new Scanner(System.in);
			double y;
			y = sc.nextDouble();
			//System.out.println("Você digitou: "+ y);
			
			System.out.printf("Você digitou: %.1f%n", y);
			sc.close();      */
			
			/*   Scanner sc = new Scanner(System.in);
			char y;
			y=sc.next().charAt(0);
			System.out.println("Você digitou: "+ y);
			sc.close();     */
			
			/*   Scanner sc = new Scanner(System.in);
			String x;
			int y;
			double z;
			
			x = sc.next();
			y = sc.nextInt();
			z = sc.nextDouble();
			
			System.out.println("Dados digitados: ");
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			
			sc.close();     */
			
			Scanner sc = new Scanner(System.in);
			
			String s1,s2,s3;
			
			s1 = sc.nextLine();
			s2 = sc.nextLine();
			s3 = sc.nextLine();

			System.out.println("Dados digitados:");
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);

			
			
			sc.close();
			
	}
}
