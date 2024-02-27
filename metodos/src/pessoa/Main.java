package pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("João");
        p2.setNome("Mario");
        p3.setNome("Jorge");
        p4.setNome("Fabiana");

        p2.setCurso("Programação");
        p3.setSalario(471.53);
        p4.setSetor("Almoxarifado");

        p3.receberAumento(550.51);
        

        p1.setSexo("Masculino");
        p2.setSexo("Masculino");
        p3.setSexo("Masculino");
        p4.setSexo("Feminino");

        p1.setIdade(34);
        p2.setIdade(45);
        p3.setIdade(28);
        p4.setIdade(23);

        System.out.println(p4.getTrabalhando());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());




    }
}
