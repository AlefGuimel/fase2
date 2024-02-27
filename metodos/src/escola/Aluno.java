package escola;


public class Aluno {
    private String nome;
    private String curso;
    private int idade;
    private int numeroMatricula;
    private static int contador = 10;

    public Aluno() {
        this.setNome("Alef");
        this.setCurso("Programação");
        this.setIdade(23);
    }

    public Aluno(String nome, String curso, int idade)
    {
        this.setNome(nome);
        this.setCurso(curso);
        this.setIdade(idade);
        this.numeroMatricula = contador++;
    }

public void addAluno(Aluno aluno){

}
public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}
public String getCurso(){
    return curso;
}

public void setCurso(String curso){
    this.curso = curso;
}

public int getIdade(){
    return idade;
}
public void setIdade(int idade){
    this.idade = idade;
}

public int getNumeroMatricula(){
    return numeroMatricula;
}

public void setNumeroMatricula(int numeroMatricula){

        this.numeroMatricula = numeroMatricula;
    }

    public void inputNome(String nome){
        this.setNome(nome);
    }
    public void inputIdade(int idade){
        this.setIdade(idade);
    }

    public void inputCurso(String curso){
        this.setCurso(curso);
    }

    public void status(){
        System.out.println(this.getNome());
        System.out.println(this.getCurso());
        System.out.println(this.getIdade());
        System.out.println(this.getNumeroMatricula());
    }

    @Override
    public String toString() {
        return "ALUNO: " + " NOME: " + nome + ", CURSO: " + curso + ", IDADE: " + idade + ", MATRICULA: ABC" + numeroMatricula;
    }
}



