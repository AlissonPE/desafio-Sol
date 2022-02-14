package seculoChallenge;

import java.util.Scanner;

public class resolvido {

    public static void main(String[] args) {

        //# Teste de Lógica - Desafio 1
        //O primeiro século vai do ano 1 até e incluindo o ano 100, o segundo século - do ano 101 até e incluindo * o ano 200, etc.
        //Dado um ano, retorne o século em que ele se encontra



    Scanner sc = new Scanner(System.in);
    solClass usuario = new solClass();
    System.out.println("Qual ano você gostaria de saber o século?");
    int ano = sc.nextInt();
    int resultado = usuario.calculaSeculo(ano);
    System.out.println(resultado);

    sc.close();




    }
}