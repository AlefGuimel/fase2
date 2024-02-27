package banco;

public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("cp");
        p1.depositar(300f);
        p1.estadoAtual();


        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Marlene");
        p2.abrirConta("cc");
        p2.depositar(500f);
        p2.sacar(100f);
        p2.estadoAtual();









    }
}
