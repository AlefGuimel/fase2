package universidadde;

public class Main {
    public static void main(String[] args) {

        /*Visitante v1 = new Visitante();
        v1.setNome("jorge");
        System.out.println(v1.toString());*/

       /* Aluno a1 = new Aluno();
        a1.setNome("Matheus");
        a1.setCurso("Programação");
        a1.setIdade(23);
        a1.setSexo("Masculino");
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setNome("Jose");
        b1.setBolsa(12.5);
        b1.pagarMensalidade();*/

        Tecnico t1 = new Tecnico();
        t1.setNome("Jose");
        t1.setIdade(23);
        t1.setSexo("M");
        t1.setCurso("Geografia");
        System.out.println(t1.toString());
        t1.praticar();
        t1.pagarMensalidade();

    }

}
