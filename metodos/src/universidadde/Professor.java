package universidadde;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public void receberAumento(double aumento){
        this.salario += aumento;
    }

}
