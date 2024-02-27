package banco;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());

    }
    // Métodos

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);

        if (tipo.equals("cc"))
        {
        this.setSaldo(50);
        }
        else if (tipo.equals("cp"))
        {
        this.setSaldo(150);
        }



    }
    public void fecharConta(){
        if (this.getSaldo() > 0)
        {
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
        }
        else if (this.getSaldo() < 0)
        {
            System.out.println("Conta em débito");
        }
        else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso ");
        }

    }
    public void depositar(float valor) {
        if (this.getStatus())
        {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }
        else{
            System.out.println("Impossivel realizar depósito");
        }


    }

    public void sacar(float valor){
        if (getStatus())
        {
            if (this.getSaldo() >= valor)
            {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }
            else
            {
                System.out.println("Saldo insuficiente para saque");
            }
        }
        else
        {
            System.out.println("Impossivel sacar de uma conta fechada");
        }

    }
    public void pagarMensalidade(){
        int valor = 0;
        if (this.getTipo().equals("cc"))
        {
         valor = 12;
        }
        else if (this.getTipo().equals("cp"))
        {
            valor = 20;
        }
        if (this.getStatus())
        {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Taxa paga com sucesso por " + this.getDono());
        }
        else {
            System.out.println("Impossivel pagar mensalidade");
        }
            


    }
// Métodos especiais
    public void ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    public int getNumConta(){
        return numConta;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public String getDono(){
        return dono;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean getStatus(){
        return status;
    }





}
