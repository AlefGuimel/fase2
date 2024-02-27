package programaescola;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static boolean encontrei = false;

    public static void main(String[] args) {


    String inputNome;
    int inputIdade;
    String inputCurso;
    String escolha;
    String nomeAprocurar;


    Scanner in = new Scanner(System.in);
    List<Aluno> alunoList = new ArrayList<>();

    do {

                System.out.println("----------Menu----------");
                System.out.println(" Adcionar Aluno ( A ) ");
                System.out.println("  Excluir Aluno ( X ) ");
                System.out.println("   Exibir Aluno ( E )");
                System.out.println("           Sair ( S )");
                System.out.println("   Mostrar Lista( L )");
                System.out.print("Escolha: ");
                escolha = in.nextLine();
                escolha = escolha.toLowerCase();
                System.out.println("------------------------");


                if (escolha.equals("a"))
                    {
                        System.out.print("Insira o nome: ");
                        inputNome = in.nextLine();
                        System.out.print("Insira o curso: ");
                        inputCurso = in.nextLine();
                        System.out.print("Insira a idade: ");
                        inputIdade = Integer.parseInt(in.nextLine());


                        Aluno aluno = new Aluno(inputNome, inputCurso, inputIdade);
                        alunoList.add(aluno);

                    }
                else if (escolha.equals("x") && !alunoList.isEmpty())
                {
                    System.out.print("Insira o nome a excluir: ");
                    nomeAprocurar = in.nextLine();
                    for (int i = 0; i < alunoList.size(); i++)
                    {
                        if (nomeAprocurar.equals(alunoList.get(i).getNome()))
                        {
                            alunoList.remove(i);
                            System.out.println("Removido");
                        }


                    }


                }
                else if (escolha.equals("e") && !alunoList.isEmpty())
                {
                    System.out.println("Insira o nome: ");
                    nomeAprocurar = in.nextLine();
                    for (int i = 0; i < alunoList.size(); i++)
                    {
                        if (nomeAprocurar.equals(alunoList.get(i).getNome()))
                        {
                            System.out.println(alunoList.get(i).toString());
                            encontrei = true;
                        }
                    }
                    if(!encontrei){
                        System.out.println("Não encontrado");
                    }

                }
                else if (escolha.equals("l")){
                    for (int i = 0; i < alunoList.size(); i++) {
                        System.out.println(alunoList.get(i).toString());
                    }
                }

    }
    while (!escolha.equals("s")) ;


    }

}
