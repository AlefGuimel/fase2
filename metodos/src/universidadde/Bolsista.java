package universidadde;

public class Bolsista extends Aluno{
    private double bolsa;
    public void renovarBolsa(){
        System.out.println("Renovando Bolsa de " + this.getNome());
    }
public double getBolsa(){
    return bolsa;
        }
public void setBolsa(double bolsa){
        this.bolsa = bolsa;
}


@Override
    public void pagarMensalidade(){
    System.out.println(this.getNome() + " é bolsista! Pagamento facilitado");

}
}
