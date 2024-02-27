package tokyo;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    protected int ano;
    protected String marca;
    private static List<Veiculo> veiculoList = new ArrayList<>();

    public Veiculo(String marca, int ano){
        this.setMarca(marca);
        this.setAno(ano);
    }

    public static void addVeiculo(Veiculo veiculo){
        veiculoList.add(veiculo);
    }
    public static void verGaragem(){
        if(veiculoList.isEmpty()){
            System.out.println("Você não tem veiculos a exibir");
        }
        else{
        for (int i = 0; i < veiculoList.size(); i++) {
            System.out.println(veiculoList.get(i).toString());
            System.out.println("-----------------------");
        }
        }

    }
    public static void excluirVeiculo(Veiculo veiculo){
        if( veiculoList.contains(veiculo)){
            veiculoList.remove(veiculo);
        }
        else{
            System.out.println("Veiculo não encontrado");
        }

    }




    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
}
