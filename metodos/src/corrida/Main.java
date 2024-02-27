package corrida;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sairDaCorrida = "s";
        int numero1 = (int) (Math.random() * 10);
        int numero2 = (int) (Math.random() * 10);
        int numero3 = (int) (Math.random() * 10);



        Carro a = new Carro("Veyron", "Bugatti", 220);
        Carro b = new Carro("F1", "McLaren", 230);
        Carro c = new Carro("Gallardo", "Lamborghini", 225);
        Carro d = new Carro("California", "Ferrari", 237);
        Carro corredorUm = a;
        Carro corredorDois = b;

        String choiceUm;
        String choiceDois;
        do {
            Random gerador = new Random();
            gerador.doubles(10);

            System.out.println("Selecione o Carro:");
            System.out.println("(a) " + a.getNome());
            System.out.println("(b) " + b.getNome());
            System.out.println("(c) " + c.getNome());
            System.out.println("(d) " + d.getNome());
            System.out.print("Escolha o primeiro corredor: ");
            choiceUm = in.nextLine().toLowerCase();
            if (choiceUm.equals("a")){
                corredorUm = a;
            }
            else if (choiceUm.equals("b")){
                corredorUm = b;
            }
            else if (choiceUm.equals("c")){
                corredorUm = c;
            }
            else if (choiceUm.equals("d")){
                corredorUm = d;
            }

            System.out.print("Escolha o segundo corredor: ");
            choiceDois = in.nextLine().toLowerCase();
            if (choiceDois.equals("a")){
                corredorDois = a;
            }
            else if (choiceDois.equals("b")){
                corredorDois = b;
            }
            else if (choiceDois.equals("c")){
                corredorDois = c;
            }
            else if(choiceDois.equals("d")){
                corredorDois = d;
            }

            System.out.println(Carro.correr(corredorUm, corredorDois));
            System.out.println("Tempo: " + numero1 + ":" + numero2 + numero3 );


            System.out.println("Deseja sair da corrida ? ( s / n)");
            sairDaCorrida = in.nextLine().toLowerCase();

        }
        while (!(sairDaCorrida.equals("s")));
}
}
