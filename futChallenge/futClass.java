package futChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class futClass {
    int pontuacao = 0;
    int cArray = 0;
    String[] jogos = new String[10];
    Scanner sc = new Scanner(System.in);

    public void calculaJogos() {
        
        //# Teste de Lógica - Desafio 2
//Nosso time de futebol terminou o campeonato. O resultado de cada correspondência é semelhante a "x: y". Os resultados de todas as partidas são registrados na coleção.
//Por exemplo: [" 3: 1 "," 2: 2 "," 0: 1 ", ...]
//Escreva uma função que leve essa arrecadação e conte os pontos da nossa equipe no campeonato. Regras para contagem de pontos para cada partida:
//- se x> y - 3 pontos
//- se x <y - 0 ponto
//- se x = y - 1 ponto


        for (int contador = 1; contador <= 10; contador ++) {
            System.out.println("Digite o resultado do time X no jogo número: " + contador );
            int placarX = sc.nextInt();
            System.out.println("Digite o resultado do time Y no jogo número: " + contador );
            int placarY = sc.nextInt();

            if (placarX == placarY) {
                pontuacao += 1;
            }
            if (placarX > placarY) {
                pontuacao += 3;
            }
            if (placarY > placarX) {
                pontuacao +=  0;
            }

            jogos[cArray] = placarX + ": " + placarY;
            cArray++;
        }
        System.out.println(Arrays.toString(jogos));
        System.out.println("A pontuação do time X foi de: " + pontuacao);
    }
}