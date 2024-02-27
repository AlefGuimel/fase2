package ufc;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;




    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            System.out.println("A luta entre " + l1 + " e " + l2 + " foi aprovada");
        }
        else{
            this.aprovada = false;
            this.setDesafiado(null);
            this.setDesafiante(null);
            System.out.println("A luta não pôde ser aprovada");

        }


    }

    public void lutar(){
        if (this.aprovada){
            System.out.println("### Desafiado ###");
            this.getDesafiado().apresentar();
            System.out.println("### Desafiante ###");
            this.getDesafiante().apresentar();

            Random aletaorio = new Random();
            int vencedor = aletaorio.nextInt(3);

            switch(vencedor){
                case 0:
                    System.out.println("Empatou");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória do " + this.getDesafiado().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;

                case 2:
                    System.out.println("Vitória do " + this.getDesafiante().getNome());
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
            }


        }
        else{
            System.out.println("A luta não pode acontecer");
        }

    }

    public void setDesafiado(Lutador dd){
        this.desafiado = dd;
    }

    public Lutador getDesafiado(){
        return desafiado;
    }

    public void setDesafiante(Lutador dd){
        this.desafiante = dd;
    }

    public Lutador getDesafiante(){
        return desafiante;
    }








}
