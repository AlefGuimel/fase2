import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class Tabuada {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random gerador = new Random();

        int numero1;
        int numero2;
        int resposta = 0;
        int pontos = 0;
        String continuar;
        String nome;


        out.println("Hola, seja bem vindo ao Tabuadex");
        out.print("Como posso chama-lo ? : ");
        nome = in.nextLine();
        out.println("É um prazer conhece-lo " + nome);
        out.println("Vamos testar seus conhecimentos em tabuada!");
        out.println("Para cada acerto, um ponto!");


do {
    numero1 = gerador.nextInt(9);
    numero2 = gerador.nextInt(9);

    out.print("Quanto é " + numero1 + " X " + numero2 + " :");

    try {resposta = Integer.parseInt(in.nextLine());}
    catch (Exception e){out.println(" ");}

    if (resposta == numero1 * numero2) {
        out.println("Parabéns " + nome + " acertou !");
        pontos++;
        out.println("Pontos: " + pontos);
    } else {
        out.println("Errou!");
        pontos = 0;
        out.println("Pontos: " + pontos);
    }

    out.print("Deseja continar ? (s / n) ");
    continuar = in.nextLine();
    continuar.toLowerCase();

}   while(continuar.equals("s"));















    }



}
