package escola;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunoList = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        String escolha = null;
        String nome;
        String curso;
        int idade;
        boolean encontrei = false;
        String nomeAProcurar = "";

        do {
            System.out.println("----------MENÚ----------");
            System.out.println("    Adcionar Aluno (A)");
            System.out.println("      Exibir Aluno (E)");
            System.out.println("     Excluir Aluno (X)");
            System.out.println("              Sair (S)");
            System.out.print("Escolha: ");
            escolha = in.nextLine();
            escolha = escolha.toLowerCase();
            System.out.println("-------------------------");

            if (escolha.equals("a"))
            {
                System.out.print("Insira o nome do Aluno: ");
                nome = in.nextLine();
                System.out.print("Insira o curso do Aluno: ");
                curso = in.nextLine();
                System.out.print("Insira a idade do Aluno: ");
                idade = Integer.parseInt(in.nextLine());
                Aluno aluno = new Aluno(nome, curso, idade);
                alunoList.add(aluno);

                for (int i = 0; i < alunoList.size(); i++){
                    System.out.println(alunoList.get(i));

                }

            }
            if (alunoList.isEmpty() && !escolha.equals("s")){
                System.out.println("A lista esta vazia!");
            }

            else if (escolha.equals("e"))
            {
                System.out.print("Insira o nome do Aluno: ");
                nomeAProcurar = in.nextLine();

                for (int i = 0; i < alunoList.size(); i++){
                    if(nomeAProcurar.equals(alunoList.get(i).getNome()))
                    {
                        System.out.println(alunoList.get(i));
                    }
                    if (!(nomeAProcurar.equals(alunoList.get(i).getNome()))){
                        System.out.println("Aluno não encontrado");
                    }

                }
            }

            else if (escolha.equals("x")) {
                System.out.print("Insira o nome do Aluno: ");
                nomeAProcurar = in.nextLine();

                for (int i = 0; i < alunoList.size(); i++) {
                    if (nomeAProcurar.equals(alunoList.get(i).getNome())){
                        alunoList.remove(i);
                        System.out.println("Aluno exlcuído!");
                        encontrei = true;
                    }
                }

                if(!encontrei) {
                    System.out.println("Aluno não encontrado");
                }
            }
        }
        while (!(escolha.equals("s")));
    }
}