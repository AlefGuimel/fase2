package corrida;

public class Carro {
    private String nome;
    private String marca;
    private int velocidade;
    public static String vencedor;

    public Carro(String nome, String marca, int velocidade) {
        this.nome = nome;
        this.marca = marca;
        this.velocidade = velocidade;
    }

    public static String correr(Carro a, Carro b){
        if (a.getVelocidade() > b.getVelocidade()){
            vencedor = a.toString();
        }
        else if (a.getVelocidade() < b.getVelocidade()){
            vencedor = b.toString();
        }
        return vencedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public static String getVencedor() {
        return vencedor;
    }

    public static void setVencedor(String vencedor) {
        Carro.vencedor = vencedor;
    }

    @Override
    public String toString() {
        return "Vencedor: " +
                "Nome: " + nome +
                ",  Marca: " + marca +
                ",  Velocidade: " + velocidade + "Km";
    }
}
