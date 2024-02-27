package tokyo;

public class Moto extends Veiculo{
    private String tipo;
    public Moto(String marca, int ano, String tipo){
        super(marca,ano);
        this.setTipo(tipo);
        }

        public String getTipo(){
        return tipo;
        }
        public void setTipo(String tipo){
        this.tipo = tipo;
        }

        @Override
    public String toString(){
        return "Marca: " + marca + "\n" + "Ano: " + ano + "\n" + "Tipo: " + tipo;
    }
}
