package Exercicio;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hInicial,hFinal,duracao;

        System.out.println("Informe o horario inicial: ");
        hInicial = sc.nextInt();
        System.out.println("Informe o horario final: ");
        hFinal = sc.nextInt();

        duracao = hInicial + hFinal;

        if (duracao>24 || duracao<1) {
            System.out.println("Informe um horário valido");

            System.out.println("Informe o horario inicial: ");
            hInicial = sc.nextInt();
            System.out.println("Informe o horario final: ");
            hFinal = sc.nextInt();
            
            duracao = hInicial + hFinal;
        }
        else{
            System.out.println("O JOGO DUROU " + duracao +" HORAS" );
        }
        sc.close();

    }
}
