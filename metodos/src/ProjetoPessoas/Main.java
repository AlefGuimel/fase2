package ProjetoPessoas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

List<Pessoa> lista = new ArrayList<>();

        Pessoa p1 = new Pessoa();
       Aluno p2 = new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();

       p1.setNome("Alef");
       p2.setNome("Maria");
       p3.setNome("Claudio");
       p4.setNome("Fabiana");

       p2.setCurso("Informatica");
       p3.setSalario(2500.7);
       p4.setSetor("Estoque");

       p1.setSexo("M");
       p1.setIdade(23);

       p2.setSexo("F");
       p2.setIdade(25);

       p3.setSexo("M");
       p3.setIdade(30);

       p4.setSexo("F");
       p4.setIdade(26);


        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
for (int i = 0; i < 10; i++){
    p1.setNome("Alef");
    p2.setNome("Maria");
    p3.setNome("Claudio");
    p4.setNome("Fabiana");
    lista.add(p1);
    System.out.println(p1.getNome());
}







    }






}
