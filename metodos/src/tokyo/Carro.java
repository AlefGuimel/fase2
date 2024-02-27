package tokyo;

public class Carro extends Veiculo{
    private int numeroPortas;
    public Carro(String marca, int ano, int numeroPortas){
        super(marca,ano);
        this.setNumeroPortas(numeroPortas);
    }

    public int getNumeroPortas(){
        return numeroPortas;
    }
    public void setNumeroPortas(int numeroPortas){
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String toString(){
        return "Marca: " + marca + "\n" + "Ano: " + ano + "\n" + numeroPortas + " Portas";
    }

}
