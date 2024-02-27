package seresVivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String animalName = "";
        String choice = "";
        String chamarPet = "";
        String matarPet = "";
        Scanner in = new Scanner(System.in);
        List<Animal> animalList = new ArrayList<>();

do {
    System.out.println("-------------------");
    System.out.println("Criar Gato     (g)");
    System.out.println("Criar Cachorro (c)");
    System.out.println("Ver pets       (p)");
    System.out.println("Chamar pet     (x)");
    System.out.println("Eutanásia      (m)");
    System.out.println("Sair ?       (s / n)");
    System.out.print("Escolha: ");
    choice = in.nextLine().toLowerCase();
    System.out.println("-------------------");

    if (choice.equals("g")){
        System.out.print("Escolha um nome para seu Gato: ");
        animalName = in.nextLine();
        Gato g = new Gato(animalName);
        animalList.add(g);
        System.out.print(g.nome + ": ");
        g.emitirSom();
    }
    else if (choice.equals("c")){
        System.out.print("Escolha um nome para seu Cachorro: ");
        animalName = in.nextLine().toLowerCase();
        Cachorro c = new Cachorro(animalName);
        animalList.add(c);
        System.out.print(c.nome + ": ");
        c.emitirSom();
    }
    else if (choice.equals("p")){
        for (int i = 0; i < animalList.size(); i++){
            System.out.println(animalList.get(i).nome);
        }
        if (animalList.isEmpty()){
            System.out.println("Você não tem pets para ver");
        }
    }
    else if (choice.equals("x")){
        System.out.print("Qual pet irá chamar: ");
        chamarPet = in.nextLine();

        for (int i = 0; i < animalList.size(); i++){
            if (chamarPet.equals(animalList.get(i).nome)){
                animalList.get(i).emitirSom();
            }
            if (!(chamarPet.equals(animalList.get(i).nome))){
                System.out.println("Você não tem um pet com esse nome!");
            }
        }
    }
    else if (choice.equals("m")){
        System.out.println("Qual animal você deseja assassinar: ");
        matarPet = in.nextLine();
        for (int i = 0; i < animalList.size(); i++){
            if (matarPet.equals(animalList.get(i).nome)){
                animalList.remove(i);
                System.out.println("Agora você é um assassino de animais!");
            }
            else{
                System.out.println("Você não tem esse pet");
            }

        }
    }

} while (!(choice.equals("s")));
    }
}
