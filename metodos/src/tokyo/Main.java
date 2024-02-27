package tokyo;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String marca;
        String tipo;
        int ano;
        int portas;
        String choice;
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("Acionar Carro (c)");
            System.out.println("Adcionar Moto (m)");
            System.out.println("Ver garagem   (g)");
            System.out.println("Excluir       (e)");
            System.out.println("Sair          (s)");
            System.out.print("Escolha: ");
            choice = in.nextLine().toLowerCase();
            System.out.println("-----------------------");


            if (choice.equals("c")){
                System.out.print("Insira a marca: ");
                marca = in.nextLine();
                System.out.print("Insira o ano: ");
                ano = Integer.parseInt(in.nextLine());
                System.out.print("Portas: ");
                portas = Integer.parseInt(in.nextLine());
                Carro a = new Carro(marca,ano,portas);
                Veiculo.addVeiculo(a);
            }
            else if (choice.equals("m")){
                System.out.print("Insira a marca: ");
                marca = in.nextLine();
                System.out.print("Insira o ano: ");
                ano = Integer.parseInt(in.nextLine());
                System.out.print("Insira o tipo: ");
                tipo = in.nextLine();
                Moto b = new Moto(marca,ano,tipo);
                Veiculo.addVeiculo(b);

            }else if (choice.equals("g")){
                Veiculo.verGaragem();
            }
        }while(!(choice.equals("s")));

    }
}
