package programaescola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private int numeroMatricula;

    private static int contador = 3003;


    public Aluno(){
        this.nome = "João";
        this.idade = 43;
        this.curso = "Matematica";
        this.numeroMatricula = contador++;
    }

    public Aluno(String nome, String curso, int idade){
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
        this.numeroMatricula = contador++;
    }


    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getCurso(){
        return curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }



@Override
    public String toString(){
        return "Aluno: " + "Nome: " + nome + ", Idade: " + idade + ", Curso: " + curso + ", Matricula: " + "MM"+numeroMatricula;
}

}

